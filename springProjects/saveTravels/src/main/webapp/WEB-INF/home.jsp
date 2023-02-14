<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Save Travels</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
	<div class="container mt-2">
		<h1>Save Travels</h1>
		<table class="table table-striped">
			<tr>
				<th>Expense</th>
				<th>Vendor</th>
				<th>Amount</th>
				<th>Actions</th>
			</tr>
			<c:forEach var="expense" items="${ allExpenses }">
				<tr>
					<td><a href="/expenses/${ expense.id }"><c:out value="${ expense.name }"/></a></td>
					<td><c:out value="${ expense.vendor }"/></td>
					<td>$<c:out value="${ expense.amount }"/></td>
					<td>
						<div class="d-flex">
							<a href="/expenses/${ expense.id }/edit" class="btn btn-secondary">Edit</a>
							<form action="/expenses/${expense.id}/delete" method="post">
	    						<input type="hidden" name="_method" value="delete">
	    						<input type="submit" value="Delete" class="btn btn-danger ms-2">
							</form>
						</div>
					</td>
				</tr>
			</c:forEach>
		</table>
		<h2>Add an Expense</h2>
		<form:form action="/expenses" method="post" modelAttribute="expense">			
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
		
			<input type="submit" value="Submit" class="btn btn-success mt-2" />
		</form:form>
	</div>
</body>
</html>