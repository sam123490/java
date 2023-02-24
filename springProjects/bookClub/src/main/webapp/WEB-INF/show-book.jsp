<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
	<div class="d-flex justify-content-between container col-8 mt-3">
		<h1><c:out value="${ book.title }" /></h1>
		<div>
			<a href="/dashboard" class="btn btn-danger">Go Back</a>
		</div>
	</div>
	<div class="container col-8 mt-3">
		<c:choose>
			<c:when test = "${ book.user.id == loggedUser.id }">
				<p><strong>You</strong> read <c:out value="${ book.title }" />.</p>
				<p>Here are <em>your</em> thoughts:</p>
			</c:when>
			<c:otherwise>
				<p>
					<c:out value="${ book.user.firstName }" /> read <c:out value="${ book.title }" /> by
					<c:out value="${ book.author }" />.
				</p>
				<p>Here are <c:out value="${ book.user.firstName }" />'s thoughts:</p>
			</c:otherwise>
		</c:choose>
		<hr>
		<p><c:out value="${ book.thoughts }" /></p>
		<hr>
		<c:if test = "${ loggedUser.id == book.user.id }">
			<%-- <a href="/books/delete/${ book.id }" class="btn btn-outline-danger">Delete</a> --%>
			<form action="/books/delete/${book.id}" method="post">
    			<input type="hidden" name="_method" value="delete">
    			<input type="submit" value="Delete" class="btn btn-danger mt-2">
			</form>
		</c:if>
	</div>
	
</body>
</html>