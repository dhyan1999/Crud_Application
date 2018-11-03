package com.controller;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.util.DbConnection;
public class LoginServlet extends HttpServlet 
{	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		Connection conn=null;
		Statement stmt=null; // query
		try
		{
			conn=DbConnection.getConn();
			stmt=conn.createStatement();
			String insertQuery="insert into user(username,password) values ('"+username+"','"+password+"')";
			System.out.println(insertQuery);
			int i=stmt.executeUpdate(insertQuery);
			if(i==0)
			{
				System.out.println("Record not inserted");
			}
			else
			{
				response.sendRedirect("ListUserServlet");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}