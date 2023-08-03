package com.link.servlet;

import com.alibaba.fastjson.JSON;
import com.link.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/json")
public class JsonServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User("123","user0","123");
        List<User> list = new ArrayList<>();
        list.add(user);
        PrintWriter pw = resp.getWriter();

        //转json串
        pw.write(JSON.toJSONString(list));


    }
}
