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
		<h1>Add New License</h1>
		<h1><c:out value="${ allPersons[0].lastName}"></c:out></h1>
		<form:form action="/licenses/new" method="post" modelAttribute="license">
			<form:select path="person" class="form-select">
				<c:forEach var="person" items="${ allPersons }">
					<form:option value="${ person.id }" path="person">
						<c:out value="${ person.firstName }" ></c:out>
						<c:out value="${ person.lastName }" ></c:out>
					</form:option>
				</c:forEach>
			</form:select>
			
			<form:label path="number" class="form-label mt-3">License Number:</form:label>
				<div>
					<form:errors path="number" class="text-danger"/>
				</div>
			<form:input type="text" path="number" class="form-control" />
			
			<form:label path="state" class="form-label mt-3">State:</form:label>
				<div>
					<form:errors path="state" class="text-danger"/>
				</div>
			<form:input type="text" path="state" class="form-control" />
			
			<form:label path="expirationDate" class="form-label mt-3">Expiration Date:</form:label>
				<div>
					<form:errors path="expirationDate" class="text-danger"/>
				</div>
			<form:input type="date" path="expirationDate" class="form-control" />
			
			<input type="submit" value="Submit" class="btn btn-success mt-2" />
		</form:form>
		<a href="/persons" class="btn btn-danger mt-2">Cancel</a>
	</div>
</body>
</html>