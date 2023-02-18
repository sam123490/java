<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
	<div class="container mt-2">
		<h1>All People</h1>
		<table class="table table-striped mt-2">
			<tr>
				<th>Name</th>
				<th>Actions</th>
			</tr>
			<c:forEach var="person" items="${ allPersons }">
				<tr>
					<td><a href="/persons/${ person.id }"><c:out value="${ person.firstName }"/> <c:out value="${ person.lastName }"/></a></td>
				</tr>
			</c:forEach>
		</table>
		<a href="/persons/new" class="btn btn-primary mt-2">Add New Person</a>
		
		<a href="/licenses/new" class="btn btn-secondary mt-2">Add License</a>
	</div>
</body>
</html>