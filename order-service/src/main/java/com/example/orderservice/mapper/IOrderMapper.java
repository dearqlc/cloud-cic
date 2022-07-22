package com.example.orderservice.mapper;

import com.example.orderservice.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author QLC
 */
@Mapper
public interface IOrderMapper {

    Order findById(@Param("id") Integer id);

}
