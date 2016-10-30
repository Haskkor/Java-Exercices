<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8" />
		<title>SupCommerce - Add a Category</title>
		<link rel="stylesheet" type="text/css" href="../style/style.css" />
	</head>
	<body>
		<%@ include file="/template/header.jsp" %>
		<section id="content">
			<form class="create-form" action="addCategory" method="post">
				<div>
					<label for="name">Name:</label>
					<input type="text" id="name" name="name" />
				</div>
				<div>
					<input type="submit" value="Submit" />
				</div>
			</form>
		</section>
		<%@ include file="/template/footer.jsp" %>
	</body>
</html>