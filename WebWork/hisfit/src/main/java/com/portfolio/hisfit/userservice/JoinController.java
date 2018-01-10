package com.portfolio.hisfit.userservice;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JoinController {
	@RequestMapping("/join")
	public String join(Model model, HttpServletRequest request) {
		String strTitle = "회원가입";
		model.addAttribute("title", strTitle);
		return "join";
	}
}