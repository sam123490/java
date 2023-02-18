<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojos</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
	<div class="container mt-2">
		<h1>All Dojos</h1>
		<table class="table table-striped">
			<tr>
				<th>Name</th>
				<th># of Ninjas</th>
			</tr>
			<c:forEach var="dojo" items="${ allDojos }">
				<tr>
					<td><a href="dojos/${ dojo.id }"><c:out value="${ dojo.name }" /></a></td>
					<td>working on it</td>
				</tr>
			</c:forEach>
		</table>
		<a href="/dojos/create" class="btn btn-primary">Create Dojo</a>
		<a href="/ninjas/create" class="btn btn-dark">Create Ninja</a>
	</div>
</body>
</html>