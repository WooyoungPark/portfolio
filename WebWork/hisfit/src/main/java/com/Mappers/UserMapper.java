package com.Mappers;

import com.portfolio.dto.UserVO;

/**
 * <pre> 
 * com.portfolio.dao
 * UserMapper.java
 * [ Description ]
 * 사용자관련 테이블(userinfo)에서의 CRUD작업을 위한 Mapper Interface
 * 매핑되어있는 매퍼 XML : userMapper.xml src/main/resources/mappers/userMapper.xml 
 * </pre>
 * [ History ]
 * @author	 정동희
 * @Date		 2018. 1. 17. 오후 12:00:12
 * <pre>
 * ---- 수정이력[Name - Date - Description] ----
 * 정동희 - 2018. 1. 17. - 최초생성
 * 정동희 - 2018. 1. 20. - insertUser추가
 * </pre>
 */
@MyMapper
public interface UserMapper {
	public UserVO getUserByID(String id);
	public String checkID(String id);
	public void insertUser(UserVO user);
	public void updateUser(UserVO user);
}
