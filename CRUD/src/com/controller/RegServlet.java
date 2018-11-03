package com.controller;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.RegBean;
import com.dao.RegistrationDao;
import com.util.DbConnection;
public class RegServlet extends HttpServlet 
{	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		RegistrationDao dao = new RegistrationDao();
		RegBean bean = new RegBean();
		bean.setFname(request.getParameter("fname"));
		bean.setCountry(request.getParameter("country"));
		bean.setLname(request.getParameter("lname"));
		bean.setGender(request.getParameter("gender"));
		String hobby[]=request.getParameterValues("hobby");
		String hobbyConcat="";
		for (int i = 0; i < hobby.length; i++) 
		{
			if (i <= (hobby.length-2)) 
			{
				hobbyConcat =hobbyConcat.concat(hobby[i])+",";
			}
			else 
			{
				hobbyConcat =hobbyConcat.concat(hobby[i])+".";
			} 
		}
		bean.setHobby(hobbyConcat);
		bean.setContact(request.getParameter("cnt"));
		dao.register(bean);
		
		/*Connection conn=null;
		Statement stmt=null;
		try
		{
			conn=DbConnection.getConn();
			stmt=conn.createStatement();
			String insertQuery="insert into emp (firstname,lastname,gender,country,hobbies,contact) values ('"+fname+"','"+lname+"','"+gender+"','"+country+"','"+hobbyConcat+"','"+contact+"')";
			System.out.println("insertQuery : " + insertQuery);
			stmt.executeUpdate(insertQuery);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
	}
}
