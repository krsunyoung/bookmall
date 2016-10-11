package com.bit2016.bookmall.vo;

public class OrderBookVo {
	private int ordergo_no;
	private int book_no;
	private int count;
	public int getOrdergo_no() {
		return ordergo_no;
	}
	public void setOrdergo_no(int ordergo_no) {
		this.ordergo_no = ordergo_no;
	}
	public int getBook_no() {
		return book_no;
	}
	public void setBook_no(int book_no) {
		this.book_no = book_no;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	@Override
	public String toString() {
		return "OrderBookVo [ordergo_no=" + ordergo_no + ", book_no=" + book_no + ", count=" + count + "]";
	}
	
	
}
