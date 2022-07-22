package com.example.orderservice.service;

import com.example.orderservice.entity.Order;
import org.apache.ibatis.annotations.Param;

/**
 * @author QLC
 */
public interface IOrderService {

    Order findById(@Param("id") Integer id);

}
