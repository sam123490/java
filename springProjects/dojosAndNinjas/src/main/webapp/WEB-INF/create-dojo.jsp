<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Dojo</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
	<div class="container mt-2">
		<h1>Create Dojo</h1>
		<form:form action="/dojos/create" method="post" modelAttribute="dojo">
			<form:label path="name" class="form-label">Name:</form:label>
			<form:errors path="name" class="text-danger" />
			<form:input type="text" path="name" class="form-control" />
			
			<input type="submit" value="Submit" class="btn btn-success mt-2" />
		</form:form>
		<a href="/dojos" class="btn btn-danger mt-2">Cancel</a>
	</div>
</body>
</html>