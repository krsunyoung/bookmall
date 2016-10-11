package com.bit2016.bookmall.vo;

public class CartVo {
	private int book_no;
	private int customer_no;
	private int count;
	public int getBook_no() {
		return book_no;
	}
	public void setBook_no(int book_no) {
		this.book_no = book_no;
	}
	public int getCustomer_no() {
		return customer_no;
	}
	public void setCustomer_no(int customer_no) {
		this.customer_no = customer_no;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	@Override
	public String toString() {
		return "CartVo [book_no=" + book_no + ", customer_no=" + customer_no + ", count=" + count + "]";
	}
	
	
}
