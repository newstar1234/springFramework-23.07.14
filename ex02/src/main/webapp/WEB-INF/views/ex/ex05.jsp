<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EX05</title>
</head>
<style>
	table{
	text-aline: center;}
</style>
<body>
	<h1>ex05</h1>
	<table border="1">
		<tr>
			<th>이름</th>
			<th>나이</th>
			<th>성별</th>
		</tr>
		<tr>
			<td><c:out value="${infoDto.name}"></c:out></td>
			<td><c:out value="${infoDto.age}"></c:out></td>
			<td><c:out value="${gender}"></c:out></td>
		</tr>
	</table>
</body>
</html>