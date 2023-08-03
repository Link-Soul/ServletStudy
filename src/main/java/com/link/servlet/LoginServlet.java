package com.link.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取登录框中的账号密码
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        String jz = req.getParameter("jz");
        if (jz != null){
            Cookie c1 = new Cookie("username",username);
            Cookie c2 = new Cookie("password",username);
            //失效时间 秒
            c1.setMaxAge(30);
            c2.setMaxAge(30);

            //响应给浏览器
            resp.addCookie(c1);
            resp.addCookie(c2);
        }
        //设置Session
        if (username.equals("user3")&&password.equals("123")){
            System.out.println("登录成功");
            req.getSession();
            // 获取session 并将账号密码存储到session
            req.getSession().setAttribute("username",username);
            req.getSession().setAttribute("password",password);
            //转发 跳转页面
            req.getRequestDispatcher("/page.jsp").forward(req,resp);
        }
    }
}
