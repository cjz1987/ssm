<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table width="80%" align="center">
        <tr>
            <td>编号</td>
            <td>姓名</td>
            <td>密码</td>
        </tr>
        <c:forEach items="${list}" var="bean" >
            <tr>
                <td>${bean.id}</td>
                <td>${bean.name}</td>
                <td>${bean.pwd}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
