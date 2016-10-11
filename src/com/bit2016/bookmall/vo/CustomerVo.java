package com.bit2016.bookmall.vo;

public class CustomerVo {
	private int no;
	private String name;
	private String tel;
	private String email;
	private String pw;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	@Override
	public String toString() {
		return "CustomerVo [no=" + no + ", name=" + name + ", tel=" + tel + ", email=" + email + ", pw=" + pw + "]";
	}
	
	
	
}
