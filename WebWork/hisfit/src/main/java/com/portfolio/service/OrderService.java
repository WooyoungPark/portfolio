package com.portfolio.service;

import java.util.List;

import com.portfolio.dto.OrderVO;

public interface OrderService {
	public List<OrderVO> selectOrder() throws Exception;
}
