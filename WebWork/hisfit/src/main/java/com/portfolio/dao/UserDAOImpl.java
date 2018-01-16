package com.portfolio.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import com.portfolio.dto.UserVO;

public class UserDAOImpl implements UserDAO {

	@Inject
	private SqlSession sqlSession;
	
	private static final String Namespace = "com.portfolio.mapper.UserMapper";

	@Override
	public UserVO selectUser(String userID) throws Exception {
		System.out.println("UserDAO:" + userID);
		return sqlSession.selectOne(Namespace + ".login", userID);
	}
}