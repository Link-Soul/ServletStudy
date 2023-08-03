package com.link.servlet;

import com.link.service.UserService;
import com.link.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/drop")
public class DropServlet extends HttpServlet {
    private UserService userService = new UserServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.setCharacterEncoding("utf-8");
//        resp.setCharacterEncoding("utf-8");
//        resp.setContentType("test/html");

        String username = req.getParameter("username");
        int drop = userService.drop(username);
        if (drop>=0){
            System.out.println("删除成功");
        }else {
            System.out.println("删除失败");
        }
    }
}
