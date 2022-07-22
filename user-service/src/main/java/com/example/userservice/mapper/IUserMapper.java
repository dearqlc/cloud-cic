package com.example.userservice.mapper;

import com.example.userservice.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author QLC
 */
@Mapper
public interface IUserMapper {

    User findById(@Param("id") Integer id);

}
