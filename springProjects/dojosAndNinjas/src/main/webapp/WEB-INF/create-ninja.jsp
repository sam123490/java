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
	<div class="container mt-2">
		<h1>Create Ninja</h1>
		<form:form action="/ninjas/create" method="post" modelAttribute="ninja">
			<form:label path="dojo" class="form-label">Dojo:</form:label>
			<form:errors path="dojo" class="text-danger" />
			<form:select path="dojo" class="form-select">
				<option disabled selected>--SELECT DOJO--</option>
				<c:forEach var="dojo" items="${ allDojos }">
					<option value="${ dojo.id }">
						<c:out value="${ dojo.name }" />
					</option>
				</c:forEach>
				
			</form:select>
			
			<form:label path="firstName" class="form-label">First Name:</form:label>
			<form:errors path="firstName" class="text-danger" />
			<form:input type="text" path="firstName" class="form-control" />
			
			<form:label path="lastName" class="form-label">Last Name:</form:label>
			<form:errors path="lastName" class="text-danger" />
			<form:input type="text" path="lastName" class="form-control" />
			
			<form:label path="age" class="form-label">Age:</form:label>
			<form:errors path="age" class="text-danger" />
			<form:input type="number" path="age" class="form-control" />
			
			<input type="submit" value="Submit" class="btn btn-success mt-2" />
		</form:form>
		<a href="/dojos" class="btn btn-danger mt-2">Cancel</a>
	</div>
</body>
</html>