<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8" />
		<title>SupCommerce - Product Details</title>
		<link rel="stylesheet" type="text/css" href="style/style.css" />
	</head>
	<body>
		<%@ include file="/template/header.jsp" %>
		
		<article id="content">
			<h2><c:out value="${product.name}"/></h2>
			<c:if test="${not empty product.category}">
				<i>Category: <c:out value="${product.category.name}"/></i>
			</c:if>
			<p><c:out value="${product.description}"/></p>
			<span><c:out value="${product.price}"/></span>
		</article>
		
		<%@ include file="/template/footer.jsp" %>
	</body>
</html>