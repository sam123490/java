<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<!-- YOUR own local CSS -->
	<link rel="stylesheet" href="/css/style.css"/>
</head>
<body>
	<div class="container mt-3">
		<h1>Fruit Store</h1>
		<table class="table table-striped">
			<tr>
				<th>Name</th>
				<th>Price</th>
			</tr>
			<c:forEach var="eachFruit" items="${ fruits }">
				<tr>
					<td><c:out value="${ eachFruit.name }"></c:out></td>
					<td><c:out value="${ eachFruit.price }"></c:out></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>