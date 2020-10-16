<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>requester success</h3>
	<table border="1">
		<tr>
			<th>Requester Id</th>
			<th>Patient name</th>
			<th>Required blood</th>
			<th>City</th>
			<th>Doctor Name</th>
			<th>HospitalnameAddress</th>
			<th>Date</th>
			<th>Contact name</th>
			<th>Contact number</th>
			<th>Email</th>
			<th>Message</th>
			<th>Status</th>



		</tr>
		<c:forEach items="${reqList}" var="request">
			<tr>
				<td>${request.rId}</td>
				<td>${request.patientName}</td>
				<td>${request.requiredBlood}</td>
				<td>${request.city}</td>
				<td>${request.doctorName}</td>
				<td>${request.hospitalNameAddress}</td>
				<td>${request.date}</td>
				<td>${request.contactName}</td>
				<td>${request.contactNumber}</td>
				<td>${request.emailId}</td>
				<td>${request.message}</td>
				<td>${request.status}</td>




			</tr>
		</c:forEach>
	</table>

</body>
</html>