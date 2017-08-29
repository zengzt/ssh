<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
</head>
<%@include file="head.jsp"%>
<body>
	</br>
	<h2 style="font-family:arial;color:red;font-size:25px;text-align:center">注册页面</h2>  
        <form action="/ssm/register" method="post" align="center">  
            姓名：<input type="text" name="username" size="20" value="" maxlength="20"><b style="color:red">*</b><br/>  
            密码：<input type="password" name="password" size="20" value="" maxlength="20"><b style="color:red">*</b><br/>
            确认密码：<input type="password" name="password1" size="20" value="" maxlength="20"><b style="color:red">*</b><br/>
           电话号码：<input type="text" name="phone" size="20" value="" maxlength="20"></br>  
          性别：<input type="radio" name="sex" value="0" checked="checked">男<input type="radio" name="sex" value="1">女</br>
          邮箱：<input type="text" name="email" size="20" value="" maxlength="20"></br>  
      </br>
            <input type="submit" name="submit" value="注册">  
            <input type="reset" name="reset" value="重置">
        </form>


</body>
</html>