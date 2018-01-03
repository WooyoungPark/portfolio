package com.portfolio.hisfit.product;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	@RequestMapping("/productList")
	public String product(Model model, HttpServletRequest request) {
		int nCategory = Integer.parseInt(request.getParameter("nCategory")); // Get Menuflag
		String strTitle;
		boolean bBestDIV;

		switch (nCategory) {
		case 0:
			strTitle = "BEST 50";
			bBestDIV = true;
			break;
		case 1:
			strTitle = "NEW Discount";
			bBestDIV = false;
			break;
		case 2:
			strTitle = "OUTWEAR";
			bBestDIV = true;
			break;
		case 3:
			strTitle = "TOP";
			bBestDIV = true;
			break;
		case 4:
			strTitle = "SHIRTS";
			bBestDIV = true;
			break;
		case 5:
			strTitle = "PANTS";
			bBestDIV = true;
			break;
		case 6:
			strTitle = "SHOES";
			bBestDIV = true;
			break;
		case 7:
			strTitle = "BAG";
			bBestDIV = true;
			break;
		case 8:
			strTitle = "ACC";
			bBestDIV = true;
			break;
		case 9:
			strTitle = "SALE";
			bBestDIV = false;
			break;
		case 10:
			strTitle = "ONLY ONE";
			bBestDIV = false;
			break;
		case 11:
			strTitle = "COUPLE";
			bBestDIV = false;
			break;
		default:
			strTitle = "";
			bBestDIV = false;
		}
		model.addAttribute("title", strTitle);
		model.addAttribute("BestDIV", bBestDIV);
		return "productList";
	}
}