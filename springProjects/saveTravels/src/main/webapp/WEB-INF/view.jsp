<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Expense</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
	<div class="container mt-2">
		<div class="d-flex justify-content-around">
			<h1>Expense Details</h1>
			<a href="/expenses"	class="btn btn-primary align-text-bottom">Go Back</a>
		</div>
		<p>Expense Name: <c:out value="${ expense.name }"></c:out></p>
		<p>Description: <c:out value="${ expense.description }"></c:out></p>
		<p>Vendor: <c:out value="${ expense.vendor }"></c:out></p>
		<p>Amount Spent: $<c:out value="${ expense.amount }"></c:out></p>		
	</div>
</body>
</html>