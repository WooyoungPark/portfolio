package com.portfolio.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.portfolio.dao.BoardDAO;
import com.portfolio.dto.BoardProductVO;
import com.portfolio.dto.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardDAO dao;

	@Override
	public List<BoardVO> getIndexByNotice() {
		List<BoardVO> listNotice;
		try {
			listNotice = dao.getIndexByNotice();
		} catch (Exception e) {
			System.out.println("error: "+e);
			listNotice = nullProcess();
		}
		return listNotice;
	}

	@Override
	public List<BoardVO> getIndexByEvent() {
		List<BoardVO> listEvent;
		try {
			listEvent = dao.getIndexByEvent();
		} catch (Exception e) {
			listEvent = nullProcess();
		}
		return listEvent;
	}

	@Override
	public List<BoardProductVO> getIndexByReview() {
		List<BoardProductVO> listReview;
		try {
			listReview = dao.getIndexByReview();
		} catch (Exception e) {
			listReview = nullProcess1();
		}
		return listReview;
	}

	@Override
	public List<BoardProductVO> getIndexByQNA() {
		List<BoardProductVO> listQNA;
		try {
			listQNA = dao.getIndexByQNA();
		} catch (Exception e) {
			listQNA = nullProcess1();
		}
		return listQNA;
	}

	@Override
	public List<BoardVO> nullProcess() {
		BoardVO vo = new BoardVO();
		vo.setnIndex(0);
		vo.setStrTitle("Error발생");
		vo.setStrContents("Error발생");
		vo.setStrDate("Error발생");
		vo.setbHeadline(false);
		List<BoardVO> list = new ArrayList<>();
		list.add(vo);
		return list;
	}

	@Override
	public List<BoardProductVO> nullProcess1() {
		BoardProductVO vo = new BoardProductVO();
		vo.setnIndex(0);
		vo.setStrName("Error");
		vo.setStrPath("");
		vo.setStrAuth("Error");
		vo.setStrTitle("Error");
		vo.setStrDate("Error");
		List<BoardProductVO> list = new ArrayList<>();
		list.add(vo);
		return list;
	}
	
}
