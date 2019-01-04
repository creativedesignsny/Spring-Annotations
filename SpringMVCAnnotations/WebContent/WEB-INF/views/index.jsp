<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to the Simple Application</h1>
	<div class="container">
		<form:form action="userInfo" method="POST" modelAttribute="userkey">
			<div class="field-style">
				<label>User Name</label>
				<form:input type="text" id="username" path="username" />
				<form:errors path="username"></form:errors>
			</div>
			<div class="sub-field">
				<label>Password</label>
				<form:input type="text" id="password" path="password" ></form:input>
				<form:errors path="password"></form:errors>
			</div>
			<div class="sub-field">
				<label>Email</label>
				<input type="text" id="email" name="email" />
			</div>
			<div class="sub-field">
				<label>Date of Birth</label>
				<form:input type="text" id="dob" path="dob" ></form:input>
				<form:errors path="dob"></form:errors>
			</div>			
			<div class="btn">
				<input type="submit" name="submit" value="submit">
			</div>								
		</form:form>
	</div>
</body>
</html>