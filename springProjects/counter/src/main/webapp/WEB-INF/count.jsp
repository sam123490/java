<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
	<!-- for Bootstrap CSS -->
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<!-- YOUR own local CSS -->
	<link rel="stylesheet" href="/css/main.css"/>
</head>
<body>
	<div class="container mt-3">
		<p>
			You have visited <a href="/my_server">http://my_server</a> <c:out value="${ count }"></c:out> times.
		</p>
			<a href="/my_server" class="btn btn-primary mt-2">Test another visit?</a>
	</div>
	
</body>
</html>