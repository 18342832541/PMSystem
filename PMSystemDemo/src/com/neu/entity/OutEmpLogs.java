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

}
