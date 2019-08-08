package com.neu.service;

import java.util.List;


import com.neu.entity.Job;

public interface JobDao {
	 List<Job>  getAll() throws Exception; 
     int insert(Job job) throws Exception;
     int updateAll(Job job) throws Exception; 
     int delete(int id)throws Exception;
     List<Job> getPaged(int pageSize,int pageNum) throws Exception;
     int count( ) throws Exception;
     Job  getById(int id)throws  Exception;
     

}
