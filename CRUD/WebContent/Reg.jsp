<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="RegServlet">
<center>
<h1><u><b>Registration-Form</b></u></h1>
<table>
<tr>
<td>First Name : <input type="text" name="fname"></td>
<tr>
<td>Last Name : <input type="text" name="lname"></td>
<tr>
<td>Gender : <input type="radio" name="gender" value="male">Male&nbsp;&nbsp;&nbsp;&nbsp;
<input type="radio" name="gender"  value="female">Female</td>
<tr>
<td>
<select name="country">
	<option value="India">India</option>
	<option value="USA">USA</option>
	<option value="Canada">Canada</option>
</select></td>
<tr>
<td>Hobby : <input type="checkbox" name="hobby" value="programming">Programming
		<input type="checkbox" name="hobby" value="cricket">Cricket
		<input type="checkbox" name="hobby"  value="hacking">Hacking</td>
<tr>
<td>Contact : <input type="text" name="cnt"></td> 
<tr>
<td><input type="submit" value="Save"></td>
</center>
</form>
</body>
</html>