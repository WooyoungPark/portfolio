package com.portfolio.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.portfolio.dto.UserVO;


/**
 * <pre> 
 * com.portfolio.dao
 * UserDaoImpl.java
 * [ Description ]
 * userService에서 전달받은 요청을 UserMapper로 전달하고 
 * DB 질의를 실행하여 얻은 반환값을 userService로 반환
 * </pre>
 * [ History ]
 * @author	 정동희
 * @Date		 2018. 1. 17. 오전 11:57:19
 * <pre>
 * ---- 수정이력[Name - Date - Description] ----
 * 정동희 - 2018. 1. 17. - 최초생성
 * </pre>
 */
@Repository("userDao")
public class UserDAOImpl implements UserDAO{
//	private JdbcTemplate jdbcTemplate;
	
//	@Autowired
//	private SqlSession session;
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public UserVO getUserByID(String id) {
//		UserVO user = session.selectOne("userNS.selectUserById",id);
//		return user;
		
		UserVO user = userMapper.getUserByID(id);
		return user;
		
	}
	
	
	
/*	class UserMapper implements RowMapper<UserVO>{
		public UserVO mapRow(ResultSet rs, int rowNum) throws SQLException{
			UserVO user = new UserVO("admin", "4444","1","pwda","JDH","405734","incheon","lotte","0322460389","01075016411","ddd@naver.com");
			return user;
		}
		
	}*/

	@Override
	public void insertUser(UserVO user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<UserVO> readAll() {
//		String SQL = "select * from userinfo";
//		List<UserVO> userList = jdbcTemplate.query(SQL, new UserMapper());
		return null;
	}

	@Override
	public void updateUser(UserVO user) {
		StringBuffer updateQuery = new StringBuffer();
		updateQuery.append("UPDATE userinfo SET ");
		updateQuery.append("pwd=?, name=? ");
		updateQuery.append("Where id=?");
		
//		int result = this.jdbcTemplate.update(updateQuery.toString(), user.getPwd(), user.getName() , user.getId());
		
//		return result;
		
		
	}

	@Override
	public void deleteUser(String id) {
		// TODO Auto-generated method stub
		
	}

	@Inject
	private SqlSession sqlSession;
	private static final String Namespace = "com.portfolio.mapper.userMapper";

	@Override
	public String checkID(String id) throws Exception {
		return sqlSession.selectOne(Namespace+ ".checkID", id);
	}


}
