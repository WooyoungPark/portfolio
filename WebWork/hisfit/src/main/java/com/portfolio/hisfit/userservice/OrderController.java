package com.portfolio.hisfit.userservice;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.portfolio.dto.OrderVO;
import com.portfolio.service.OrderService;

@Controller
public class OrderController {
	
	@Inject
	private OrderService service;
	
	@RequestMapping(value = "/order", method = RequestMethod.GET)
	public String order(Model model, HttpServletRequest request) throws Exception{
		
		List<OrderVO> orderList = service.selectOrder();
		model.addAttribute("orderList", orderList);
		System.out.println("orderList Size : " + orderList.size());
		System.out.println("orderList path : " + orderList.get(0).getIMG_path());
		
		String strTitle = "Order Details";
		model.addAttribute("title", strTitle);
		return "order";
	}
}
