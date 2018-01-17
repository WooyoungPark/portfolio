package com.portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.dao.UserDao;
import com.portfolio.dto.UserVO;

/**
 * <pre> 
 * com.portfolio.service
 * UserServiceImpl.java
 * [ Description ]
 * UserService 구현 클래스
 * UserDao와 통신 
 * </pre>
 * [ History ]
 * @author	 정동희
 * @Date		 2018. 1. 17. 오전 11:42:32
 * <pre>
 * ---- 수정이력[Name - Date - Description] ----
 * 정동희 - 2018. 1. 17. - 최초생성
 * </pre>
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userdao;
	
	@Override
	public UserVO getUserByID(String id) {
		return userdao.getUserByID(id);
	}
	
	@Override
	public void insertUser(UserVO user) {
		userdao.insertUser(user);
	}

	@Override
	public List<UserVO> getUserList() {
		return userdao.readAll();
	}

	@Override
	public void deleteUser(String id) {
		userdao.deleteUser(id);
	}

	@Override
	public void updateUser(UserVO user) {
		userdao.updateUser(user);
	}

}
