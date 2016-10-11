package com.bit2016.bookmall.vo;

public class OrdergoVo {
	
	private int no;
	private int price;
	private String address;
	private int customer_no;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getCustomer_no() {
		return customer_no;
	}
	public void setCustomer_no(int customer_no) {
		this.customer_no = customer_no;
	}
	@Override
	public String toString() {
		return "OdergoVo [no=" + no + ", price=" + price + ", address=" + address + ", customer_no=" + customer_no
				+ "]";
	}
	
	
	
}
