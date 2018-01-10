package com.portfolio.hisfit.userinfo;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MyBatisTest {
	private static final Logger log= LoggerFactory.getLogger(MyBatisTest.class);
	private SqlSessionFactory sqlSessionFactory;
	
	@Before
	public void setup() throws Exception {
		String resource = "mybatis-config-test.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	
	
	@Test
	public void gettingStarted() {
			try(SqlSession session = sqlSessionFactory.openSession()) {
				log.debug("\n\n@@@@@@@@@gettingStarted@@@@@@@@@");
				//Mapper.xml의  namespace + "." + 함수 ID  / 넘길 파라미터
				User user = session.selectOne("UserMapper.findById","admin");
				log.debug("User : {}", user);
			}
	}
			
	
	@Test
	public void insert() throws Exception {
		try(SqlSession session = sqlSessionFactory.openSession()) {
			log.debug("\n\n@@@@@@@@@Insert@@@@@@@@@");
			//Mapper.xml의  namespace + "." + 함수 ID  / 넘길 파라미터
			User user = new User("admin2","zzz","1","qkqkek","앙기","모찌","인천시","남동구","00011447","01077774444","aksk@nate.com");
			session.insert("UserMapper.createUser",user);
			
			User actual = session.selectOne("UserMapper.findById",user.getId());
			//assertThat(actual,is(user));		//같은지 검사
			log.debug("User : {}", user);
		}
	}
	
	@Test
	public void update() throws Exception {
		try(SqlSession session = sqlSessionFactory.openSession()) {
			log.debug("\n\n@@@@@@@@@Update@@@@@@@@@");
			User user = session.selectOne("UserMapper.findById","admin");
			user.setName("정동희");
			session.update("UserMapper.updateUser", user );
			
		}
	}
	
	
	@Test
	public void selectMapper() throws Exception {
		
		try(SqlSession session = sqlSessionFactory.openSession()) {
			
		}
		
	}
}
