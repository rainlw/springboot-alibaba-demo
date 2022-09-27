package org.rain.controller;

import org.rain.param.req.EmployeeDTO;
import org.rain.param.req.OrderDTO;
import org.rain.service.EmployeeService;
import org.rain.service.OrderService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author ZhangYu
 * @date 2022/7/12
 */
@RestController
public class ProducerController {

    @Value("${server.port}")
    private String severPort;

    @Resource
    private EmployeeService employeeService;

    @Resource
    private OrderService orderService;

    @GetMapping("getStr")
    public String getString(){
        return "Hello moon";
    }

    @PostMapping("employee/save")
    public void saveEmployee(@RequestBody EmployeeDTO employeeDTO){
        try {
            employeeService.saveEmployee(employeeDTO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping("employee/list")
    public Object getList(){
        try {
            return employeeService.getList();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping("employee/info/{id}")
    public String getJson(@PathVariable(value = "id") Long id){
        try {
            return employeeService.getJson(id) + ":"+ severPort;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    @PostMapping("order/create")
    public void createOrder(@RequestBody OrderDTO orderDTO){
        String str ="{\"hobby\": \"羽毛球\",\"hometown\":\"武汉\"}";
        orderService.saveOrder(orderDTO);
    }

    @GetMapping("order/list")
    public Object getOrderList(){
        return orderService.getList();
    }
}
