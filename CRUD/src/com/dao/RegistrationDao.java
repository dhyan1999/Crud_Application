package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.bean.RegBean;
import com.util.DbConnection;

public class RegistrationDao {

	public void register(RegBean bean)
	{
		Connection conn;
		try{
			conn = DbConnection.getConn();
			PreparedStatement pst = conn.prepareStatement(""
					+ "insert into emp (firstname,lastname,gender,country,"
					+ "hobbies,contact) values (?,?,?,?,?,?) ");
			pst.setString(1, bean.getFname());
			pst.setString(2, bean.getLname());
			pst.setString(3, bean.getGender());
			pst.setString(4, bean.getCountry());
			pst.setString(5, bean.getHobby());
			pst.setString(6, bean.getContact());
			
			pst.executeUpdate();
			

		} catch(Exception e){
			e.printStackTrace();
		}
		
		}
}
