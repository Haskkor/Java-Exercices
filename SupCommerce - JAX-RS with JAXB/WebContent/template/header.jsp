<%
	boolean logged = request.getSession().getAttribute("username") != null;
	String contextPath = getServletContext().getContextPath();
%>
<header>
	<h1>SupCommerce</h1>
	<nav>
		<ul style="list-style: none;">
			<li><a href="<%= contextPath %>/listProduct">Product List</a></li>
			<li><a href="<%= contextPath %>/cheaperProduct">Cheaper Products !</a></li>
			<% if(logged) { %>
			<li><a href="<%= contextPath %>/auth/addProduct">Add a Product</a></li>
			<li><a href="<%= contextPath %>/auth/addCategory">Add a Category</a></li>
			<li><a href="<%= contextPath %>/logout">Logout</a></li>
			<% } else { %>
			<li><a href="<%= contextPath %>/login">Login</a></li>
			<% } %>
		</ul>
	</nav>
</header>