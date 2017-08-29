<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
</head>
<%@include file="head.jsp"%>
<body>
	<h2 style="color:red;text-align:center">商品列表</h2>
	<from>
		<input type="radio" name="type" value="1" checked="checked">商品名称
		<input type="radio" name="type" value="2">店家
	
	</from>
	<table style="text-align:center;border:1px">
		<tr style="color:#000fff;text-align: center">  
	        <th>商品名称</th>  
	        <th>价钱</th>  
	        <th>商品分类</th>  
	        <th>图片</th>
	        <th>商品卖点</th>  
	        <th>描述</th>
	        <th>数量</th>  
	        <th>发送城市</th>
	        <th>打折</th>  
	    </tr>
	    <tr style="color:red;text-align: center">  
	        <th>商品名称</th>  
	        <th>价钱</th>  
	        <th>商品分类</th>  
	        <th>图片</th>
	        <th>商品卖点</th>  
	        <th>描述</th>
	        <th>数量</th>  
	        <th>发送城市</th>
	        <th>打折</th>  
	    </tr>
		
	</table>
</body>
</html>