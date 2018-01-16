package com.portfolio.dao;

import java.util.List;

import com.portfolio.dto.OrderVO;

public interface OrderDAO {

	public List<OrderVO> selectOrder() throws Exception;
}
