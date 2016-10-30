<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8" />
		<title>SupCommerce - Product List</title>
		<link rel="stylesheet" type="text/css" href="style/style.css" />
	</head>
	<body>
		<%@ include file="/template/header.jsp" %>
		<section id="content">
			<c:choose>
				<c:when test="${empty products}">
					<p>No product to display.</p>
				</c:when>
				<c:otherwise>
					<table class="product-table">
						<tr>
							<th>ID</th>
							<th>Name</th>
							<th>Description</th>
							<th>Price</th>
							<th>Category</th>
							<c:if test="${not empty username}">
								<th>Action</th>
							</c:if>
						</tr>
						<c:forEach items="${products}" var="product">
							<tr>
								<td><c:out value="${product.id}"/></td>
								<td><c:out value="${product.name}"/></td>
								<td><c:out value="${product.description}"/></td>
								<td><c:out value="${product.price}"/></td>
								<td>
									<c:if test="${not empty product.category}">
										<c:out value="${product.category.name}"/>
									</c:if>
								</td>
								<c:if test="${not empty username}">
									<td>
										<form action="auth/removeProduct?id=${product.id}" method="post">
											<input type="submit" value="Remove" />
										</form>
									</td>
								</c:if>
							</tr>
						</c:forEach>
					</table>
				</c:otherwise>
			</c:choose>
		</section>
		<%@ include file="/template/footer.jsp" %>
	</body>
</html>