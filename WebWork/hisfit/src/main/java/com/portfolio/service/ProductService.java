package com.portfolio.service;

import java.util.List;

import com.portfolio.dto.ProductListVO;
import com.portfolio.dto.ProductVO;

/**
 * <pre> 
 * com.portfolio.service
 * ProductService.java
 * [ Description ]
 * 
 * </pre>
 * [ History ]
 * @author	 박우영
 * @Date		 2018. 1. 19. 오후 6:20:01
 * <pre>
 * ---- 수정이력[Name - Date - Description] ----
 * 박우영 - 2018. 1. 19. - 최초생성
 * </pre>
 */
public interface ProductService {
	public List<ProductListVO> getProductByCategory(int nCategory);
	public ProductVO getProductByID(int nProductID);
}
