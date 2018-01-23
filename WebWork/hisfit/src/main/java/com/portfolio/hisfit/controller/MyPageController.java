package com.portfolio.hisfit.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.log4j.chainsaw.Main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.portfolio.dto.UserVO;
import com.portfolio.service.UserService;

@Controller
public class MyPageController {
	protected static Logger log = Logger.getLogger(Main.class.getName());
//	protected static Logger log = Logger.getLogger(MyPageController.class);

	@Autowired
	private UserService userService;
	
	@RequestMapping("/mypage")
	public String myPage(Model model, HttpServletRequest request) {
		String strTitle = "MY PAGE";
		model.addAttribute("title", strTitle);
		log.debug(strTitle);
		return "mypage";
	}
	
	@RequestMapping("/modify")
	public String modify(Model model, HttpServletRequest request) {
		String strTitle = "Modify Page";
		model.addAttribute("title", strTitle);
		log.debug(strTitle);
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication(); 
		String id = auth.getName();
		UserVO user =  userService.getUserByID(id);
		model.addAttribute("user", user);
		
		log.debug("UserVO Name : " + user.getName());
		
		return "join";
	}
	
}
