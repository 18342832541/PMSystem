package com.neu.service;

import java.util.List;

import com.neu.entity.DeptTransLogs;
import com.neu.entity.InEmpLogs;
import com.neu.entity.OutEmpLogs;
import com.neu.entity.PersonnelLogs;
import com.neu.entity.PostTransLogs;

public interface LogsService {
	List<InEmpLogs> getInEmpLogs() throws Exception;
	List<OutEmpLogs> getOutEmpLogs() throws Exception;
	List<PersonnelLogs> getPersonnelLogs() throws Exception;
	List<PostTransLogs> getPostTransLogs() throws Exception;
	List<DeptTransLogs> getDeptTransLogs() throws Exception;

}
