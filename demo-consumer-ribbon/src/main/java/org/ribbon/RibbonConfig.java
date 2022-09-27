package org.ribbon;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ZhangYu
 * @date 2022/9/14
 */
@Configuration
public class RibbonConfig {

    @Bean
    public IRule iRule(){
        // return new RoundRobinRule(); 轮询
        return new RandomRule();//随机
    }
}
