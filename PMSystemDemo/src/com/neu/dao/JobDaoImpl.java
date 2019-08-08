package com.neu.dao;

import java.sql.Connection;


import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.neu.entity.Job;
import com.neu.util.DBUtils;

public class JobDaoImpl implements JobDao {
        private DBUtils  db= new  DBUtils();
	@Override
	public int insert(Job job) throws Exception {
		String sql ="insert into postbasic(id,ename,postType,postAllot) values(?,?,?,?)";
		Object[ ] params= {
	    job.getId(),
	    job.getEname(),
	    job.getPostType(),
	    job.getPostAllot()
	    
	
	};
		  int n = db.executeUpdate(sql, params);
		   return n;	
	}

	@Override
	public int updateAll(Job job) throws Exception {
	  String sql="update postbasic set ename=?, postType=?,postAllot=? where id =?";
	  int n = db.executeUpdate(sql, job.getEname(),job.getPostType(),job.getPostAllot(), job.getId());	
	   return n;	
	}

	


	@Override
	public List<Job> getAll() throws Exception {
		String sql =" select * from postbasic order by id";
        Connection connection = db.getConnection();
        ResultSet rs = db.executeQuery(connection, sql);
		   int id;
		   String ename;
		   String postType;
		   String postAllot;
		   Job job =null;
		   List <Job>  list = new ArrayList<>();
		  while(rs.next()) {
			    id=rs.getInt("id");
			    ename=rs.getString("ename");
			    postType = rs.getString("postType");
			    postAllot=rs.getString("postAllot");
			    job =new Job(id,ename,postType,postAllot);
			    list.add(job);
			   
		  }
		  db.closeConnection(connection);
		  return list;		
	}

	@Override
	public List<Job> getPaged(int pageSize, int pageNum) throws Exception {
		  String sql ="select * from postbasic order by id limit ?,?";
	      Connection connection = db.getConnection();
	      ResultSet rs = db.executeQuery(connection, sql,(pageNum-1)*pageSize,pageSize);
	       int id;
	      String ename;
	      String postType;
	      String postAllot;
	      Job job =null;
	     List <Job>  list = new ArrayList<>();
	     while(rs.next()) {
		    id=rs.getInt("id");
		    ename=rs.getString("ename");
		    postType = rs.getString("postType");
		    postAllot=rs.getString("postAllot");
		    job =new Job(id,ename,postType,postAllot);
		    list.add(job);
		   
	    }
	    db.closeConnection(connection);
	    return list;		
		
		
		
		
	}

	@Override
	public int count() throws Exception {
		 DBUtils db = new DBUtils() ;
		    String sql= "select count(*) from postbasic ";
		    Connection connection = db.getConnection();
		    ResultSet rs = db.executeQuery(connection, sql);
		    int count=0;
		    if(rs.next()) {
				count = rs.getInt(1);
			}
			
			db.closeConnection(connection);
			return count;	
		
		
		
	}

	@Override
	public Job getById(int id) throws Exception {
		String sql ="select * from postbasic where id=?";
        Connection connection = db.getConnection();
        ResultSet rs = db.executeQuery(connection, sql, id);
		    String ename;
		   String postType;
		   String postAllot;
		   Job job =null;
		  if(rs.next()) {
			    ename=rs.getString("ename");
			    postType = rs.getString("postType");
			    postAllot=rs.getString("postAllot");
			    job =new Job(id,ename,postType,postAllot);
			   
		  }
		  db.closeConnection(connection);
		  return job;	

	}
     @Override
	public int delete(int id) throws Exception {
		String sql="delete from postbasic where id=?";
		 int n = db.executeUpdate(sql, id);	
		   return n;	
		
		
		
		
	}
       
}
