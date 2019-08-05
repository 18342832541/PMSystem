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
	private Integer id ;
	private Integer earlyMonthAll;	//�³�����
	private Integer endMonthAll ;	//��ĩ����
	private Integer hireNumber;		//����ְ����
	private Integer leaveNumber ;	//��ְ����
	private Integer inNumber;		//��������
	private Integer outNumber ;		//��������
	private Integer highSchool;		//���м�����ѧ��
	private Integer junior ;		//��רѧ��
	private Integer regular;		//����ѧ��
	private Integer graduate ;		//�о���ѧ��
	private Date startTime;
	private Date endTime;
	public PersonnelLogs() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PersonnelLogs(Integer id, Integer earlyMonthAll, Integer endMonthAll, Integer hireNumber,
			Integer leaveNumber, Integer inNumber, Integer outNumber, Integer highSchool, Integer junior,
			Integer regular, Integer graduate, Date startTime, Date endTime) {
		super();
		this.id = id;
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
		this.startTime = startTime;
		this.endTime = endTime;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
