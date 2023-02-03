<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" href="/css/style.css"/>
</head>
<body>
	<div class="d-flex justify-content-center">
		<div class="mt-3 p-3 border border-3 border-secondary">
			<h1>Here is your Omikuji!</h1>
			<p>
				In <c:out value="${ num }"></c:out> years, you will live in <c:out value="${ city }"></c:out>
				with <c:out value="${ name }"></c:out> as your roommate, <c:out value="${ profession }"></c:out>
				as a living. The next time you see a <c:out value="${ animal }"></c:out>, you will have good luck!
				Also, <c:out value="${ message }"></c:out>
			</p>
			<a href="/omikuji" class="btn btn-warning">Make a New Omikuji!</a>
		</div>
	</div>
	
</body>
</html>