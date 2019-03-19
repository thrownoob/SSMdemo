package com.on.web.dao;

import com.on.web.mod.User;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

/**
 * UserDAO继承基类
 */
@MapperScan
public interface UserDAO extends MyBatisBaseDao<User, String> {
}