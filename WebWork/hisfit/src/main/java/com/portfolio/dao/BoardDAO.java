package com.portfolio.dao;

import java.util.List;

import com.portfolio.dto.BoardProductVO;
import com.portfolio.dto.BoardVO;

public interface BoardDAO {
	public List<BoardVO> getIndexByNotice() throws Exception;
	public List<BoardVO> getIndexByEvent() throws Exception;
	public List<BoardProductVO> getIndexByReview() throws Exception;
	public List<BoardProductVO> getIndexByQNA() throws Exception;
}
