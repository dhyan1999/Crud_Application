package com.controller;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.util.DbConnection;
public class DeleteServletNew extends HttpServlet 
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
			String deleteQuery="delete from user where user_id="+userid;
			stmt.executeUpdate(deleteQuery);
			response.sendRedirect("ListUserServlet");			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}