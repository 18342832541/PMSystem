package com.neu.service;

import java.util.List;

import com.neu.entity.Dept;

public interface DeptService {
	int add(Dept dept) throws Exception;
	List<Dept> getAll() throws Exception;
	int delete(int id) throws Exception;	
	Dept getById(int id) throws Exception;
	int update(Dept Dept) throws Exception;
	List<Dept> getPaged(int pageSize,int pageNum) throws Exception;
    int count( ) throws Exception;
}
