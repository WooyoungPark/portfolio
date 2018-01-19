package com.portfolio.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Mappers.ProductMapper;
import com.portfolio.dto.ProductListVO;

/**
 * <pre> 
 * com.portfolio.dao
 * ProductDAOImpl.java
 * [ Description ]
 * 
 * </pre>
 * [ History ]
 * @author	 박우영
 * @Date		 2018. 1. 19. 오후 6:17:07
 * <pre>
 * ---- 수정이력[Name - Date - Description] ----
 * 박우영 - 2018. 1. 19. - 최초생성
 * </pre>
 */
@Repository("productDao")
public class ProductDAOImpl implements ProductDAO{

	@Autowired
	private ProductMapper productMapper;
	
	@Override
	public List<ProductListVO> getProductByCategory(int nCategory) {
		List<ProductListVO> productList = productMapper.getProductByCategory(nCategory);
		return productList;
	}

}
