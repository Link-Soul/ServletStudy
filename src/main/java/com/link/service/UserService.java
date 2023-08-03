package com.link.service;

import com.link.pojo.User;

import java.io.IOException;
import java.util.List;


public interface UserService {
    int insert(User user);
    int drop(String username);
    int update(User user);


    List<User> select();

}
