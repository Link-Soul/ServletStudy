package com.link.servlet;

import com.link.pojo.User;
import com.link.service.UserService;
import com.link.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/select")
public class SelectServlet extends HttpServlet {
    private UserService userService = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //没有参数传入则doGet也可以


//        req.setCharacterEncoding("utf-8");
//        resp.setCharacterEncoding("utf-8");
//        resp.setContentType("test/html");


        List<User> user = userService.select();
        PrintWriter pw = resp.getWriter();

        pw.write(user.toString());

        pw.flush();


    }
}
