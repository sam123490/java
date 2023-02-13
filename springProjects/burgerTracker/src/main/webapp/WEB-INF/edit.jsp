<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
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
		<form:form action="/burgers/${ burger.id }/update" method="post" modelAttribute="burger">
			<input type="hidden" name="_method" value="PUT" />
			<form:input type="hidden" path="id"/>
			
			<form:label class="form-label" path="name">Burger Name</form:label>
			<form:errors path="name"/>
			<form:input type="text" path="name" class="form-control"/>
					
			<form:label class="form-label" path="restaurant">Restaurant Name</form:label>
			<form:errors path="restaurant"/>
			<form:input type="text" path="restaurant" class="form-control"/>
					
			<form:label class="form-label" path="rating">Rating</form:label>
			<form:errors path="rating"/>
			<form:input type="number" path="rating" class="form-control"/>
					
			<form:label class="form-label" path="notes">Notes</form:label>
			<form:errors path="notes"/>
			<form:input type="text" path="notes" class="form-control"/>
					
			<input type="submit" value="Submit" class="btn btn-success mt-2"/>
		</form:form>
		<a href="/burgers" class="btn btn-danger mt-2">Cancel</a>
	</div>
</body>
</html>