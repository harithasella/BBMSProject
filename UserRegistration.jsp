<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Registration Page</title>
</head>
<body>
	<h3>User Registration Form</h3>
	<c:url var="action" value="/saveForm"></c:url>
	<form:form action="${action}" method="post" commandName="userForm"
		novalidate="novalidate">
		<table>

			<tr>
				<td>First Name:</td>
				<td><form:input path="fname" /><font color="red"><form:errors
							path="fname" /></font></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><form:input path="lname" /><font color="red"><form:errors
							path="fname" /></font></td>
			</tr>
			<tr>
				<td>Blood group:</td>
				<td><form:input path="blood_group" /><font color="red"><form:errors
							path="blood_group" /></font></td>
			</tr>
			<tr>
				<td>City:</td>
				<td><form:input path="city" /><font color="red"><form:errors
							path="city" /></font></td>
			</tr>

			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>