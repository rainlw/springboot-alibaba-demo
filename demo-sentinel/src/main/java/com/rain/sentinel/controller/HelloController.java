package com.rain.sentinel.controller;

import com.alibaba.csp.sentinel.Entry;
import com.alibaba.csp.sentinel.SphU;
import com.alibaba.csp.sentinel.Tracer;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;


/**
 * @author ZhangYu
 * @date 2022/9/15
 */
@RestController
public class HelloController {

    private static final String RESOURCE_NAME = "index";

    private static final String USER_RESOURCE_NAME = "user";

    @RequestMapping(value = "/index")
    public String index(){
        Entry entry = null;

        try {
            entry = SphU.entry(RESOURCE_NAME);
            String str = "Hello Kitty";
            return str;
        } catch (BlockException e) {
            return "流控";
        } catch (Exception ex){
            Tracer.traceEntry(ex, entry);
        } finally {
            if (entry != null){
                entry.exit();
            }
        }
        return null;
    }

    @PostConstruct
    private static void initFlowRules(){
        List<FlowRule> list = new ArrayList<>();

        FlowRule rule = new FlowRule();
        rule.setRefResource(RESOURCE_NAME);
        rule.setGrade(RuleConstant.FLOW_GRADE_QPS);
        rule.setCount(1);
        list.add(rule);

        FlowRule rule2 = new FlowRule();
        rule2.setRefResource(USER_RESOURCE_NAME);
        rule2.setGrade(RuleConstant.FLOW_GRADE_QPS);
        rule2.setCount(1);
        list.add(rule2);
        //加载配置好的规则
        FlowRuleManager.loadRules(list);
    }

    @GetMapping(value = "/user")
    @SentinelResource(value = USER_RESOURCE_NAME, blockHandler = "blockHandlerForGetUser")
    public String user(){

        return "rain";
    }

    public String blockHandlerForGetUser(BlockException ex){
        ex.printStackTrace();
        return "被流控了";
    }
}
