package com.neu.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.neu.entity.Empl;
import com.neu.util.DBUtils;

public class EmplDaoImpl implements EmplDao {

	@Override
	public int insert(Empl empl) throws Exception {
		String sql = "insert into empl(employeeId,name,gender,birthDate,idNumber,"
				+ "dept,job,hiredate,sal) values(?,?,?,?,?,?,?,?,?)";
		if(empl.getSex().equals("1")) {
			empl.setSex("男");
		}else if(empl.getSex().equals("2")){
			empl.setSex("女");
		}
		if(empl.getDept().equals("1")) {
			empl.setDept("研发一部");
		}else if(empl.getDept().equals("2")){
			empl.setDept("研发二部");
		}
		if(empl.getJob().equals("1")) {
			empl.setJob("软件工程师");
		}else if(empl.getJob().equals("2")){
			empl.setJob("高级软件工程师");
		}
		Object[] params = {
				empl.getEmployeeId(),
				empl.getName(),
				empl.getSex(),
				empl.getBirthDate(),
				empl.getIdNumber(),
				empl.getDept(),
				empl.getJob(),
				empl.getHiredate(),
				empl.getSal()
		};
		
		DBUtils util = new DBUtils();
		
		int n = util.executeUpdate(sql, params);
		
		return n;
	}

	@Override
	public int update(Empl empl) throws Exception {
		String sql = "update empl set name=?,gender=?,birthDate=?,idNumber=?,hiredate=?,sal=? where employeeId=?";
		
		if(empl.getSex().equals("1")) {
			empl.setSex("男");
		}else if(empl.getSex().equals("2")){
			empl.setSex("女");
		}
		//kong
		if(empl.getDept().equals("1")) {
			empl.setDept("研发一部");
		}else if(empl.getDept().equals("2")){
			empl.setDept("研发二部");
		}
		if(empl.getJob().equals("1")) {
			empl.setJob("软件工程师");
		}else if(empl.getJob().equals("2")){
			empl.setJob("高级软件工程师");
		}
		Object[] params = {				
				empl.getName(),
				empl.getSex(),
				empl.getBirthDate(),
				empl.getIdNumber(),
				empl.getHiredate(),
				empl.getSal(),
				empl.getEmployeeId()
		};
		
		DBUtils util = new DBUtils();
		
		int n = util.executeUpdate(sql, params);
		
		return n;
	}

	@Override
	public int delete(int employeeId) throws Exception {
		String sql = "delete from empl where employeeId = ?";
		
		DBUtils util = new DBUtils();
		
		int n = util.executeUpdate(sql, employeeId);
		
		return n;
	}

	@Override
	public List<Empl> getLikeName(String ename) throws Exception {
		String sql = "select * from empl where name like ?";
		
		DBUtils util = new DBUtils();
		Connection connection = util.getConnection();
		
		ResultSet rs = util.executeQuery(connection, sql,"%"+ename+"%");
		
		Empl empl = null;
		 Integer employeeId;
		 String name;
		 String sex;
		 String birthDate;
		 String idNumber;
		 String dept;
		 String job;
		  Date hiredate;
		 Double sal;
		
		List<Empl> list = new ArrayList<>();
		while(rs.next()) {
			employeeId = rs.getInt("employeeId");
			name = rs.getString("name");
			
			sex = rs.getString("gender");
			birthDate = rs.getString("birthDate");
			idNumber = rs.getString("idNumber");
			dept = rs.getString("dept");
			job = rs.getString("job");
			hiredate = rs.getDate("hiredate");
			sal = rs.getDouble("sal");
			
			
			empl = new Empl(employeeId, name, sex, birthDate, idNumber, dept, job, hiredate, sal);
			list.add(empl);
		}
		
		util.closeConnection(connection);
		return list;
	}

	@Override
	public Empl getById(Integer id) throws Exception {
		String sql = "select * from empl where employeeId = ?";
		
		DBUtils util = new DBUtils();
		Connection connection = util.getConnection();
		
		ResultSet rs = util.executeQuery(connection, sql, id);
		
		Empl empl = null;
		Integer employeeId;
		 String name;
		 String sex;
		 String birthDate;
		 String idNumber;
		 String dept;
		 String job;
		 Date hiredate;
		 Double sal;
		
		if(rs.next()) {
			employeeId = id;
			name = rs.getString("name");
			
			sex = rs.getString("gender");
			birthDate = rs.getString("birthDate");
			idNumber = rs.getString("idNumber");
			dept = rs.getString("dept");
			job = rs.getString("job");
			hiredate = rs.getDate("hiredate");
			
			sal = rs.getDouble("sal");		
			
			empl = new Empl(employeeId, name, sex, birthDate, idNumber, dept, job, hiredate, sal);
		}
		
		util.closeConnection(connection);
		return empl;
	}

	@Override
	public List<Empl> getPaged(int pageSize, int pageNum) throws Exception{
		String sql = "select * from empl limit ?,?";
		
		DBUtils util = new DBUtils();
		Connection connection = util.getConnection();
		
		ResultSet rs = util.executeQuery(connection, sql, (pageNum-1)*pageSize, pageSize);
		
		Empl empl = null;
		Integer employeeId;
		 String name;
		 String sex;
		 String birthDate;
		 String idNumber;
		 String dept;
		 String job;
		 Date hiredate;
		 Double sal;
		
		List<Empl> list = new ArrayList<>();
		while(rs.next()) {
			employeeId = rs.getInt("employeeId");
			name = rs.getString("name");
			
			sex = rs.getString("gender");
			birthDate = rs.getString("birthDate");
			idNumber = rs.getString("idNumber");
			dept = rs.getString("dept");
			job = rs.getString("job");
			hiredate = rs.getDate("hiredate");
			
			sal = rs.getDouble("sal");		
			empl = new Empl(employeeId, name, sex, birthDate, idNumber, dept, job, hiredate, sal);
			list.add(empl);
			}
		util.closeConnection(connection);
		return list;
	}
	
	@Override
	public int count() throws Exception {
		DBUtils db = new DBUtils() ;
	    String sql= "select count(*) from empl ";
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
