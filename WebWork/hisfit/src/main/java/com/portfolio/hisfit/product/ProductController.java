package com.portfolio.hisfit.product;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	@RequestMapping("/productList")
	public String product(Model model, HttpServletRequest request) {
		String strFlag;
		strFlag = request.getParameter("strFlag"); // Get Menuflag
		boolean bBestDIV;
		switch (strFlag) {
		case "best50":
			bBestDIV = true;
			break;
		case "NEW Discount":
			bBestDIV = false;
			break;
		case "OUTWEAR":
			bBestDIV = true;
			break;
		case "TOP":
			bBestDIV = true;
			break;
		case "SHIRTS":
			bBestDIV = true;
			break;
		case "PANTS":
			bBestDIV = true;
			break;
		case "SHOES":
			bBestDIV = true;
			break;
		case "BAG":
			bBestDIV = true;
			break;
		case "ACC":
			bBestDIV = true;
			break;
		case "SALE":
			bBestDIV = false;
			break;
		case "ONLY&nbsp;ONE":
			bBestDIV = false;
			break;
		case "COUPLE":
			bBestDIV = false;
			break;
		default:
			bBestDIV = false;
			break;

		}
		model.addAttribute("flag", strFlag);
		model.addAttribute("BestDIV", bBestDIV);
		return "productList";
	}
}