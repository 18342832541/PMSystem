package com.neu.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.neu.entity.Empl;
import com.neu.util.DBUtils;

public class EmplDaoImpl implements EmplDao {

	@Override
	public int insert(Empl empl) throws Exception {
		String sql = "insert into empl(employeeId,name,sex,birthDate,idNumber,"
				+ "dept,job,hiredate,sal) values(?,?,?,?,?,?,?,?,?)";
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
		String sql = "update empl set employeeId=?,name=?,sex=?,birthDate=?,idNumber=?,"
				+ "dept=?,job=?,hiredate=?,sal=?";
		
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
	public int delete(int employeeId) throws Exception {
		String sql = "delete from empl where employeeId = ?";
		
		DBUtils util = new DBUtils();
		
		int n = util.executeUpdate(sql, employeeId);
		
		return n;
	}

	@Override
	public List<Empl> getLikeName(String ename) throws Exception {
		String sql = "select * from empl where ename like ?";
		
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
			
			sex = rs.getString("sex");
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
	public List<Empl> getAll() throws Exception {
String sql = "select * from empl";
		
		DBUtils util = new DBUtils();
		Connection connection = util.getConnection();
		
		ResultSet rs = util.executeQuery(connection, sql);
		
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
			
			sex = rs.getString("sex");
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
		// TODO Auto-generated method stub
		return null;
	}

}
