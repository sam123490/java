<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
	<div class="container d-flex justify-content-between mt-3">
		<h2>Welcome <c:out value="${ loggedUser.firstName }" />!</h2>
		<div>
			<a href="/logout" class="btn btn-danger">Log Out</a>
		</div>
	</div>
	<div class="container d-flex justify-content-between">
		<h3>All Books</h3>
		<div>
			<a href="/books/create" class="btn btn-outline-primary mt-2">Create Book</a>
		</div>
	</div>
	<div class="container mt-3">
		<table class="table table-striped">
			<tr>
				<th>ID</th>
				<th>Title</th>
				<th>Author Name</th>
				<th>Posted By</th>
			</tr>
			<c:forEach var="book" items="${ allBooks }">
				<tr>
					<td><c:out value="${ book.id }" /></td>
					<td> <a href="/books/${ book.id }"> <c:out value="${ book.title }" /> </a> </td>
					<td><c:out value="${ book.author }" /></td>
					<td><c:out value="${ book.user.firstName }" /></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>