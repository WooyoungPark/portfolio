package com.portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.dao.ProductDAO;
import com.portfolio.dto.ProductListVO;
import com.portfolio.dto.ProductVO;

@Service("productService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDAO productdao;

	@Override
	public List<ProductListVO> getProductByCategory(int nCategory) {
		return productdao.getProductByCategory(nCategory);
	}

	@Override
	public ProductVO getProductByID(int nProductID) {
		return productdao.getProductByID(nProductID);
	}
}
