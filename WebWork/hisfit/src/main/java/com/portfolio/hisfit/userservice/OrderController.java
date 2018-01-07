package com.portfolio.hisfit.userservice;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {
	@RequestMapping("/order")
	public String order(Model model, HttpServletRequest request){
		String strTitle = "Order Details";
		model.addAttribute("title", strTitle);
		return "order";
	}
}
