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
	<div class="container mt-3 d-flex justify-content-evenly">
		<div>
			<h1>Burger Tracker</h1>
			<table class="table table-striped">
				<tr>
					<th>Burger Name</th>
					<th>Restaurant Name</th>
					<th>Rating (out of 5)</th>
					<th>Notes</th>
					<th>Action</th>
				</tr>
				<c:forEach var="burger" items="${ allBurgers }">
					<tr>
						<td><c:out value="${ burger.name }"></c:out></td>
						<td><c:out value="${ burger.restaurant }"></c:out></td>
						<td><c:out value="${ burger.rating }"></c:out></td>
						<td><c:out value="${ burger.notes }"></c:out></td>
						<td><a href="burgers/${ burger.id }">Edit</a></td>
					</tr>
				</c:forEach>
			</table>
		</div>
		<div>
			<form:form action="/burgers/save" method="post" modelAttribute="burger">
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
		</div>
	</div>
</body>
</html>