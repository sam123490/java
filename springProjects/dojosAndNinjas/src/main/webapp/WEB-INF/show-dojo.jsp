<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
	<div class="container mt-2">
		<h1><c:out value="${ dojo.name }" /></h1>
		<table class="table table-striped">
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Age</th>
			</tr>
			<c:forEach var="ninja" items="${ dojo.ninjas }">
				<tr>
					<td><c:out value="${ ninja.firstName }" /></td>
					<td><c:out value="${ ninja.lastName }" /></td>
					<td><c:out value="${ ninja.age }" /></td>
				</tr>
			</c:forEach>
		</table>
		<a href="/dojos" class="btn btn-warning">Go Back</a>
	</div>
</body>
</html>