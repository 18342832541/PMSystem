package com.neu.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.neu.entity.DeptTransLogs;
import com.neu.entity.InEmpLogs;
import com.neu.entity.OutEmpLogs;
import com.neu.entity.PersonnelLogs;
import com.neu.entity.PostTransLogs;
import com.neu.util.DBUtils;

public class LogsDaoImpl implements LogsDao {
	private DBUtils util = new DBUtils();
	private SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");

	@Override
	public List<InEmpLogs> getInEmpLogs(Date startTime, Date endTime, int pageSize, int pageNum) throws Exception {
		String sql= "select * from inemplogs where logsDate between ? and ? limit ?,?";
		Connection connection = util.getConnection();
		
		ResultSet rs = util.executeQuery(connection, sql, f.format(startTime), f.format(endTime), (pageNum-1)*pageSize,pageSize);
		
		Integer id ;
		String dName;
		String pName;
		String eName;
		String gender;
		Date hiredate;
		String education;
		Date logsDate;
		InEmpLogs in = null;
		List<InEmpLogs> list = new ArrayList<InEmpLogs>();
		while(rs.next()) {
			id = rs.getInt("id");
			dName = rs.getString("dName");
			pName = rs.getString("pName");
			eName = rs.getString("eName");
			gender = rs.getString("gender");
			hiredate = rs.getDate("hiredate");
			education = rs.getString("education");
			logsDate = rs.getDate("logsDate");
			in = new InEmpLogs(id, dName, pName, eName, gender, hiredate, education, logsDate);
			list.add(in);
		}
		util.closeConnection(connection);
		return list;
	}

	@Override
	public List<OutEmpLogs> getOutEmpLogs(Date startTime, Date endTime, int pageSize, int pageNum) throws Exception {
		String sql= "select * from OutEmpLogs where logsDate between ? and ? limit ?,?";
			Connection connection = util.getConnection();
			ResultSet rs = util.executeQuery(connection, sql, f.format(startTime), f.format(endTime), (pageNum-1)*pageSize,pageSize);
			
			Integer id ;
			String dName;
			String pName;
			String eName;
			String gender;
			Date leaveDate;
			String reason;
			Date logsDate;
			OutEmpLogs in = null;
			List<OutEmpLogs> list = new ArrayList<OutEmpLogs>();
			while(rs.next()) {
				id = rs.getInt("id");
				dName = rs.getString("dName");
				pName = rs.getString("pName");
				eName = rs.getString("eName");
				gender = rs.getString("gender");
				leaveDate = rs.getDate("leaveDate");
				reason = rs.getString("reason");
				logsDate = rs.getDate("logsDate");
				in = new OutEmpLogs(id, dName, pName, eName, gender, leaveDate, reason, logsDate);
				list.add(in);
			}
			util.closeConnection(connection);
			return list;
	}

	@Override
	public List<PersonnelLogs> getPersonnelLogs(Date startTime, Date endTime, int pageSize, int pageNum) throws Exception {
		String sql= "select * from PersonnelLogs where logsDate between ? and ? limit ?,?";
			Connection connection = util.getConnection();
			ResultSet rs = util.executeQuery(connection, sql, f.format(startTime), f.format(endTime), (pageNum-1)*pageSize,pageSize);
			
			String dName;
			Integer earlyMonthAll;	//月初人数
			Integer endMonthAll ;	//月末人数
			Integer hireNumber;		//新入职人数
			Integer leaveNumber ;	//离职人数
			Integer inNumber;		//调入人数
			Integer outNumber ;		//调出人数
			Integer highSchool;		//高中及以下学历
			Integer junior ;		//大专学历
			Integer regular;		//本科学历
			Integer graduate ;		//研究生学历
			Date logsDate;
			PersonnelLogs p = null;
			List<PersonnelLogs> list = new ArrayList<PersonnelLogs>();
			while(rs.next()) {
				dName = rs.getString("dName");
				earlyMonthAll = rs.getInt("earlyMonthAll");
				endMonthAll = rs.getInt("endMonthAll");
				hireNumber = rs.getInt("hireNumber");
				leaveNumber = rs.getInt("leaveNumber");
				inNumber = rs.getInt("inNumber");
				outNumber = rs.getInt("outNumber");
				highSchool = rs.getInt("highSchool");
				junior = rs.getInt("junior");
				regular = rs.getInt("regular");
				graduate = rs.getInt("graduate");
				logsDate = rs.getDate("logsDate");
				p = new PersonnelLogs(dName, earlyMonthAll, endMonthAll, hireNumber, leaveNumber, inNumber, outNumber, highSchool, junior, regular, graduate, logsDate);
				list.add(p);
			}
			util.closeConnection(connection);
			return list;
	}

