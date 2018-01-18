package com.portfolio.hisfit.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@RequestMapping(value = "/loginPage", method = RequestMethod.GET)
	public String login(Model model, HttpServletRequest request) {
		logger.info("login");
		
		String strTitle = "Login";
		model.addAttribute("title", strTitle);
		return "login";
	}
}