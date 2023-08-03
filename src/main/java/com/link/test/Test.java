package com.link.test;

import com.link.dao.UserDao;
import com.link.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Test {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        SqlSession sqlSession=null;


        inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession = sqlSessionFactory.openSession();

        UserDao userDao = sqlSession.getMapper(UserDao.class);
        User user = new User();
        user.setUsername("user4");
        user.setPassword("123");
        int insert = userDao.insert(user);
        sqlSession.commit();
        if (insert>=0){
            System.out.println("success");
        }else {
            System.out.println("false");
        }

    }

}
