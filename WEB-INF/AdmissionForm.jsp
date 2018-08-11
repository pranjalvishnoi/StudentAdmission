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
<form action="submitForm" method="post">
<table>

<tr>
<td>Name:</td>	<td><input type="text" name="studentName"></td>
</tr>

<tr>
<td>Class:</td>	<td><input type="text" name="studentClass"></td>
</tr>

<tr>
<td>DOB:</td>	<td><input type="text" name="studentDOB"></td> 
</tr>

<tr>
<td>MobileNum:</td>	<td><input type="text" name="studentMobile"></td>
</tr>

</table>

<table>
<tr>
<td>Address:</td>	
</tr>

<tr>
<td>City:</td>	<td><input type="text" name="studentAddress.city"></td>
</tr>

<tr>
<td>Country:</td>	<td><input type="text" name="studentAddress.country"></td>
</tr>


<tr> 
<td><input type="submit" value="Submit"></td>
</tr>

</table>


</form>
</body>
</html>