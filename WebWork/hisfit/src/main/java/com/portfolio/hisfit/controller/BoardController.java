package com.portfolio.hisfit.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <pre> 
 * com.portfolio.hisfit.controller
 * BoardController.java
 * [ Description ]
 * 
 * </pre>
 * [ History ]
 * @author	 박우영
 * @Date		 2018. 1. 21. 오후 3:17:24
 * <pre>
 * ---- 수정이력[Name - Date - Description] ----
 * 박우영 - 2018. 1. 21. - 최초생성
 * </pre>
 */
@Controller
public class BoardController {
	
	@RequestMapping("/notice")
	public String board(Model model, HttpServletRequest request) {
		String strTitle = "NOTICE";
		model.addAttribute("title", strTitle);
		return "board";
	}
}
