package com.util;
import java.sql.Connection;
import java.sql.DriverManager;
public class DbConnection      
{                              
	public static Connection getConn()
	{
		String username = "root";
		String password = "root";
		String url = "jdbc:mysql://localhost:3306/test";
		String drivername = "com.mysql.jdbc.Driver";
		Connection conn=null;
		try 
		{
			Class.forName(drivername);//load class Driver;
			conn=DriverManager.getConnection(url, username, password);
			if(conn==null)
			{
				System.out.println("Db is not Connected");
			}
			else
			{
				System.out.println("Db is Connected");
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return conn;
	}
	public static void main(String[] args) 
	{
		getConn();
	}
}