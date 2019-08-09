package com.neu.service;
import java.util.List;

import com.neu.dao.JobDao;
import com.neu.dao.JobDaoImpl;
import com.neu.entity.Job;

public class JobServiceImpl implements JobService {
       private JobDao jobDao = new JobDaoImpl();
	@Override
	public int insert(Job job) throws Exception {
	    int n = jobDao.insert(job);
		return n;
		
	}

	@Override
	public int updateAll(Job job) throws Exception {
		       int n = jobDao.updateAll(job);
		       return n;
		 
		
		
	}

	@Override
	public List<Job> getAll() throws Exception {
		     List<Job> list = jobDao.getAll();
		      
		     return list;
		
	}

	@Override
	public List<Job> getPaged(int pageSize, int pageNum) throws Exception {
		   List<Job> list =jobDao.getPaged(pageSize, pageNum);
		   return list;
		
		
		
	}

	@Override
	public int count() throws Exception {
		  int n = jobDao.count();
		  return n;
		
	}

	@Override
	public Job getById(int id) throws Exception {
	         Job job = jobDao.getById(id);
		     return job;
		
		
	}

	@Override
	public int delete(int id) throws Exception {
		int n = jobDao.delete(id);
		return n;
		
		
		
	}

	

	

}

