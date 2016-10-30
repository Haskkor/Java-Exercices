<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add quote</title>
</head>
<body>
<form action="addQuote" method="post">
		<div>
			<label for="description">Quote : </label>
			<textarea id="description" name="description"></textarea>
		</div>
		<div>
			<label for="rating">Rating : </label>
			<input type="number" id="rating" name="rating" />
		</div>
		<div>
			<input type="submit" value="Submit" />
		</div>
	</form>
</body>
</html>