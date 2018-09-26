<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
         <table width="65%" align="center" border="1">
         	<tr>
         		<td>用户名</td>
         		<td>生日</td>
         		<td>性别</td>
         		<td>地址</td>
         		<td>操作</td>
         	</tr>
         	<c:forEach items="${ulist}" var="user">
         		<tr>
	         		<td>${user.username }</td>
	         		<td>${user.birthday}  </td>
	         		<td>${user.sex }</td>
	         		<td>${user.address } </td>
	         		<td><a href="/ssm_demo/getByid.action?uid=${user.aid }">修改</a></td>
         		</tr>
         	</c:forEach>
         </table>
</body>
</html>