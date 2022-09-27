package org.rain.service;

import org.rain.entity.OrderEntity;
import org.rain.param.req.OrderDTO;

import java.util.List;

/**
 * @author ZhangYu
 * @date 2022/7/12
 */
public interface OrderService {

    void saveOrder(OrderDTO orderDTO);

    List<OrderEntity> getList();

    String getJson(Long id);
}
