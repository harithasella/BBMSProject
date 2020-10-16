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
	<h3>Donor Registration Form</h3>
	<c:url var="action" value="/saveDonor"></c:url>
	<form:form action="${action}" method="post" commandName="donorForm"
		novalidate="novalidate">
		<table>
			<tr>
				<td>Patient id:</td>
				<td><form:input path="pid" /><font color="red"><form:errors
							path="pid" /></font></td>
			</tr>
			<tr>
				<td>Time of the Day:</td>
				<td><form:input path="time" /><font color="red"><form:errors
							path="time" /></font></td>
			</tr>
			<tr>
				<td>Blood glucose level:</td>
				<td><form:input path="bgl" /><font color="red"><form:errors
							path="bgl" /></font></td>
			</tr>
			<tr>
				<td>Notes:</td>
				<td><form:input path="notes" /><font color="red"><form:errors
							path="notes" /></font></td>
			</tr>


			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>