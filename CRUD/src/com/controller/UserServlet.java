package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.util.DbConnection;
public class UserServlet extends HttpServlet 
{
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//System.out.println(request.getQueryString());
		String userid=request.getParameter("user_id");
	//	System.out.println("User Id = "+userid);
		String uname=request.getParameter("username");
		String password=request.getParameter("password");
		Connection conn=null;
		Statement stmt=null;
		try
		{
			conn=DbConnection.getConn();
			stmt=conn.createStatement();
			String UpdateQuery="update user set username='"+uname+"' where user_id="+userid;
			System.out.println(UpdateQuery);
			stmt.executeUpdate(UpdateQuery);
			response.sendRedirect("ListUserServlet");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
