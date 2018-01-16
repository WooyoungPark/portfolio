package com.portfolio.service;

import javax.inject.Inject;

import com.portfolio.dao.UserDAO;
import com.portfolio.dto.UserVO;

public class UserServiceImpl implements UserService {

	@Inject
	private UserDAO dao;

	@Override
	public UserVO selectUser(String userID) throws Exception {
		System.out.println("userservice :" + userID);
		return dao.selectUser(userID);
	}
}