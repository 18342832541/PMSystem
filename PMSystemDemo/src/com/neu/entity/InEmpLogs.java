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
	private Date startTime;
	private Date endTime;

}
