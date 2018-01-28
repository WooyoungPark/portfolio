package com.portfolio.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Mappers.BoardMapper;
import com.portfolio.dto.BoardProductVO;
import com.portfolio.dto.BoardVO;

/**
 * <pre>
 *  
 * com.portfolio.dao
 * BoardDAOImpl.java
 * [ Description ]
 * 
 * </pre>
 * 
 * [ History ]
 * 
 * @author 박우영
 * @Date 2018. 1. 27. 오후 3:13:28
 * 
 *       <pre>
 * ---- 수정이력[Name - Date - Description] ----
 * 박우영 - 2018. 1. 27. - 최초생성
 *       </pre>
 */
@Repository
public class BoardDAOImpl implements BoardDAO {

	@Autowired
	private BoardMapper boardMapper;

	@Override
	public List<BoardVO> getIndexByNotice() throws Exception {
		List<BoardVO> noticeList = boardMapper.getIndexByNotice();
		return noticeList;
	}

	@Override
	public List<BoardVO> getIndexByEvent() throws Exception {
		List<BoardVO> eventList = boardMapper.getIndexByEvent();
		return eventList;
	}

	@Override
	public List<BoardProductVO> getIndexByReview() throws Exception {
		List<BoardProductVO> reviewList = boardMapper.getIndexByReview();
		return reviewList;
	}

	@Override
	public List<BoardProductVO> getIndexByQNA() throws Exception {
		List<BoardProductVO> qnaList = boardMapper.getIndexByQNA();
		return qnaList;
	}

}
