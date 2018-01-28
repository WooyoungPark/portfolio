package com.Mappers;

import java.util.List;

import com.portfolio.dto.BoardProductVO;
import com.portfolio.dto.BoardVO;

/**
 * <pre>
 *  
 * com.Mappers
 * BoardMapper.java
 * [ Description ]
 * 
 * </pre>
 * 
 * [ History ]
 * 
 * @author 박우영
 * @Date 2018. 1. 27. 오후 3:10:14
 * 
 *       <pre>
 * ---- 수정이력[Name - Date - Description] ----
 * 박우영 - 2018. 1. 27. - 최초생성
 *       </pre>
 */
@MyMapper
public interface BoardMapper {
	public List<BoardVO> getIndexByNotice();

	public List<BoardVO> getIndexByEvent();

	public List<BoardProductVO> getIndexByReview();

	public List<BoardProductVO> getIndexByQNA();
}
