package com.link.dao;

import com.link.pojo.User;

import java.util.List;


public interface UserDao {

    int insert(User user);
    int drop(String username);
    int update(User user);
    List<User> select();



}
