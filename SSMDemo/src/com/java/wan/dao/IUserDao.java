package com.java.wan.dao;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class IUserDao {
    int deleteByPrimaryKey(Integer id){

    };
    int insert(User record){

    };
    int insertSelective(User record){};
    User selectByPrimaryKey(Integer id){};
    int updateByPrimaryKeySelective(User record){};
    int updateByPrimaryKey(User record){};
    List<User> selectAllUser(){};
}
