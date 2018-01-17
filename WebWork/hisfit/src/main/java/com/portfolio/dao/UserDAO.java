package com.portfolio.dao;

import java.util.List;

import com.portfolio.dto.UserVO;

/**
 * <pre> 
 * com.portfolio.dao
 * UserDao.java
 * [ Description ]
 * userService에서 전달받은 요청을 UserMapper로 전달하고 
 * DB 질의를 실행하여 얻은 반환값을 userService로 반환
 * </pre>
 * [ History ]
 * @author	 정동희
 * @Date		 2018. 1. 17. 오전 11:54:15
 * <pre>
 * ---- 수정이력[Name - Date - Description] ----
 * 정동희 - 2018. 1. 17. - 최초생성
 * </pre>
 */
public interface UserDao {
	
	/**
	 * [ Description ]
	 * ID로 한명의 User데이터를 Select하여 UserVO객체로 가져온다 
	 * @param id String  조회할 사용자의 ID
	 * @return 조회한 사용자의 데이터를 담은 UserVO 객체 
	 * @exception 존재하지 않는 id검색시 null 반환한다. null에 대한 처리 요망
	 */
	public UserVO getUserByID(String id);
	
	public void insertUser(UserVO user);
	
	public List<UserVO> readAll();
	
	public void updateUser(UserVO user);
	
	public void deleteUser(String id);

}
