package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.util.DbConnection;
public class UpdateServlet extends HttpServlet 
{
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String userid=request.getParameter("user_id");
		Connection conn=null;
		Statement stmt=null;
		try
		{
			conn=DbConnection.getConn();
			stmt=conn.createStatement();
			String updateQuery="select * from user where user_id="+userid;
			System.out.println(updateQuery);
			ResultSet rs=stmt.executeQuery(updateQuery);
			request.setAttribute("resultset", rs);
			RequestDispatcher rd=request.getRequestDispatcher("UpdateUser.jsp");
			rd.forward(request, response);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
