<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Books =)</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
	
	<div class="container mt-2">
		<h1>All of the books!</h1>
			<table class="table table-striped">
				<tr>
					<th>ID</th>
					<th>Title</th>
					<th>Description</th>
					<th>Language</th>
					<th>Number of Pages</th>
				</tr>
				<c:forEach var="book" items="${ allBooks }">
				<tr>
					<td><c:out value="${ book.id }"></c:out></td>
					<td><a href="/books/<c:out value="${ book.id }"></c:out>"><c:out value="${ book.title }"></c:out></a></td>
					<td><c:out value="${ book.description }"></c:out></td>
					<td><c:out value="${ book.language }"></c:out></td>
					<td><c:out value="${ book.numberOfPages }"></c:out></td>
				</tr>
				</c:forEach>
			</table>
	</div>
</body>
</html>