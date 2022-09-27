package org.rain.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author ZhangYu
 * @date 2022/7/13
 */
@Component
@FeignClient(value = "demo-producer")
public interface ConsumerService {

    @GetMapping("employee/info/{id}")
    String getJson(@PathVariable(value = "id") Long id);
}
