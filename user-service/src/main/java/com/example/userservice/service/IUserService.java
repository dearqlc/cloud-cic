package com.example.userservice.service;

import com.example.userservice.entity.User;

/**
 * @author QLC
 */
public interface IUserService {

    User queryById(Integer id);

}
