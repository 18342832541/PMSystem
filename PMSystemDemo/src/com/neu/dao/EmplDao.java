package com.neu.dao;

import java.util.List;


import com.neu.entity.Empl;

public interface EmplDao {
	int insert(Empl empl) throws Exception;
	int update(Empl empl) throws Exception;
	int delete(int employeeId) throws Exception;
	
	Empl getById(Integer id) throws Exception;
	List<Empl> getLikeName(String ename) throws Exception;
	List<Empl> getPaged(int pageSize, int pageNum) throws Exception;
	
	int count() throws Exception;
}
