package com.neu.dao;

import com.neu.entity.Loginer;

public interface LoginerDao {

	Loginer getByName(String username) throws Exception;

	Loginer getByAll(String username, String password) throws Exception;

	int update(Loginer loginer) throws Exception;

}
