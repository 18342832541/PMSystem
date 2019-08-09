package com.neu.dao;

import java.sql.Connection;
import java.sql.ResultSet;

import com.neu.entity.Loginer;
import com.neu.util.DBUtils;

public class LoginerDaoImpl implements LoginerDao {
    private DBUtils db =new   DBUtils();
	@Override
	public int update(Loginer loginer) throws Exception {
	String sql="update loginer set username=?,password=?";
	         int n = db.executeUpdate(sql,loginer.getUsername(),loginer.getPassword());
		     return n;	
	}

	@Override
	public Loginer getByName(String username) throws Exception {
	String sql="select * from loginer where username=?";
     Connection connection = db.getConnection();
	  ResultSet rs = db.executeQuery(connection, sql, username);
	  Loginer loginer =null;
	  String password;
	  Integer id;
	  if(rs.next()) {
		  id =rs.getInt("id");
		  password=rs.getString("password");
		  loginer=new Loginer (id,username,password);
	  }
		 db.closeConnection(connection);
		 return loginer;	
	}

	@Override
	public Loginer getByAll(String username, String password) throws Exception {
		String sql="select * from loginer where username=? and password=?";
	     Connection connection = db.getConnection();
		  ResultSet rs = db.executeQuery(connection, sql, username, password);
		  Loginer loginer =null;
		  Integer id;
		  if(rs.next()) {
			  id =rs.getInt("id");
			  loginer=new Loginer (id,username,password);
		  }
			 db.closeConnection(connection);
			 return loginer;	
	}

}
