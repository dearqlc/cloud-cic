package com.example.feign.clients;

import com.example.feign.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author QLC
 */
@FeignClient(value = "userservice")
public interface IUserClient {

    @GetMapping("/user/{id}")
    User findById(@PathVariable("id") Integer id);

}
