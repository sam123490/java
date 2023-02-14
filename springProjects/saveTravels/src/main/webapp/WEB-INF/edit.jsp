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
	<div class="container">
		<h1>Edit Cost</h1>
		<form:form action="/expenses/${ cost.id }" method="post" modelAttribute="cost">	
			<input type="hidden" name="_method" value="PUT" />
			<form:input type="hidden" path="id" />
				
			<form:label path="expense" class="form-label">Expense:</form:label>
			<form:errors path="expense" />
			<form:input type="text" path="expense" class="form-control" />
			
			<form:label path="vendor" class="form-label">Vendor:</form:label>
			<form:errors path="vendor" />
			<form:input type="text" path="vendor" class="form-control" />
			
			<form:label path="amount" class="form-label">Amount:</form:label>
			<form:errors path="amount" />
			<form:input type="number" path="amount" class="form-control" />
		
			<input type="submit" value="Submit" class="btn btn-success mt-2" />
		</form:form>
	</div>
</body>
</html>