package com.neu.service;

import java.util.List;
import com.neu.dao.DeptDao;
import com.neu.dao.DeptDaoImpl;
import com.neu.entity.Dept;

public class DeptServiceImpl implements DeptService {
	
	private DeptDao deptDao = new DeptDaoImpl();
	
	@Override
	public int add(Dept dept) throws Exception {
		int n = deptDao.add(dept);
		return n;
	}

	@Override
	public List<Dept> getAll() throws Exception {
		    List<Dept> list = deptDao.getAll();
		       return list;	
	}

	@Override
	public int delete(int id) throws Exception {
		   int n = deptDao.delete(id);
		   return n;
	}

	@Override
	public Dept getById(int id) throws Exception {
		Dept dept = deptDao.getById(id);
		return dept;
	}

	@Override
	public int update(Dept dept) throws Exception {
		int n = deptDao.update(dept);
		return n;
	}

	@Override
	public List<Dept> getPaged(int pageSize, int pageNum) throws Exception {
	       List<Dept> list = deptDao.getPaged(pageSize, pageNum);  
		   return list;
		
	}

	@Override
	public int count() throws Exception {
		int n = deptDao.count();  
		return n;
		
		
	}

	

}
