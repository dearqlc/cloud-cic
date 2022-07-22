package com.example.orderservice.service.impl;

import com.example.feign.clients.IUserClient;
import com.example.feign.entity.User;
import com.example.orderservice.entity.Order;
import com.example.orderservice.mapper.IOrderMapper;
import com.example.orderservice.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author QLC
 */
@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private IOrderMapper orderMapper;

    @Autowired
    private IUserClient userClient;

    @Override
    public Order findById(Integer id) {
        Order order = orderMapper.findById(id);
        User user = userClient.findById(order.getUserId());
        order.setUser(user);
        return order;
    }

}
