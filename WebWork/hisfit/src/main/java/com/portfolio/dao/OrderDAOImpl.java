package com.portfolio.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.portfolio.dto.OrderVO;

@Repository
public class OrderDAOImpl implements OrderDAO{
	
	@Inject
	private SqlSession sqlSession;
	
	private static final String Namespace = "com.portfolio.mapper.orderMapper";

	@Override
	public List<OrderVO> selectOrder() throws Exception {
		
		return sqlSession.selectList(Namespace+".selectOrder");
	}
}
