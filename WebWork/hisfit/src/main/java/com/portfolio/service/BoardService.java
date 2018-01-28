package com.portfolio.service;

import java.util.List;

import com.portfolio.dto.BoardProductVO;
import com.portfolio.dto.BoardVO;

/**
 * <pre>
 *  
 * com.portfolio.service
 * BoardService.java
 * [ Description ]
 * 
 * </pre>
 * 
 * [ History ]
 * 
 * @author 박우영
 * @Date 2018. 1. 27. 오후 2:59:35
 * 
 *       <pre>
 * ---- 수정이력[Name - Date - Description] ----
 * 박우영 - 2018. 1. 27. - 최초생성
 *       </pre>
 */
public interface BoardService {
	public List<BoardVO> getIndexByNotice();

	public List<BoardVO> getIndexByEvent();

	public List<BoardProductVO> getIndexByReview();

	public List<BoardProductVO> getIndexByQNA();

	public List<BoardVO> nullProcess();
	
	public List<BoardProductVO> nullProcess1();
}
