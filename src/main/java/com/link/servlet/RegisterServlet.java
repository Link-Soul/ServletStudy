package com.link.servlet;

import com.link.pojo.User;
import com.link.service.UserService;
import com.link.service.impl.UserServiceImpl;
import com.link.util.GetUUID;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    //
    private UserService userService = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //  insert

        //设置请求的编码字符集
//        req.setCharacterEncoding("utf-8");
//        //设置响应的编码字符集
//        resp.setCharacterEncoding("utf-8");
//        //设置相应页面格式
//        resp.setContentType("test/html");

        //接收传来的账号密码。
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        //System.out.println(username);
//        PrintWriter pw = resp.getWriter();
//        pw.write(username+password);



        User user = new User();
        user.setId(GetUUID.getUUID());
        user.setUsername(username);
        user.setPassword(password);
        int insert = userService.insert(user);

        if (insert>=0){
            System.out.println("注册成功");
        }else {
            System.out.println("注册失败");
        }


    }
}
