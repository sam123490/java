<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
	
	<div class="container">
		<h1><c:out value="${ book.title }"></c:out></h1>
		<p><c:out value="${ book.description }"></c:out></p>
		<p><c:out value="${ book.language }"></c:out></p>
		<p><c:out value="${ book.numberOfPages }"></c:out></p>
	</div>
</body>
</html>