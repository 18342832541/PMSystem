package com.neu.dao;

import java.sql.Connection;


import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.neu.entity.Dept;
import com.neu.util.DBUtils;

public class DeptDaoImpl implements DeptDao {
	DBUtils db = new DBUtils();
	
	@Override
	public List<Dept> getAll() throws Exception {
		String sql = "select * from deptmgr order by id";
		
		Connection connection = db.getConnection();
		
		ResultSet rs = db.executeQuery(connection, sql);
		
		List<Dept> list = new ArrayList<>();
		
		Dept dept = null;
		Integer id;
		String dname;
		String type;
		Integer phone;
		String email;
		String depict;
		String mgr;
		Date date;
		while(rs.next()) {
			id = rs.getInt("id");
			dname = rs.getString("dname");	
			type = rs.getString("type");
			phone = rs.getInt("phone");
			email = rs.getString("email");
			depict = rs.getString("depict");
			mgr = rs.getString("mgr");
			date = rs.getDate("date");
			dept = new Dept(id,dname,type,phone,email,depict,mgr,date);	
			list.add(dept);
		}
		
		db.closeConnection(connection);
		return list;
	}
	
	@Override
	public int add(Dept dept) throws Exception {
		String sql = "insert into deptmgr(id,dname,type, phone,email,depict,mgr, date) values(?,?,?,?,?,?,?,?)";
		Object[] params = {
				dept.getId(),
				dept.getDname(),
				dept.getType(),
				dept.getPhone(),
				dept.getEmail(),
	            dept.getDepict(),
				dept.getMgr(),
				dept.getDate()
				
		};
		
		int n = db.executeUpdate(sql, params);
		
		return n;
	}
	@Override
	public Dept getById(int id) throws Exception {
		
	String sql = "select * from deptmgr where id =?";
		
		Connection connection = db.getConnection();
		
		ResultSet rs = db.executeQuery(connection, sql,id);
		Dept dept = null;
		String dname;
		String type;
		Integer phone;
		String email;
		String depict;
		String mgr;
		Date date;
		while(rs.next()) {
			dname = rs.getString("dname");	
			type = rs.getString("type");
			phone = rs.getInt("phone");
			email = rs.getString("email");
			depict = rs.getString("depict");
			mgr = rs.getString("mgr");
			date = rs.getDate("date");
			dept = new Dept(id,dname,type,phone,email,depict,mgr,date);	
		}
		db.closeConnection(connection);
		return dept;
	}

	@Override
	public int delete(int id) throws Exception {

		String sql = "delete from deptmgr where id =?";
		
		int n = db.executeUpdate(sql, id);
		return n;
	}
	@Override
	public int update(Dept dept) throws Exception {
		
		String sql = "update deptmgr set dname=?,type=?,phone=?,email=?,depict=?,mgr=?,date=? where id=?";
		
		int n = db.executeUpdate(sql, dept.getDname(),dept.getType(),dept.getPhone(),dept.getEmail(),dept.getDepict(),dept.getMgr(),dept.getDate(),dept.getId());
		
		return n;
	}
	@Override
	public List<Dept> getPaged(int pageSize, int pageNum) throws Exception {
    String sql = "select * from deptmgr order by id limit ?,?";
		
		Connection connection = db.getConnection();
		ResultSet rs = db.executeQuery(connection, sql,(pageNum-1)*pageSize,pageSize);
		
		List<Dept> list = new ArrayList<>();
		Dept dept = null;
		Integer id;
		String dname;
		String type;
		Integer phone;
		String email;
		String depict;
		String mgr;
		Date date;
		while(rs.next()) {
			id = rs.getInt("id");
			dname = rs.getString("dname");	
			type = rs.getString("type");
			phone = rs.getInt("phone");
			email = rs.getString("email");
			depict = rs.getString("depict");
			mgr = rs.getString("mgr");
			date = rs.getDate("date");
			dept = new Dept(id,dname,type,phone,email,depict,mgr,date);	
			list.add(dept);
		}
		
		db.closeConnection(connection);
		return list;
	}
		
		

	@Override
	public int count() throws Exception {

		    String sql= "select count(*) from deptmgr ";
		    Connection connection = db.getConnection();
		    ResultSet rs = db.executeQuery(connection, sql);
		    int count=0;
		    if(rs.next()) {
				count = rs.getInt(1);
			}
			
			db.closeConnection(connection);
			return count;	
	
	}
}
