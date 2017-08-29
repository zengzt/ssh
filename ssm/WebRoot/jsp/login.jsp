<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登陆</title>
	

  </head>
  <%@include file="head.jsp"%>
  <body>
  </br>
  	<h2 style="font-family:arial;color:red;font-size:25px;text-align:center">登录页面</h2>  
        <form action="/ssm/login" method="post" align="center">  
            姓名：<input type="text" name="name" size="20" value="" maxlength="20"><br/>  
            密码：<input type="password" name="password" size="20" value="" maxlength="20"><br/>  
      </br>
            <input type="submit" name="submit" value="登录">  
            <input type="reset" name="reset" value="重置">
        </form>
  	
  </body>
</html>
