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
}
