package com.link.service.impl;


import com.link.dao.UserDao;
import com.link.pojo.User;
import com.link.service.UserService;
import com.link.util.GetSqlSession;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserServiceImpl implements UserService {
    private SqlSession sqlSession = GetSqlSession.getSql();


    @Override
    public int insert(User user) {
        UserDao sqlSessionMapper = sqlSession.getMapper(UserDao.class);
        int insert = sqlSessionMapper.insert(user);
        sqlSession.commit();
        return insert;
    }

    @Override
    public int drop(String username) {
        UserDao sqlSessionMapper = sqlSession.getMapper(UserDao.class);
        int drop = sqlSessionMapper.drop(username);
        sqlSession.commit();
        return drop;
    }
    @Override
    public int update(User user) {
        UserDao sqlSessionMapper = sqlSession.getMapper(UserDao.class);
        int update = sqlSessionMapper.update(user);
        sqlSession.commit();
        return update;
    }

    @Override
    public List<User> select() {
        UserDao sqlSessionMapper = sqlSession.getMapper(UserDao.class);
        List<User> userList = sqlSessionMapper.select();
        return userList;
    }

}
