package org.rain.service.impl;

import org.rain.entity.OrderEntity;
import org.rain.mapper.OrderMapper;
import org.rain.param.req.OrderDTO;
import org.rain.service.OrderService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ZhangYu
 * @date 2022/7/13
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper mapper;

    @Override
    public void saveOrder(OrderDTO orderDTO) {
        if (orderDTO == null){
            return;
        }
        OrderEntity order = new OrderEntity();
        BeanUtils.copyProperties(orderDTO, order);
        mapper.insert(order);
    }

    @Override
    public List<OrderEntity> getList() {
        List<OrderEntity> list = mapper.selectList(null);
        return list;
    }

    @Override
    public String getJson(Long id) {
        return mapper.selectJson(id);
    }
}
