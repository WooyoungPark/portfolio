package com.portfolio.hisfit.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.portfolio.dto.BoardProductVO;
import com.portfolio.dto.BoardVO;
import com.portfolio.service.BoardService;

/**
 * <pre>
 *  
 * com.portfolio.hisfit.controller
 * BoardController.java
 * [ Description ]
 * 
 * </pre>
 * 
 * [ History ]
 * 
 * @author 박우영
 * @Date 2018. 1. 21. 오후 3:17:24
 * 
 *       <pre>
 * ---- 수정이력[Name - Date - Description] ----
 * 박우영 - 2018. 1. 21. - 최초생성
 *       </pre>
 */

@Controller
public class BoardController {

	@Inject
	private BoardService boardService;

	@RequestMapping("/notice")
	public String notice(Model model, HttpServletRequest request) {
		String strTitle = "NOTICE";
		List<BoardVO> listNotice = boardService.getIndexByNotice();
		
		model.addAttribute("title", strTitle);
		model.addAttribute("boardList", listNotice);
		return "board";
	}

	@RequestMapping("/event")
	public String event(Model model, HttpServletRequest request) {
		String strTitle = "EVENT";
		model.addAttribute("title", strTitle);
		List<BoardVO> listEvent = boardService.getIndexByEvent();
		model.addAttribute("boardList", listEvent);
		return "board";
	}

	@RequestMapping("/review")
	public String review(Model model, HttpServletRequest request) {
		String strTitle = "REVIEW";
		model.addAttribute("title", strTitle);
		List<BoardProductVO> listReview = boardService.getIndexByReview();
		model.addAttribute("boardList", listReview);
		return "boardProduct";
	}

	@RequestMapping("/qna")
	public String qna(Model model, HttpServletRequest request) {
		String strTitle = "Q & A";
		model.addAttribute("title", strTitle);
		List<BoardProductVO> listQNA = boardService.getIndexByQNA();
		model.addAttribute("boardList", listQNA);
		return "boardProduct";
	}
}
