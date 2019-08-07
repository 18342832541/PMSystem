package com.neu.dao;

import java.util.Date;
import java.util.List;

import com.neu.entity.DeptTransLogs;
import com.neu.entity.InEmpLogs;
import com.neu.entity.OutEmpLogs;
import com.neu.entity.PersonnelLogs;
import com.neu.entity.PostTransLogs;

public interface LogsDao {
	int getInEmpLogsPageNum(Date startTime, Date endTime) throws Exception;
	int getOutEmpLogsPageNum(Date startTime, Date endTime) throws Exception;
	int getPersonnelLogsPageNum(Date startTime, Date endTime) throws Exception;
	int getPostTransLogsPageNum(Date startTime, Date endTime) throws Exception;
	int getDeptTransLogsPageNum(Date startTime, Date endTime) throws Exception;
	
	int insertInEmpLogs(InEmpLogs inEmpLogs) throws Exception;
	int insertOutEmpLogs(OutEmpLogs outEmpLogs) throws Exception;
	int insertPersonnelLogs(PersonnelLogs personnelLogs) throws Exception;
	int insertPostTransLogs(PostTransLogs postTransLogs) throws Exception;
	int insertDeptTransLogs(DeptTransLogs deptTransLogs) throws Exception;
	
	PersonnelLogs getById(String dName) throws Exception;
	int updatePersonnelLogs(PersonnelLogs personnelLogs) throws Exception;
	
	List<InEmpLogs> getInEmpLogs(Date startTime, Date endTime, int pageSize, int pageNum) throws Exception;
	List<OutEmpLogs> getOutEmpLogs(Date startTime, Date endTime, int pageSize, int pageNum) throws Exception;
	List<PersonnelLogs> getPersonnelLogs(Date startTime, Date endTime, int pageSize, int pageNum) throws Exception;
	List<PostTransLogs> getPostTransLogs(Date startTime, Date endTime, int pageSize, int pageNum) throws Exception;
	List<DeptTransLogs> getDeptTransLogs(Date startTime, Date endTime, int pageSize, int pageNum) throws Exception;

}
