package com.neu.entity;

import java.util.Date;

/*create table postTransLogs(
		id int primary key auto_increment,
		dname varchar(20) not null,
		oldName varchar(20) not null,
		newName varchar(20) not null,
		name varchar(20) not null,
		gender varchar(20) not null,
		date date not null,
		reason varchar(20) not null,
		startTime date not null,
		endTime date not null

	);*/
public class PostTransLogs {
	private Integer id ;
	private String dName;
	private String oldName;
	private String newName;
	private String name;
	private String gender;
	private Date date;
	private String reason;
	private Date startTime;
	private Date endTime;
	public PostTransLogs() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PostTransLogs(Integer id, String dName, String oldName, String newName, String name, String gender,
			Date date, String reason, Date startTime, Date endTime) {
		super();
		this.id = id;
		this.dName = dName;
		this.oldName = oldName;
		this.newName = newName;
		this.name = name;
		this.gender = gender;
		this.date = date;
		this.reason = reason;
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
	public String getOldName() {
		return oldName;
	}
	public void setOldName(String oldName) {
		this.oldName = oldName;
	}
	public String getNewName() {
		return newName;
	}
	public void setNewName(String newName) {
		this.newName = newName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
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
}
