package com.portfolio.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.portfolio.dao.OrderDAO;
import com.portfolio.dto.OrderVO;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Inject
	private OrderDAO dao;
	
	@Override
	public List<OrderVO> selectOrder() throws Exception{
		return dao.selectOrder();
	}
}
