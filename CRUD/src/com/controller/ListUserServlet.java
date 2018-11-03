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
public class ListUserServlet extends HttpServlet 
{
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{		
		Connection conn=null;
		Statement stmt=null;
		try
		{
			conn=DbConnection.getConn();
			stmt=conn.createStatement();
			String selectQuery="select * from user";
			ResultSet rs=stmt.executeQuery(selectQuery);
			request.setAttribute("ResultSet", rs);
			RequestDispatcher rd=request.getRequestDispatcher("ListUser.jsp");
			rd.forward(request, response);
		}
		catch(Exception e)
		{
		}
	}
}