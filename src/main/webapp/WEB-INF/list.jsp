<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table width="80%" align="center">
		<tr>
			<td>编号{{sa}}</td>
			<td>姓名</td>
			<td>密码</td>
		</tr>
		<c:forEach items="${lists}" var="user">
			<tr>
				<td>${user.id }</td>
				<td><c:out value="${user.username}"></c:out></td>
				<td><c:out value="${user.password}"></c:out></td>
			</tr>
		</c:forEach>
	</table>
	${name}
</body>
</html>