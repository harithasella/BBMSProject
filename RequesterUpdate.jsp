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
	<h3>Requester Updation Form</h3>
	<c:url var="action" value="/editReq"></c:url>
	<form:form action="${action}" method="post" commandName="editForm"
		novalidate="novalidate">

		<table>
			<tr>
				<td>Patient id:</td>
				<td><form:input path="rId" readonly="true" /><font color="red"><form:errors
							path="rId" /></font></td>
			</tr>
			<tr>
				<td>Patient Name:</td>
				<td><form:input path="patientName" /><font color="red"><form:errors
							path="patientName" /></font></td>
			</tr>
			<tr>
				<td>Required Blood Group:</td>
				<td><form:input path="requiredBlood" /><font color="red"><form:errors
							path="requiredBlood" /></font></td>
			</tr>
			<tr>
				<td>City:</td>
				<td><form:input path="city" /><font color="red"><form:errors
							path="city" /></font></td>
			</tr>
			<tr>
				<td>Doctor Name:</td>
				<td><form:input path="doctorName" /><font color="red"><form:errors
							path="doctorName" /></font></td>
			</tr>
			<tr>
				<td>Hospital Name And Address:</td>
				<td><form:input path="hospitalNameAddress" /><font color="red"><form:errors
							path="hospitalNameAddress" /></font></td>
			</tr>
			<tr>
				<td>Date:</td>
				<td><form:input type="date" path="date" /><font color="red"><form:errors
							path="date" /></font></td>
			</tr>
			<tr>
				<td>Contact Name:</td>
				<td><form:input path="contactName" /><font color="red"><form:errors
							path="contactName" /></font></td>
			</tr>
			<tr>
				<td>Contact Number:</td>
				<td><form:input path="contactNumber" /><font color="red"><form:errors
							path="contactNumber" /></font></td>
			</tr>
			<tr>
				<td>Email Id:</td>
				<td><form:input type="email" path="emailId" /><font color="red"><form:errors
							path="emailId" /></font></td>
			</tr>
			<tr>
				<td>Message:</td>
				<td><form:input path="message" /><font color="red"><form:errors
							path="message" /></font></td>
			</tr>
			<tr>
				<td>Status:</td>
				<td>Accept<form:radiobutton path="status" value="Accept" />
					Reject<form:radiobutton path="status" value="Reject" />
				</td>
			</tr>

			<tr>
				<td><input type="submit" value="SUBMIT" /></td>
			</tr>
		</table>




	</form:form>
</body>
</html>