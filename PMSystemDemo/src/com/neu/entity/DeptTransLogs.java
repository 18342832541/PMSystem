package com.neu.entity;

import java.util.Date;

/*create table deptTransLogs(
		id int primary key auto_increment,
		oldName varchar(20) not null,
		newName varchar(20) not null,
		name varchar(20) not null,
		gender varchar(20) not null,
		date date not null,
		reason varchar(20) not null,
		startTime date not null,
		endTime date not null
	);*/

public class DeptTransLogs {
	private Integer id ;
	private String oldName;
	private String newName;
	private String name;
	private String gender;
	private Date date;
	private String reason;
	private Date startTime;
	private Date endTime;

}