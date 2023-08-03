
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>$Title$</title>
</head>
<body>
<h4>增添数据</h4>
<form action="/ServletTest_02_war_exploded/register" method="post">
  用户名：<input type="text" name="username"><br/><br/>
  密 码：<input type="password" name="password"><br/>
  <input type = "submit" value="注册">
  <input type = "reset" value="重制"><br/>
</form>
<hr/>

<h4>按照用户名删除数据</h4>
<form action="/ServletTest_02_war_exploded/drop" method="post">
  用户名：<input type="text" name="username"><br/><br/>
  <input type = "submit" value="删除">
  <input type = "reset" value="重制"><br/>
</form>
<hr/>

<h4>按照用户名修改密码</h4>
<form action="/ServletTest_02_war_exploded/update" method="post">
  用户名：<input type="text" name="username"><br/>
  修改后密码<br/>
  密 码： <input type="password" name="password"><br/>
  <input type = "submit" value="修改">
  <input type = "reset" value="重制"><br/>
</form>
<hr/>

<h4>按照账号查询用户信息</h4>
<form action="/ServletTest_02_war_exploded/select" method="post">
<%--  用户名：<input type="text" name="username"><br/><br/>--%>
  <input type = "submit" value="查询">
</form>
<hr/>






</body>
</html>
