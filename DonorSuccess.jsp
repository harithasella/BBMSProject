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
	<h3>donor success</h3>
	<table border="1">
		<tr>
			<th>Patient Id</th>
			<th>Time</th>
			<th>Blood Glucose level</th>
			<th>Notes</th>
			<th>Edit</th>



		</tr>
		<c:forEach items="${donorlist}" var="donor">
			<tr>
				<td>${donor.pid}</td>
				<td>${donor.time}</td>
				<td>${donor.bgl}</td>
				<td>${donor.notes}</td>


				<td><a href="<c:url value="/fetchByDonorId/${donor.pid}"/>">
						<img src="<c:url value='/images/vcard_edit.png'/>" title="Edit" />
				</a></td>


			</tr>
		</c:forEach>
	</table>

</body>
</html>