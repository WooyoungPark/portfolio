package com.portfolio.dao;

import com.portfolio.dto.UserVO;

public interface UserDAO {
	public UserVO selectUser(String userID) throws Exception;
}
