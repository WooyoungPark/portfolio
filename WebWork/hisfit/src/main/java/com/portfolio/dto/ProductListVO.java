package com.portfolio.dto;

public class ProductListVO {
	private String product_name;
	private int product_price;
	private String color;
	private String size;
	private String product_subTitle;
	private String img_path;

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public int getProduct_price() {
		return product_price;
	}

	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getProduct_subTitle() {
		return product_subTitle;
	}

	public void setProduct_subTitle(String product_subTitle) {
		this.product_subTitle = product_subTitle;
	}

	public String getImg_path() {
		return img_path;
	}

	public void setImg_path(String img_path) {
		this.img_path = img_path;
	}

}
