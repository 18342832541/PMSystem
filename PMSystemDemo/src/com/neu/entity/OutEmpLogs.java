package com.neu.entity;

import java.util.Date;

/*create table outEmpLogs(
		id int primary key auto_increment,
		dname varchar(20) not null,
		pname varchar(20) not null,
		ename varchar(20) not null,
		gender varchar(20) not null,
		leavedate date not null,
		reason varchar(20) not null,
		startTime date not null,
		endTime date not null

	);*/
public class OutEmpLogs {
	private Integer id ;
	private String dName;
	private String pName;
	private String eName;
	private String gender;
	private Date leaveDate;
	private String reason;
	private Date startTime;
	private Date endTime;
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
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getLeaveDate() {
		return leaveDate;
	}
	public void setLeaveDate(Date leaveDate) {
		this.leaveDate = leaveDate;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
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
	public OutEmpLogs(Integer id, String dName, String pName, String eName, String gender, Date leaveDate,
			String reason, Date startTime, Date endTime) {
		super();
		this.id = id;
		this.dName = dName;
		this.pName = pName;
		this.eName = eName;
		this.gender = gender;
		this.leaveDate = leaveDate;
		this.reason = reason;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	public OutEmpLogs() {
		super();
		// TODO Auto-generated constructor stub
	}

}
