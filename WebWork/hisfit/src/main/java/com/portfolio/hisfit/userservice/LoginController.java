package com.portfolio.hisfit.userservice;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	@RequestMapping("/login")
	public String login(Model model, HttpServletRequest request) {
		String strTitle = "LOGIN";
		model.addAttribute("title", strTitle);
		return "login";
	}
}
