package com.portfolio.service;

import com.portfolio.dto.UserVO;

public interface UserService {
	public UserVO selectUser(String userID) throws Exception;
}
