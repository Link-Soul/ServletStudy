<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/8/1
  Time: 16:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h4>按照用户名修改密码</h4>
<form action="/ServletTest_02_war_exploded/login" method="post">
                                                    <%--${}是EL表达式--%>
  用户名：<input type="text" name="username" value="${cookie.username.value}"><br/>
  密 码： <input type="password" name="password" value="${cookie.password.value}"><br/>
  <input type="checkbox" name="jz" value="1" >记住密码<br/>

  <input type = "submit" value="修改">

</form>
<hr/>
</body>
</html>
