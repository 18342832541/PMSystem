package com.neu.dao;

import java.util.List;


import com.neu.entity.Dept;

public interface DeptDao {
	int add(Dept dept) throws Exception;
	int delete(int id) throws Exception;
	int update(Dept dept) throws Exception;
	Dept getById(int id) throws Exception;
	List<Dept> getAll() throws Exception;
	List<Dept> getPaged(int pageSize,int pageNum) throws Exception;
    int count( ) throws Exception;

	
	
}
