<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register | Login</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
	<div class="container d-flex mt-3">
		<div class="container col-3">
			<h2 class="text-center">Register Today!</h2>
			<form:form action="/register" method="post" modelAttribute="newUser">
				<form:label path="firstName" class="form-label">First Name:</form:label>
				<form:errors path="firstName" class="text-danger" />
				<form:input type="text" path="firstName" class="form-control" />
				
				<form:label path="lastName" class="form-label mt-2">Last Name:</form:label>
				<form:errors path="lastName" class="text-danger" />
				<form:input type="text" path="lastName" class="form-control" />
				
				<form:label path="email" class="form-label mt-2">Email:</form:label>
				<form:errors path="email" class="text-danger" />
				<form:input type="text" path="email" class="form-control" />
				
				<form:label path="password" class="form-label mt-2">Password:</form:label>
				<form:errors path="password" class="text-danger" />
				<form:input type="password" path="password" class="form-control" />
				
				<form:label path="confirm" class="form-label mt-2">Confirm Password:</form:label>
				<form:errors path="confirm" class="text-danger" />
				<form:input type="password" path="confirm" class="form-control" />
				
				<input type="submit" value="Submit" class="btn btn-success mt-2" />
			</form:form>
		</div>
		<div class="container col-3">
			<h2 class="text-center">Log in</h2>
			<form:form action="/login" method="post" modelAttribute="newLogin">
				<form:label path="email" class="form-label">Email:</form:label>
				<form:errors path="email" class="text-danger" />
				<form:input type="text" path="email" class="form-control" />
				
				<form:label path="password" class="form-label mt-2">Password:</form:label>
				<form:errors path="password" class="text-danger" />
				<form:input type="password" path="password" class="form-control" />
				
				<input type="submit" value="Submit" class="btn btn-primary mt-2" />
			</form:form>
		</div>
	</div>
</body>
</html>