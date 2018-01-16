package com.portfolio.dto;

public class MemberVO {
	private int order_NO;
	private int order_quantity;
	private String IMG_path;
	private String product_name;
	private String color;
	private String size;
	private int product_price;
	private int orderPrice;
	private int delivery_price;

	public int getOrder_NO() {
		return order_NO;
	}

	public void setOrder_NO(int order_NO) {
		this.order_NO = order_NO;
	}

	public int getOrder_quantity() {
		return order_quantity;
	}

	public void setOrder_quantity(int order_quantity) {
		this.order_quantity = order_quantity;
	}

	public String getIMG_path() {
		return IMG_path;
	}

	public void setIMG_path(String iMG_path) {
		IMG_path = iMG_path;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
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

	public int getProduct_price() {
		return product_price;
	}

	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}

	public int getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(int orderPrice) {
		this.orderPrice = orderPrice;
	}

	public int getDelivery_price() {
		return delivery_price;
	}

	public void setDelivery_price(int delivery_price) {
		this.delivery_price = delivery_price;
	}

}
