<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${headerMsg} 
Hi ${studentDetails.studentName}, you have successfully applied for class ${studentDetails.studentClass}
<table>

<tr>
<td>Name:</td>	<td>${studentDetails.studentName}</td>
</tr>

<tr>
<td>Class:</td>	<td>${studentDetails.studentClass}</td>
</tr>

<tr>
<td>DOB:</td>	<td>${studentDetails.studentDOB}</td>
</tr>

<tr>
<td>MobileNum:</td>	<td>${studentDetails.studentMobile}</td>
</tr>

</table>

<table>
<tr>
<td>Address:</td>	
</tr>

<tr>
<td>City:</td>	<td>${studentDetails.studentAddress.city}</td>
</tr>

<tr>
<td>Country:</td>	<td>${studentDetails.studentAddress.country}</td>
</tr>
</table>


</body>
</html>