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
		String sql = "insert into employeeinformation(employeeId,name,gender,birthDate,idNumber,"
				+ "emp,job,hiredate,startJobDate,employmentForm,personSource,politicsStatus,nation,"
				+ "nativePlace,telephone,email,height,bloodType,maritalStatus,naPlace,birthPlace"
				+ "hkadr,highestEducation,highestDegree,graduateSchool,major,graduationDate) values(?,?,?,?,?,?,?,?,?,?,?,?"
				+ ",?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		Object[] params = {
				empl.getEmployeeId(),
				empl.getName(),
				empl.getGender(),
				empl.getBirthDate(),
				empl.getIdNumber(),
				empl.getEmp(),
				empl.getJob(),
				empl.getHiredate(),
				empl.getStartJobDate(),
				empl.getEmploymentForm(),
				empl.getPersonSource(),
				empl.getPoliticsStatus(),
				empl.getNation(),
				empl.getNativePlace(),
				empl.getTelephone(),
				empl.getEmail(),
				empl.getHeight(),
				empl.getBloodType(),
				empl.getMaritalStatus(),
				empl.getNaPlace(),
				empl.getBirthPlace(),
				empl.getHkadr(),
				empl.getHighestEducation(),
				empl.getHighestDegree(),
				empl.getGraduateSchool(),
				empl.getMajor(),
				empl.getGraduationDate()	
		};
		
		DBUtils util = new DBUtils();
		
		int n = util.executeUpdate(sql, params);
		
		return n;
	}

	@Override
	public int update(Empl empl) throws Exception {
		String sql = "update employeeinformation set employeeId=?,name=?,gender=?,birthDate=?,idNumber=?,"
				+ "emp=?,job=?,hiredate=?,startJobDate=?,employmentForm=?,personSource=?,politicsStatus=?,nation=?,"
				+ "nativePlace=?,telephone=?,email=?,height=?,bloodType=?,maritalStatus=?,naPlace=?,birthPlace=?"
				+ "hkadr=?,highestEducation=?,highestDegree=?,graduateSchool=?,major=?,graduationDate=?";
		
		Object[] params = {				
				empl.getEmployeeId(),
				empl.getName(),
				empl.getGender(),
				empl.getBirthDate(),
				empl.getIdNumber(),
				empl.getEmp(),
				empl.getJob(),
				empl.getHiredate(),
				empl.getStartJobDate(),
				empl.getEmploymentForm(),
				empl.getPersonSource(),
				empl.getPoliticsStatus(),
				empl.getNation(),
				empl.getNativePlace(),
				empl.getTelephone(),
				empl.getEmail(),
				empl.getHeight(),
				empl.getBloodType(),
				empl.getMaritalStatus(),
				empl.getNaPlace(),
				empl.getBirthPlace(),
				empl.getHkadr(),
				empl.getHighestEducation(),
				empl.getHighestDegree(),
				empl.getGraduateSchool(),
				empl.getMajor(),
				empl.getGraduationDate()	
		};
		
		DBUtils util = new DBUtils();
		
		int n = util.executeUpdate(sql, params);
		
		return n;
	}

	@Override
	public int delete(int employeeId) throws Exception {
		String sql = "delete from employeeinformation where employeeId = ?";
		
		DBUtils util = new DBUtils();
		
		int n = util.executeUpdate(sql, employeeId);
		
		return n;
	}

	@Override
	public List<Empl> getLikeName(String ename) throws Exception {
		String sql = "select * from employeeinformation where ename like ?";
		
		DBUtils util = new DBUtils();
		Connection connection = util.getConnection();
		
		ResultSet rs = util.executeQuery(connection, sql,"%"+ename+"%");
		
		Empl empl = null;
		 Integer employeeId;
		 String name;
		 String gender;
		 Date birthDate;
		 String idNumber;
		 String emp;
		 String job;
		  Date hiredate;
		  Date startJobDate;
		 String employmentForm;
		 String personSource;
		 String politicsStatus;
		 String nation;
		   String nativePlace;
		 String telephone;
		 String email;
		 String height;
		  String bloodType;
		  String maritalStatus;
		 String naPlace;
		  String birthPlace;
		   String hkadr;
		   String highestEducation;
		  String highestDegree;
		   String graduateSchool;
		   String major;
		   String graduationDate;
		
		List<Empl> list = new ArrayList<>();
		while(rs.next()) {
			employeeId = rs.getInt("employeeId");
			name = rs.getString("name");
			
			gender = rs.getString("gender");
			birthDate = rs.getDate("birthDate");
			idNumber = rs.getString("idNumber");
			emp = rs.getString("emp");
			job = rs.getString("job");
			hiredate = rs.getDate("hiredate");
			
			startJobDate = rs.getDate("startJobDate");
			employmentForm= rs.getString("employmentForm");
			personSource = rs.getString("personSource");
			
			politicsStatus = rs.getString("politicsStatus");
			nation = rs.getString("nation");
			nativePlace = rs.getString("nativePlace");			
			telephone =  rs.getString("telephone");
			email= rs.getString("email");
			height = rs.getString("height");
			
			bloodType = rs.getString("bloodType");
			maritalStatus = rs.getString("maritalStatus");
			nativePlace = rs.getString("nativePlace");			
			naPlace =  rs.getString("naPlace");
			
			birthPlace= rs.getString("birthPlace");
			height = rs.getString("height");
			
			bloodType = rs.getString("bloodType");
			hkadr = rs.getString("hkadr");
			highestEducation = rs.getString("highestEducation");			
			highestDegree =  rs.getString("highestDegree");
			
			graduateSchool = rs.getString("graduateSchool");
			major = rs.getString("major");
			graduationDate = rs.getString("graduationDate");			
			
			
			empl = new Empl(employeeId, name, gender, birthDate, idNumber, emp, job, hiredate, startJobDate, employmentForm, personSource, politicsStatus, nation, nativePlace, telephone, email, height, bloodType, maritalStatus, naPlace, birthPlace, hkadr, highestEducation, highestDegree, graduateSchool, major, graduationDate);
			list.add(empl);
		}
		
		util.closeConnection(connection);
		return list;
	}

}
