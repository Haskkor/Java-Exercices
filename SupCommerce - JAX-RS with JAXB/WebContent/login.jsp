<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8" />
		<title>SupComemrce - Login</title>
		<link rel="stylesheet" type="text/css" href="style/style.css" />
	</head>
	<body>
		<%@ include file="/template/header.jsp" %>
		<section id="content">
			<form action="login" method="post">
				<div>
					<label for="username">Username:</label>
					<input type="text" name="username" id="username" />
					<input type="submit" value="Submit" />
				</div>
			</form>
		</section>
		<%@ include file="/template/footer.jsp" %>
	</body>
</html>