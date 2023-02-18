<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Person</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
	<div class="container mt-2">
		<h1>Person Details:</h1>
		<table class="table table-striped mt-2">
			<tr>
				<th>First Name</th>
				<td><c:out value="${ person.firstName }" /></td>
			</tr>
			<tr>
				<th>Last Name</th>
				<td><c:out value="${ person.lastName }" /></td>
			</tr>
			<tr>
				<th>License Number</th>
				<td><c:out value="${ person.license.number }" /></td>
			</tr>
			<tr>
				<th>State</th>
				<td><c:out value="${ person.license.state }" /></td>
			</tr>
			<tr>
				<th>Expiration Date</th>
				<td><c:out value="${ person.license.expirationDate }" /></td>
			</tr>
		</table>
		<a href="/persons" class="btn btn-secondary">Go Back</a>
	</div>
</body>
</html>