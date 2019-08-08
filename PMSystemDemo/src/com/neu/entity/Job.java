package com.neu.entity;

public class Job{
	 private Integer id;
	 private String ename;
	 private String postType;
	 private String postAllot;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getPostType() {
		return postType;
	}
	public void setPostType(String postType) {
		this.postType = postType;
	}
	public String getPostAllot() {
		return postAllot;
	}
	public void setPostAllot(String postAllot) {
		this.postAllot = postAllot;
	}
	public Job(Integer id, String ename, String postType, String postAllot) {
		super();
		this.id = id;
		this.ename = ename;
		this.postType = postType;
		this.postAllot = postAllot;
	}
	public Job() {
		super();
	}

}
