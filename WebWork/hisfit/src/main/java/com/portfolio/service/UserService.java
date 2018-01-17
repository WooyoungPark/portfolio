package com.portfolio.service;

import java.util.List;

import com.portfolio.dto.UserVO;


/**
 * <pre> 
 * com.portfolio.service
 * UserService.java
 * [ Description ]
 * 사용자 관련  Service Interface
 * 역할 : UserDao와 통신
 * Table : userinfo
 * </pre>
 * [ History ]
 * @author	 정동희
 * @Date		 2018. 1. 17. 오전 11:40:31
 * <pre>
 * ---- 수정이력[Name - Date - Description] ----
 * 정동희 - 2018. 1. 17. - 최초생성
 * </pre>
 */
public interface UserService {
	
	/**
	 * [ Description ]
	 * ID로 한명의 User데이터를 Select하여 UserVO객체로 가져온다 
	 * UserDao로 id 전달
	 * @param id String : 조회할 사용자의 ID
	 * @return 조회한 사용자의 데이터를 담은 UserVO 객체 
	 * @exception 존재하지 않는 id검색시 null 반환한다. null에 대한 처리 요망
	 */
	public UserVO getUserByID(String id);
	
	public void insertUser(UserVO user);
	
	public List<UserVO> getUserList();
	
	public void deleteUser(String id);
	
	public void updateUser(UserVO user);

}
