package com.hrmanager;

public class PhongBan {
	private String tenPhongBan;
	
	public PhongBan(){
		tenPhongBan = "";
	}
	
	public PhongBan(String tenPhongBan){
		this.tenPhongBan = tenPhongBan;
	}
	
	public String getTenPhongBan() {
		return tenPhongBan;
	}

	public void setTenPhongBan(String tenPhongBan) {
		this.tenPhongBan = tenPhongBan;
	}
}
