<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Book</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
	<div class="container col-6">
		<h2>Edit Book</h2>
		<form:form action="/books/edit/${ book.id }" method="post" modelAttribute="book">
			<input type="hidden" name="_method" value="put" />
			<form:input type="hidden" name="user" path="user" />
		
			<form:label path="title" class="form-label">Title:</form:label>
			<form:errors path="title" class="text-danger" />
			<form:input type="text" path="title" class="form-control" />
				
			<form:label path="author" class="form-label">Author:</form:label>
			<form:errors path="author" class="text-danger" />
			<form:input type="text" path="author" class="form-control" />
			
			<form:label path="thoughts" class="form-label">Thoughts:</form:label>
			<form:errors path="thoughts" class="text-danger" />
			<form:textarea path="thoughts" class="form-control" rows="10" col="10"></form:textarea>
		
			<input type="submit" value="Submit" class="btn btn-success mt-2" />
		</form:form>
		<a href="/dashboard" class="btn btn-danger mt-2">Cancel</a>
	</div>
</body>
</html>