package com.neu.entity;

import java.util.Date;

/*create table PersonnelLogs(
	dname varchar(20) primary key ,
	earlyMonthAll int not null,
	endMonthAll int not null,
	hireNumber int not null,
	leaveNumber int not null,
	inNumber int not null,
	outNumber int not null,
	highSchool int not null,
	junior int not null,
	regular int not null,
	graduate int not null,
	startTime date not null,
	endTime date not null
)*/

public class PersonnelLogs {
	private String dName;
	private Integer earlyMonthAll;	//月初人数
	private Integer endMonthAll ;	//月末人数
	private Integer hireNumber;		//新入职人数
	private Integer leaveNumber ;	//离职人数
	private Integer inNumber;		//调入人数
	private Integer outNumber ;		//调出人数
	private Integer highSchool;		//高中及以下学历
	private Integer junior ;		//大专学历
	private Integer regular;		//本科学历
	private Integer graduate ;		//研究生学历
	private Date logsDate;
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public Integer getEarlyMonthAll() {
		return earlyMonthAll;
	}
	public void setEarlyMonthAll(Integer earlyMonthAll) {
		this.earlyMonthAll = earlyMonthAll;
	}
	public Integer getEndMonthAll() {
		return endMonthAll;
	}
	public void setEndMonthAll(Integer endMonthAll) {
		this.endMonthAll = endMonthAll;
	}
	public Integer getHireNumber() {
		return hireNumber;
	}
	public void setHireNumber(Integer hireNumber) {
		this.hireNumber = hireNumber;
	}
	public Integer getLeaveNumber() {
		return leaveNumber;
	}
	public void setLeaveNumber(Integer leaveNumber) {
		this.leaveNumber = leaveNumber;
	}
	public Integer getInNumber() {
		return inNumber;
	}
	public void setInNumber(Integer inNumber) {
		this.inNumber = inNumber;
	}
	public Integer getOutNumber() {
		return outNumber;
	}
	public void setOutNumber(Integer outNumber) {
		this.outNumber = outNumber;
	}
	public Integer getHighSchool() {
		return highSchool;
	}
	public void setHighSchool(Integer highSchool) {
		this.highSchool = highSchool;
	}
	public Integer getJunior() {
		return junior;
	}
	public void setJunior(Integer junior) {
		this.junior = junior;
	}
	public Integer getRegular() {
		return regular;
	}
	public void setRegular(Integer regular) {
		this.regular = regular;
	}
	public Integer getGraduate() {
		return graduate;
	}
	public void setGraduate(Integer graduate) {
		this.graduate = graduate;
	}
	public Date getLogsDate() {
		return logsDate;
	}
	public void setLogsDate(Date logsDate) {
		this.logsDate = logsDate;
	}
	public PersonnelLogs(String dName, Integer earlyMonthAll, Integer endMonthAll, Integer hireNumber,
			Integer leaveNumber, Integer inNumber, Integer outNumber, Integer highSchool, Integer junior,
			Integer regular, Integer graduate, Date logsDate) {
		super();
		this.dName = dName;
		this.earlyMonthAll = earlyMonthAll;
		this.endMonthAll = endMonthAll;
		this.hireNumber = hireNumber;
		this.leaveNumber = leaveNumber;
		this.inNumber = inNumber;
		this.outNumber = outNumber;
		this.highSchool = highSchool;
		this.junior = junior;
		this.regular = regular;
		this.graduate = graduate;
		this.logsDate = logsDate;
	}
	public PersonnelLogs() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
