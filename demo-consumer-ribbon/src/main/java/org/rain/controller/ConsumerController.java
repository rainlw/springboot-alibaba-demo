package org.rain.controller;

import org.rain.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZhangYu
 * @date 2022/7/13
 */
@RestController
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;

    @GetMapping("order/info/{id}")
    public String getJson(@PathVariable(value = "id") Long id){
        return consumerService.getJson(id);
    }
}
