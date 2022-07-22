package com.example.orderservice.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.example.feign.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author QLC
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("t_user")
public class Order {

    private Integer id;
    private Integer userId;
    private String name;
    private Integer price;
    private Integer num;
    private User user;

}
