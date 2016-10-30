<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8" />
		<title>SupCommerce - Add a Product</title>
		<link rel="stylesheet" type="text/css" href="../style/style.css" />
	</head>
	<body>
		<%@ include file="/template/header.jsp" %>
		<section id="content">
			<form class="create-form" action="addProduct" method="post">
				<div>
					<label for="name">Name:</label>
					<input type="text" id="name" name="name" />
				</div>
				<div>
					<label for="content">Content:</label>
					<textarea id="content" name="content"></textarea>
				</div>
				<div>
					<label for="price">Price:</label>
					<input type="number" id="price" name="price" />
				</div>
				<div>
					<label for="category">Category:</label>
					<select id="category" name="categoryId">
						<option value="">-- Select Category --</option>
						<c:forEach items="${categories}" var="c">
							<option value="${c.id}"><c:out value="${c.name}" /></option>
						</c:forEach>
					</select>
				</div>
				<div>
					<input type="submit" value="Submit" />
				</div>
			</form>
		</section>
		<%@ include file="/template/footer.jsp" %>
	</body>
</html>