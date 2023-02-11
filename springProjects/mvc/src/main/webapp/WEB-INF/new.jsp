<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
	
	<div class="container mt-3">
		<h1>Create New Book!</h1>
		<form action="/books/save" method="post">
			<label class="form-label">Title:</label>
			<input type="text" name="title" class="form-control">
			<label class="form-label">Description:</label>
			<input type="text" name="description" class="form-control">
			<label class="form-label">Language:</label>
			<input type="text" name="language" class="form-control">
			<label class="form-label">Number of Pages</label>
			<input type="text" name="pages" class="form-control">
		
			<input type="submit" class="btn btn-success mt-2">
		</form>
		<a href="/books" class="btn btn-danger mt-2">Cancel</a>
	</div>
</body>
</html>