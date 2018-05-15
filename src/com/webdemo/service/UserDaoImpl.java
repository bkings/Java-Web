package com.webdemo.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.webdemo.models.User;

public class UserDaoImpl {

	Connection con = null;
	
	public void signup(User u){
		
		con = DB.getDbcon();
		String sql = "insert into user(FirstName,LastName,UserName,Password)values(?,?,?,?)";
		
		try {
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setString(1, u.getFname());
			pstm.setString(2, u.getLname());
			pstm.setString(3, u.getUsername());
			pstm.setString(4, u.getPassword());
			pstm.execute();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		public boolean userLogin(String un,String psw){
			
			con = DB.getDbcon();
			String sql = "select * from user where UserName = '"+un+"' and Password = '"+psw+"' ";
			
			try {
				Statement stm = con.createStatement();
				ResultSet rs = stm.executeQuery(sql);
				if(rs.next()){
					return true;
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return false;
			
			
		}
	
		
	}
	

