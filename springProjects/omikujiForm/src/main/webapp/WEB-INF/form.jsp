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
	<div class="container">
		<h1>Send an Omikuji!</h1>
		<form action="/omikuji/process" method="post">
			<label for="num" class="form-label">Pick any number form 5 to 25:</label>
			<input id="num" name="num" type="number" class="form-control">

            <label for="city" class="form-label mt-2">Enter the name of any city:</label>
            <input id="city" name="city" type="text" class="form-control">

            <label for="name" class="form-label mt-2">Enter the name of any real person:</label>
            <input id="name" name="name" type="text" class="form-control">

            <label for="profession" class="form-label mt-2">Enter professional endeavor or hobby:</label>
            <input id="profession" name="profession" type="text" class="form-control">

            <label for="animal" class="form-label mt-2">Enter any type of living thing:</label>
            <input id="animal" name="animal" type="text" class="form-control">

            <label for="message" class="form-label mt-2">Say something nice to someone:</label>
            <textarea name="message" id="message" cols="10" rows="10" class="form-control"></textarea>

            <p><em>Send and show a friend</em></p>
            <input type="submit" class="btn btn-success" value="Send">
		</form>
	</div>
</body>
</html>