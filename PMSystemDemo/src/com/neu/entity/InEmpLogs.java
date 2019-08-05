package com.neu.entity;

import java.util.Date;

/*create table inEmpLogs(
		id int primary key auto_increment,
		dname varchar(20) not null,
		pname varchar(20) not null,
		ename varchar(20) not null,
		gender varchar(20) not null,
		hiredate date not null,
		education varchar(20) not null,
		startTime date not null,
		endTime date not null

	);*/
public class InEmpLogs {
	private Integer id ;
	private String dName;
	private String pName;
	private String gender;
	private Date hiredate;
	private String education;
	public InEmpLogs() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InEmpLogs(Integer id, String dName, String pName, String gender, Date hiredate, String education,
			Date startTime, Date endTime) {
		super();
		this.id = id;
		this.dName = dName;
		this.pName = pName;
		this.gender = gender;
		this.hiredate = hiredate;
		this.education = education;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	private Date startTime;
	private Date endTime;

}
