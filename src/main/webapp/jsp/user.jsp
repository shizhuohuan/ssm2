<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
${pageContext.request.contextPath }
 <form action="${pageContext.request.contextPath }/save.action" method="post">
 	
	
	<input type="hidden" name="id" value='${user.id }' />
   <table border="1">
   		<tr>
   			<td>用户名</td>
   			<td><input type="text" name="username" value='${user.username }' /></td>
   		</tr>
   		<tr>
   			<td>生日</td>
   			<td><input type="text" name="birthday" value='<fmt:formatDate value="${user.birthday }" pattern="yyyy-MM-dd"/>' />  </td>
   		</tr>
   		<tr>
   			<td>性别</td>
   			<td><input type="text" name="sex" value='${user.sex } ' /></td>
   		</tr>
   		<tr>
   			<td>地址</td>
   			<td><input type="text" name="address" value='${user.address } ' /></td>
   		</tr>
   		<tr>
   			<td colspan="2">
   				<input type="submit" value="保存用户">
   			</td>
   		</tr>
   </table>
   </form>  
</body>
</html>