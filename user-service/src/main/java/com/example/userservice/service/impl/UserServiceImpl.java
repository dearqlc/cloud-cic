package com.example.userservice.service.impl;

import com.example.userservice.entity.User;
import com.example.userservice.mapper.IUserMapper;
import com.example.userservice.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author QLC
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserMapper userMapper;

    @Override
    public User queryById(Integer id) {
        return userMapper.findById(id);
    }

}
