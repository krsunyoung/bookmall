package com.bit2016.bookmall.vo;

public class BookVo {
	private Long no;
	private Long cate_no;
	private String title;
	private int price;
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public Long getCate_no() {
		return cate_no;
	}
	public void setCate_no(Long cate_no) {
		this.cate_no = cate_no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "BookVo [no=" + no + ", cate_no=" + cate_no + ", title=" + title + ", price=" + price + "]";
	}
	
	
	
}
