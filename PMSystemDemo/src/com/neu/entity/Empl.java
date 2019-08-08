package com.neu.entity;

import java.util.Date;

public class Empl{
	private Integer employeeId;
	private String name;
	private String sex;
	private String birthDate;
	private String idNumber;
	private String dept;
	private String job;
	private Date hiredate;
	public Empl() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Empl(Integer employeeId, String name, String sex, String birthDate, String idNumber, String dept,
			String job, Date hiredate, Double sal) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.sex = sex;
		this.birthDate = birthDate;
		this.idNumber = idNumber;
		this.dept = dept;
		this.job = job;
		this.hiredate = hiredate;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Empl [employeeId=" + employeeId + ", name=" + name + ", sex=" + sex + ", birthDate=" + birthDate
				+ ", idNumber=" + idNumber + ", dept=" + dept + ", job=" + job + ", hiredate=" + hiredate + ", sal=" + sal
				+ "]";
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	private  Double sal;
	
}