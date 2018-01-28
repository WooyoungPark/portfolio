package com.portfolio.hisfit.controller;

import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.portfolio.dto.BoardProductVO;
import com.portfolio.dto.BoardVO;
import com.portfolio.dto.ProductListVO;
import com.portfolio.service.BoardService;
import com.portfolio.service.ProductService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@Autowired
	private ProductService service;

	@Inject
	private BoardService boardService;

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("home");

		List<ProductListVO> productList = service.getProductAll();
		List<BoardVO> listNotice = boardService.getIndexByNotice();
		List<BoardVO> listEvent = boardService.getIndexByEvent();
		List<BoardProductVO> listReview = boardService.getIndexByReview();
		List<BoardProductVO> listQNA = boardService.getIndexByQNA();

		listNotice = listNotice.subList(0, 5);
		listEvent = listEvent.subList(0, 5);
		listReview = listReview.subList(0, 5);
		listQNA = listQNA.subList(0, 5);

		model.addAttribute("productList", productList);
		model.addAttribute("listNotice", listNotice);
		model.addAttribute("listEvent", listEvent);
		model.addAttribute("listReview", listReview);
		model.addAttribute("listQNA", listQNA);
		return "home";
	}

}
