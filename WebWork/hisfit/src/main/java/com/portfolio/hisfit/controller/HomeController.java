package com.portfolio.hisfit.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	/*@Inject
	private MemberService service;
	*/
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) throws Exception {
		logger.info("home");
	/*	List<MemberVO> memberList = service.selectMember();
		model.addAttribute("memberList", memberList);
		System.out.println("listSize : "+ memberList.size());
		System.out.println("listNo : "+ memberList.get(0).getProduct_name());
	*/	
		Authentication auth = SecurityContextHolder.getContext().getAuthentication(); 
		String name = auth.getName();
		System.out.println("name: "+name );
		return "home";
	}
	
}
