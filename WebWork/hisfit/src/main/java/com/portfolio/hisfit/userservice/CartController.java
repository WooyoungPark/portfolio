package com.portfolio.hisfit.userservice;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CartController {
	@RequestMapping("/cart")
	public String cart(Model model, HttpServletRequest request) {
		String strTitle = "MY CART";
		model.addAttribute("title", strTitle);
		return "cart";
	}
}
