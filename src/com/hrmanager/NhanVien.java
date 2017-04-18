package com.hrmanager;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class NhanVien implements Comparable<NhanVien>{

	private CHUC_VU chucVu = CHUC_VU.NHAN_VIEN;
	private String maNhanVien = "";
	private String hoTen = "";
	private String diaChi = "";
	private Date ngayThangNamSinh = null;
	private String soDienThoai = "";
	private float soNamKinhNghiem = 0.0f;
	private PhongBan phongBan = null;
	private List<String> danhSachDuAn = new ArrayList<>();
	private List<String> kiNang = new ArrayList<>();
	private float tienLuong = 0.00f; // 0.01

	public List<String> getKiNang() {
		return kiNang;
	}

	public void setKiNang(List<String> kiNang) {
		this.kiNang = kiNang;
	}

	public boolean isThamGiaDuAn(String maduan) {
		// kiem tra trong tat ca du an, neu co du an = maduan thi tra ve true
		// con lai tra ve false.
		boolean ret = false;
		Iterator<String> duan = danhSachDuAn.iterator();
		while (duan.hasNext()) {
			String temp = duan.next();
			if (temp.equalsIgnoreCase(maduan)) {
				ret = true;
				break;
			}
		}
		return ret;
	}

	public void themVaoDuAn(String maduan) {
		//kiem tra xem du an da ton tai trong danh sach du an cua minh chua
		//neu dung -> thong bao 'da ton tai'
		//neu sai -> thi them vao danh sach du an.
		boolean ret = danhSachDuAn.contains(maduan);
		if(ret == true){
			System.out.println("maduan da ton tai");
		}else{
			danhSachDuAn.add(maduan);
		}
	}

	public float getTienLuong() {
		return tienLuong;
	}

	public void setTienLuong(float tienLuong) {
		this.tienLuong = tienLuong;
	}

	public CHUC_VU getChucVu() {
		return chucVu;
	}

	public void setChucVu(CHUC_VU chucVu) {
		this.chucVu = chucVu;
	}

	public String getMaNhanVien() {
		return maNhanVien;
	}

	public void setMaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public Date getNgayThangNamSinh() {
		return ngayThangNamSinh;
	}

	public void setNgayThangNamSinh(Date ngayThangNamSinh) {
		this.ngayThangNamSinh = ngayThangNamSinh;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public float getSoNamKinhNghiem() {
		return soNamKinhNghiem;
	}

	public void setSoNamKinhNghiem(float soNamKinhNghiem) {
		this.soNamKinhNghiem = soNamKinhNghiem;
	}

	public PhongBan getPhongBan() {
		return phongBan;
	}

	public void setPhongBan(PhongBan phongBan) {
		this.phongBan = phongBan;
	}

	public List<String> getListDuAn() {
		return danhSachDuAn;
	}

	public void setListDuAn(List<String> listDuAn) {
		this.danhSachDuAn = listDuAn;
	}
	
	@Override
	public int compareTo(NhanVien o) {
		return this.hoTen.compareTo(o.hoTen);
	}
	
//	@Override
//	public int compare(NhanVien o1, NhanVien o2) {
//		return o1.hoTen.compareTo(o2.hoTen);
//	}
}

enum CHUC_VU {
	NHAN_VIEN, TRUONG_PHONG, GIAM_DOC
}