	@Override
	public List<PostTransLogs> getPostTransLogs(Date startTime, Date endTime, int pageSize, int pageNum) throws Exception {
		String sql= "select * from PostTransLogs where logsDate between ? and ? limit ?,?";
			Connection connection = util.getConnection();
			ResultSet rs = util.executeQuery(connection, sql, f.format(startTime), f.format(endTime), (pageNum-1)*pageSize,pageSize);
			
			Integer id ;
			String dName;
			String oldName;
			String newName;
			String name;
			String gender;
			Date date;
			String reason;
			Date logsDate;
			PostTransLogs post = null;
			List<PostTransLogs> list = new ArrayList<PostTransLogs>();
			while(rs.next()) {
				id = rs.getInt("id");
				dName = rs.getString("dName");
				oldName = rs.getString("oldName");
				newName = rs.getString("newName");
				name = rs.getString("name");
				gender = rs.getString("gender");
				date = rs.getDate("date");
				reason = rs.getString("reason");
				logsDate = rs.getDate("logsDate");
				post = new PostTransLogs(id, dName, oldName, newName, name, gender, date, reason, logsDate);
				list.add(post);
			}
			util.closeConnection(connection);
			return list;
	}

	@Override
	public List<DeptTransLogs> getDeptTransLogs(Date startTime, Date endTime, int pageSize, int pageNum) throws Exception {
		String sql= "select * from DeptTransLogs where logsDate between ? and ? limit ?,?";
			Connection connection = util.getConnection();
			ResultSet rs = util.executeQuery(connection, sql, f.format(startTime), f.format(endTime), (pageNum-1)*pageSize,pageSize);
			
			Integer id ;
			String oldName;
			String newName;
			String name;
			String gender;
			Date date;
			String reason;
			Date logsDate;
			DeptTransLogs dept = null;
			List<DeptTransLogs> list = new ArrayList<DeptTransLogs>();
			while(rs.next()) {
				id = rs.getInt("id");
				oldName = rs.getString("oldName");
				newName = rs.getString("newName");
				name = rs.getString("name");
				gender = rs.getString("gender");
				date = rs.getDate("date");
				reason = rs.getString("reason");
				logsDate = rs.getDate("logsDate");
				dept = new DeptTransLogs(id, oldName, newName, name, gender, date, reason, logsDate);
				list.add(dept);
			}
			util.closeConnection(connection);
			return list;
	}

	
	//获取显示分页的数据（pageNum）
	
	@Override
	public int getInEmpLogsPageNum(Date startTime, Date endTime) throws Exception {
		String sql = "select count(*) from inempLogs where logsDate between ? and ?";
		Connection connection = util.getConnection();
		ResultSet rs = util.executeQuery(connection, sql, f.format(startTime), f.format(endTime));
		
		int count = 0;
		if(rs.next()) {
			count = rs.getInt(1);
		}
		return count;
	}

	@Override
	public int getOutEmpLogsPageNum(Date startTime, Date endTime) throws Exception {
		String sql = "select count(*) from OutEmpLogs where logsDate between ? and ?";
		Connection connection = util.getConnection();
		ResultSet rs = util.executeQuery(connection, sql, f.format(startTime), f.format(endTime));
		
		int count = 0;
		if(rs.next()) {
			count = rs.getInt(1);
		}
		return count;
	}

	@Override
	public int getPersonnelLogsPageNum(Date startTime, Date endTime) throws Exception {
		String sql = "select count(*) from PersonnelLogs where logsDate between ? and ?";
		Connection connection = util.getConnection();
		ResultSet rs = util.executeQuery(connection, sql, f.format(startTime), f.format(endTime));
		
		int count = 0;
		if(rs.next()) {
			count = rs.getInt(1);
		}
		return count;
	}

	@Override
	public int getPostTransLogsPageNum(Date startTime, Date endTime) throws Exception {
		String sql = "select count(*) from PostTransLogs where logsDate between ? and ?";
		Connection connection = util.getConnection();
		ResultSet rs = util.executeQuery(connection, sql, f.format(startTime), f.format(endTime));
		
		int count = 0;
		if(rs.next()) {
			count = rs.getInt(1);
		}
		return count;
	}

	@Override
	public int getDeptTransLogsPageNum(Date startTime, Date endTime) throws Exception {
		String sql = "select count(*) from DeptTransLogs where logsDate between ? and ?";
		Connection connection = util.getConnection();
		ResultSet rs = util.executeQuery(connection, sql, f.format(startTime), f.format(endTime));
		
		int count = 0;
		if(rs.next()) {
			count = rs.getInt(1);
		}
		return count;
	}

	@Override
	public int insertInEmpLogs(InEmpLogs inEmpLogs) throws Exception {
		String sql = "insert into inemplogs(dname,pname,ename,gender,hiredate,education,logsDate) values (?,?,?,?,?,?,?)";
		Object []params = {
				inEmpLogs.getdName(),
				inEmpLogs.getpName(),
				inEmpLogs.geteName(),
				inEmpLogs.getGender(),
				inEmpLogs.getHiredate(),
				inEmpLogs.getEducation(),
				inEmpLogs.getLogsDate()
		};
		int i = util.executeUpdate(sql, params);
		return i;
	}

