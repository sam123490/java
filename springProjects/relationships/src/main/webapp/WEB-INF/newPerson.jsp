<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Person</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
	<div class="container mt-2">
		<h1>Add New Person</h1>
		<form:form action="/persons/new" method="post" modelAttribute="person">
			<form:label path="firstName" class="form-label">First Name:</form:label>
				<div>
					<form:errors path="firstName" class="text-danger"/>
				</div>
			<form:input type="text" path="firstName" class="form-control" />
			
			<form:label path="lastName" class="form-label mt-3">Last Name:</form:label>
				<div>
					<form:errors path="lastName" class="text-danger"/>
				</div>
			<form:input type="text" path="lastName" class="form-control" />
			
			<input type="submit" value="Submit" class="btn btn-success mt-2" />
		</form:form>
		<a href="/persons" class="btn btn-danger mt-2">Cancel</a>
	</div>
</body>
</html>