package com.portfolio.hisfit.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	@RequestMapping("/productList")
	public String product() {
		return "productList";
	}
}