	@Override
	public int insertOutEmpLogs(OutEmpLogs outEmpLogs) throws Exception {
		String sql = "insert into outEmpLogs(dname,pname,ename,gender,leavedate,reason,logsDate) values (?,?,?,?,?,?,?)";
		Object []params = {
				outEmpLogs.getdName(),
				outEmpLogs.getpName(),
				outEmpLogs.geteName(),
				outEmpLogs.getGender(),
				outEmpLogs.getLeaveDate(),
				outEmpLogs.getReason(),
				outEmpLogs.getLogsDate()
		};
		int i = util.executeUpdate(sql, params);
		return i;
	}

	@Override
	public int insertPersonnelLogs(PersonnelLogs personnelLogs) throws Exception {
		String sql = "insert into PersonnelLogs(dname,earlyMonthAll,endMonthAll,hireNumber,leaveNumber,inNumber,outNumber,highSchool,junior,regular,graduate,logsDate) values (?,?,?,?,?,?,?,?,?,?,?,?)";
		Object []params = {
				personnelLogs.getdName(),
				personnelLogs.getEarlyMonthAll(),
				personnelLogs.getEndMonthAll(),
				personnelLogs.getHireNumber(),
				personnelLogs.getLeaveNumber(),
				personnelLogs.getInNumber(),
				personnelLogs.getOutNumber(),
				personnelLogs.getHighSchool(),
				personnelLogs.getJunior(),
				personnelLogs.getRegular(),
				personnelLogs.getGraduate(),
				personnelLogs.getLogsDate()
		};
		int i = util.executeUpdate(sql, params);
		return i;
	}

	@Override
	public int insertPostTransLogs(PostTransLogs postTransLogs) throws Exception {
		String sql = "insert into postTransLogs(dname,oldname,newname,name,gender,date,reason,logsDate) values (?,?,?,?,?,?,?,?)";
		Object []params = {
				postTransLogs.getdName(),
				postTransLogs.getOldName(),
				postTransLogs.getNewName(),
				postTransLogs.getName(),
				postTransLogs.getGender(),
				postTransLogs.getDate(),
				postTransLogs.getReason(),
				postTransLogs.getLogsDate()
		};
		int i = util.executeUpdate(sql, params);
		return i;
	}

	@Override
	public int insertDeptTransLogs(DeptTransLogs deptTransLogs) throws Exception {
		String sql = "insert into deptTransLogs(oldname,newname,name,gender,date,reason,logsDate) values (?,?,?,?,?,?,?)";
		Object []params = {
				deptTransLogs.getOldName(),
				deptTransLogs.getNewName(),
				deptTransLogs.getName(),
				deptTransLogs.getGender(),
				deptTransLogs.getDate(),
				deptTransLogs.getReason(),
				deptTransLogs.getLogsDate()
		};
		int i = util.executeUpdate(sql, params);
		return i;
	}

	@Override
	public PersonnelLogs getById(String dName) throws Exception {
		String sql = "select * from PersonnelLogs where dname = ?";
		Connection connection = util.getConnection();
		ResultSet rs = util.executeQuery(connection, sql, dName);

		Integer earlyMonthAll;	//月初人数
		Integer endMonthAll ;	//月末人数
		Integer hireNumber;		//新入职人数
		Integer leaveNumber ;	//离职人数
		Integer inNumber;		//调入人数
		Integer outNumber ;		//调出人数
		Integer highSchool;		//高中及以下学历
		Integer junior ;		//大专学历
		Integer regular;		//本科学历
		Integer graduate ;		//研究生学历
		Date logsDate;
		PersonnelLogs p = null;
		if(rs.next()) {
			earlyMonthAll = rs.getInt("earlyMonthAll");
			endMonthAll = rs.getInt("endMonthAll");
			hireNumber = rs.getInt("hireNumber");
			leaveNumber = rs.getInt("leaveNumber");
			inNumber = rs.getInt("inNumber");
			outNumber = rs.getInt("outNumber");
			highSchool = rs.getInt("highSchool");
			junior = rs.getInt("junior");
			regular = rs.getInt("regular");
			graduate = rs.getInt("graduate");
			logsDate = rs.getDate("logsDate");
			p = new PersonnelLogs(dName, earlyMonthAll, endMonthAll, hireNumber, leaveNumber, inNumber, outNumber, highSchool, junior, regular, graduate, logsDate);
		}
		util.closeConnection(connection);
		return p;
	}

	@Override
	public int updatePersonnelLogs(PersonnelLogs personnelLogs) throws Exception {
		String sql = "update PersonnelLogs set earlyMonthAll=?,endMonthAll=?,hireNumber=?,leaveNumber=?,inNumber=?,outNumber=?,highSchool=?,junior=?,regular=?,graduate=?,logsDate=? where dName = ?";
		Object []params = {
				personnelLogs.getEarlyMonthAll(),
				personnelLogs.getEndMonthAll(),
				personnelLogs.getHireNumber(),
				personnelLogs.getLeaveNumber(),
				personnelLogs.getInNumber(),
				personnelLogs.getOutNumber(),
				personnelLogs.getHighSchool(),
				personnelLogs.getJunior(),
				personnelLogs.getRegular(),
				personnelLogs.getGraduate(),
				personnelLogs.getLogsDate(),
				personnelLogs.getdName()
		};
		int i = util.executeUpdate(sql, params);
		return i;
	}

}
