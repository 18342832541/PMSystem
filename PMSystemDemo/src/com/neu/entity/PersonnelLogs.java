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
	private Date startTime;
	private Date endTime;
}
