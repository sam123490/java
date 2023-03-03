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
				<th>Actions</th>
			</tr>
			<c:forEach var="book" items="${ allBooks }">
				<c:choose>
					<c:when test = "${ book.borrower == loggedUser }"></c:when>
					<c:otherwise>
						<tr>
							<td><c:out value="${ book.id }" /></td>
							<td> <a href="/books/${ book.id }"> <c:out value="${ book.title }" /> </a> </td>
							<td><c:out value="${ book.author }" /></td>
							<c:choose>
								<c:when test = "${ book.user.id == loggedUser.id }">
									<td>You</td>
								</c:when>
								<c:otherwise>
									<td><c:out value="${ book.user.firstName }" /></td>
								</c:otherwise>
							</c:choose>
							<td>
								<c:choose>
									<c:when test = "${ book.user.id == loggedUser.id }" >
										<form action="/books/delete/${ book.id }" method="post">
											<a href="/books/edit/${ book.id }" class="btn btn-link">Edit</a>
		    								<input type="hidden" name="_method" value="delete">
		    								<input type="submit" value="Delete" class="btn btn-link">
										</form>
		
									</c:when>
									<c:otherwise>
										<a href="/books/borrow/${ book.id }" class="btn btn-link">Borrow</a>
									</c:otherwise>
								</c:choose>
							</td>
						</tr>
					</c:otherwise>
				</c:choose>
			</c:forEach>
		</table>
		<h3>Borrowed Books</h3>
		<table class="table table-striped mt-4">
			<tr>
				<th>ID</th>
				<th>Title</th>
				<th>Author Name</th>
				<th>Posted By</th>
				<th>Actions</th>
			</tr>
			<c:forEach var="book" items="${ borrowedBooks }" >
				<tr>
					<td><c:out value="${ book.id }" /></td>
					<td><a href="/books/${ book.id }"><c:out value="${ book.title }" /></a></td>
					<td><c:out value="${ book.author }" /></td>
					<td><c:out value="${ book.user.firstName }" /></td>
					<td><a href="/books/return/${ book.id }">Return</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>