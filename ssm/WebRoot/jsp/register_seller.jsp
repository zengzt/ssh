<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册商家</title>
</head>
<%@include file="head.jsp"%>
<body>
	</br>
	<h2 style="font-family:arial;color:red;font-size:25px;text-align:center">注册商家</h2>  
        <form action="/ssm/registerseller" method="post" align="center">  
            商店名称：<input type="text" name="shopname" size="20" value="" maxlength="20"><b style="color:red">*</b><br/>  
           发送城市 ：<input type="test" name="sendcity" size="20" value="" maxlength="20"><b style="color:red">*</b><br/>
            <input type="submit" name="submit" value="注册"><input type="reset" name="reset" value="重置">  
        </form>
	
</body>
</html>