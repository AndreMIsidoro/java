<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<html>
	<head>
		<title>Welcome</title>
	</head>
	<body>
		<h2>Welcome</h2>
		<hr>
			<p>
				User: <security:authentication property="principal.username"/>
				Role: <security:authentication property="principal.authorities"/>
			</p>
		<hr>
		
		<security:authorize access="hasRole('MANAGER')">
			<hr>
				<p>
					<a href="${pageContext.request.contextPath}/leaders">Leadership Meeting (only for Managers)</a>
				</p>
			
			<hr>
		
		</security:authorize>
		<security:authorize access="hasRole('ADMIN')">
		<hr>
			<p>
				<a href="${pageContext.request.contextPath}/systems">IT Systems Meeting (only for Admins)</a>
			</p>
		
		<hr>
		</security:authorize>
		<p>
		Welcome to the Company Home Page
		</p>
		<form:form action="${pageContext.request.contextPath}/logout" method="POST">
			<input type="submit" value="Logout"/>
		</form:form>
	</body>
</html>