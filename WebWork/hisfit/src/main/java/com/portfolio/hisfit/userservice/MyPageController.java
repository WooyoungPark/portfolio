package com.portfolio.hisfit.userservice;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyPageController {
	@RequestMapping("/mypage")
	public String myPage(Model model, HttpServletRequest request) {
		String strTitle = "MY PAGE";
		model.addAttribute("title", strTitle);
		return "mypage";
	}
}
