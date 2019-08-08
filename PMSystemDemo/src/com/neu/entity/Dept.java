package com.neu.entity;

import java.util.Date;


public class Dept {
	private Integer id;
	private String dname;
	private String type;
	private Integer phone;
	private String email;
	private String depict;
	private String mgr;
	private Date date;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getPhone() {
		return phone;
	}
	public void setPhone(Integer phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepict() {
		return depict;
	}
	public void setDepict(String depict) {
		this.depict = depict;
	}
	public String getMgr() {
		return mgr;
	}
	public void setMgr(String mgr) {
		this.mgr = mgr;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Dept(Integer id, String dname, String type, Integer phone, String email, String depict, String mgr,
			Date date) {
		super();
		this.id = id;
		this.dname = dname;
		this.type = type;
		this.phone = phone;
		this.email = email;
		this.depict = depict;
		this.mgr = mgr;
		this.date = date;
	}
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Dept [id=" + id + ", dname=" + dname + ", type=" + type + ", phone=" + phone + ", email=" + email
				+ ", depict=" + depict + ", mgr=" + mgr + ", date=" + date + "]";
	}
	

	
	
	
	
}
	
