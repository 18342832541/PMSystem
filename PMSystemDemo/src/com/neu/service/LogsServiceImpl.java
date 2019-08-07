package com.neu.service;

import java.util.Date;
import java.util.List;

import com.neu.dao.LogsDao;
import com.neu.dao.LogsDaoImpl;
import com.neu.entity.DeptTransLogs;
import com.neu.entity.InEmpLogs;
import com.neu.entity.OutEmpLogs;
import com.neu.entity.PersonnelLogs;
import com.neu.entity.PostTransLogs;

public class LogsServiceImpl implements LogsService {
	private LogsDao dao = new LogsDaoImpl();

	@Override
	public List<InEmpLogs> getInEmpLogs(Date startTime, Date endTime, int pageSize, int pageNum) throws Exception {	
		List<InEmpLogs> list = dao.getInEmpLogs(startTime, endTime, pageSize, pageNum);
		
		return list;
	}

	@Override
	public List<OutEmpLogs> getOutEmpLogs(Date startTime, Date endTime, int pageSize, int pageNum) throws Exception {
		List<OutEmpLogs> list = dao.getOutEmpLogs(startTime, endTime, pageSize, pageNum);
		return list;
	}

	@Override
	public List<PersonnelLogs> getPersonnelLogs(Date startTime, Date endTime, int pageSize, int pageNum) throws Exception {
		List<PersonnelLogs> list = dao.getPersonnelLogs(startTime, endTime, pageSize, pageNum);
		return list;
	}

	@Override
	public List<PostTransLogs> getPostTransLogs(Date startTime, Date endTime, int pageSize, int pageNum) throws Exception {
		List<PostTransLogs> list = dao.getPostTransLogs(startTime, endTime, pageSize, pageNum);
		return list;
	}

	@Override
	public List<DeptTransLogs> getDeptTransLogs(Date startTime, Date endTime, int pageSize, int pageNum) throws Exception {
		List<DeptTransLogs> list = dao.getDeptTransLogs(startTime, endTime, pageSize, pageNum);
		return list;
	}

	@Override
	public int getInEmpLogsPageNum(Date startTime, Date endTime) throws Exception {
		int num = dao.getInEmpLogsPageNum(startTime, endTime);
		return num;
	}

	@Override
	public int getOutEmpLogsPageNum(Date startTime, Date endTime) throws Exception {
		int num = dao.getOutEmpLogsPageNum(startTime, endTime);
		return num;
	}

	@Override
	public int getPersonnelLogsPageNum(Date startTime, Date endTime) throws Exception {
		int num = dao.getPersonnelLogsPageNum(startTime, endTime);
		return num;
	}

	@Override
	public int getPostTransLogsPageNum(Date startTime, Date endTime) throws Exception {
		int num = dao.getPostTransLogsPageNum(startTime, endTime);
		return num;
	}

	@Override
	public int getDeptTransLogsPageNum(Date startTime, Date endTime) throws Exception {
		int num = dao.getDeptTransLogsPageNum(startTime, endTime);
		return num;
	}

	@Override
	public int addInEmpLogs(InEmpLogs inEmpLogs) throws Exception {
		int insertInEmpLogs = dao.insertInEmpLogs(inEmpLogs);
		return insertInEmpLogs;
	}

	@Override
	public int addOutEmpLogs(OutEmpLogs outEmpLogs) throws Exception {
		int insertOutEmpLogs = dao.insertOutEmpLogs(outEmpLogs);
		return insertOutEmpLogs;
	}

	@Override
	public int addPersonnelLogs(PersonnelLogs personnelLogs) throws Exception {
		int insertPersonnelLogs = dao.insertPersonnelLogs(personnelLogs);
		return insertPersonnelLogs;
	}

	@Override
	public int addPostTransLogs(PostTransLogs postTransLogs) throws Exception {
		int insertPostTransLogs = dao.insertPostTransLogs(postTransLogs);
		return insertPostTransLogs;
	}

	@Override
	public int addDeptTransLogs(DeptTransLogs deptTransLogs) throws Exception {
		int insertDeptTransLogs = dao.insertDeptTransLogs(deptTransLogs);
		return insertDeptTransLogs;
	}

	@Override
	public PersonnelLogs getById(String dName) throws Exception {
		PersonnelLogs byId = dao.getById(dName);
		return byId;
	}

	@Override
	public int updatePersonnelLogs(PersonnelLogs personnelLogs) throws Exception {
		int updatePersonnelLogs = dao.updatePersonnelLogs(personnelLogs);
		return updatePersonnelLogs;
	}
	

}
