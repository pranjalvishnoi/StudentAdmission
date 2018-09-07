<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="<spring:theme code='styleSheet'/>" type="text/css" />
<!-- <meta charset="ISO-8859-1"> -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>

<h3>${headerMsg}</h3>
 
<spring:message code="label.Head" />
<form action="submitForm" method="post">
<table>

<tr>
<td><spring:message code="label.studentName" />: </td>	<td><input type="text" name="studentName"></td>
</tr>

<tr>
<td><spring:message code="label.Class" />:</td>	<td><input type="text" name="studentClass" id="studentClass"></td>
</tr>

<tr>
<td><spring:message code="label.DOB" />:</td>	<td><input type="text" name="studentDOB"></td> 
</tr>

<tr>
<td><spring:message code="label.MobileNum" />:</td>	<td><input type="text" name="studentMobile"></td>
</tr>

<tr>
<td><spring:message code="label.Extra" />:</td>	<td><input type="text" name="studentExtra"></td>
</tr>

<tr>
<td><spring:message code="label.Address" />:</td>	
</tr>

<tr>
<td><spring:message code="label.City" />:</td>	<td><input type="text" name="studentAddress.city"></td>
</tr>

<tr>
<td><spring:message code="label.Country" />:</td>	<td><input type="text" name="studentAddress.country"></td>
</tr>


<tr> 
<td><input type="submit" value="Submit"></td>
</tr>
</table>


</form>

<a href="/StudentAdmission/admission?siteTheme=red">Red</a>
<a href="/StudentAdmission/admission?siteTheme=green">Green</a>

<a href="/StudentAdmission/admission?siteLanguage=en">English</a>
<a href="/StudentAdmission/admission?siteLanguage=fr">French</a>

</body>
</html>