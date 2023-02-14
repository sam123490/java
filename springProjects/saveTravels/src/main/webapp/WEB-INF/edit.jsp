<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit an Expense</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
	<div class="container mt-2">
		<h1>Edit Expense</h1>
		<form:form action="/expenses/${ expense.id }/edit" method="post" modelAttribute="expense">	
			<input type="hidden" name="_method" value="PUT" />
			<form:input type="hidden" path="id" />
				
			<form:label path="name" class="form-label">Name:</form:label>
			<form:errors path="name" />
			<form:input type="text" path="name" class="form-control" />
			
			<form:label path="vendor" class="form-label">Vendor:</form:label>
			<form:errors path="vendor" />
			<form:input type="text" path="vendor" class="form-control" />
			
			<form:label path="amount" class="form-label">Amount:</form:label>
			<form:errors path="amount" />
			<form:input type="number" path="amount" class="form-control" />
			
			<form:label path="description" class="form-label">Description:</form:label>
			<form:errors path="description" />
			<form:input type="text" path="description" class="form-control" />
			<div class="d-flex mt-2">
				<input type="submit" value="Submit" class="btn btn-success" />
				<a href="/expenses" class="btn btn-danger ms-2">Cancel</a>
			</div>
		</form:form>
	</div>
</body>
</html>