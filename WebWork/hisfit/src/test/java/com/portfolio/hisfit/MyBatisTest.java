package com.portfolio.hisfit;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.portfolio.dao.UserDAO;
import com.portfolio.dto.UserVO;
import com.portfolio.service.UserService;




/**
 * <pre> 
 * com.portfolio.hisfit
 * MybatisTest.java
 * [ Description ]
 * For Test
 * </pre>
 * [ History ]
 * @author	 정동희
 * @Date		 2018. 1. 17. 오후 12:16:36
 * <pre>
 * ---- 수정이력[Name - Date - Description] ----
 * 정동희 - 2018. 1. 17. - 최초생성
 * </pre>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/beans.xml")
public class MybatisTest {
	final static Logger log = Logger.getLogger(MybatisTest.class);
	@Autowired
	ApplicationContext context;
	
	@Autowired
	UserService service;
	
	@Autowired
	SqlSession session;
//	@Autowired
//	DataSource ds;
	
	@Test
	public void mapperTest() {
//		UserDao dao = context.getBean("userDao",UserDao.class);
//		UserVO user = dao.findUser("admin");
		UserVO user =  service.getUserByID("admin");
//		log.debug(user.getName());
//		log.info(user.getName());
		if(user == null) {
			System.out.println("음슴");
		}else {
			System.out.println(user.getName());
		}
	}
	
	@Test @Ignore
	public void daoTest() {
		log.debug(session);
		UserDAO dao = context.getBean("userDao",UserDAO.class);
		UserVO user = dao.getUserByID("admin");
		log.debug(user.getName());
	}
	
	@Test @Ignore
	public void configTest() {
		SqlSession session = context.getBean("sqlSession",SqlSession.class);
		System.out.println(session.getClass().getName());
		
		UserVO vo = session.selectOne("userNS.selectUserById","admin");
		System.out.println(vo);
		
	}
	
	@Test @Ignore
	public void dataSourceTest() {
		DataSource ds = (DataSource) context.getBean("dataSource");
		
		try {
			System.out.println(ds.getConnection());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test @Ignore
	public void getUserTest() {
		UserVO user = service.getUserByID("admin");
		log.debug(user.getName());
	}
	
	@Test @Ignore
	public void UpdateUserTest() {
		UserVO user = service.getUserByID("admin");
		user.setName("Gimozzy");
		service.updateUser(user);
	}

}
