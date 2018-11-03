<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	ResultSet rs=(ResultSet)request.getAttribute("resultset");
	String username=null;
	String password=null;
	String userid=null;
	while(rs.next())
	{
		 userid=rs.getString("user_id");
		 username=rs.getString("username");
		 password=rs.getString("password");
	}
%>
<form action="UserServlet">
<input type="hidden" name="user_id" value="<%=userid%>"/>
Username : <input type="text" name="username" value="<%=username%>"><br>
Password : <input type="password" name="password" value="<%=password%>"><br>
<input type="submit" value="submit">
</form>
</body>
</html>