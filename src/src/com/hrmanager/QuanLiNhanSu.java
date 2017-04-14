package com.hrmanager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class QuanLiNhanSu {
	private List<NhanVien> danhSachNhanSu = new ArrayList<>();
	
	public NhanVien timKiemNhanSuTheoMNV(String manhanvien){
		return null;
	}
	public List<NhanVien> timKiemTheoPhongBan(String phongban){
		return null;
	}
	public List<NhanVien> timKiemTheoHoTen(String hoten){
		return null;
	}
	
	public void them(NhanVien nhanVien){
		danhSachNhanSu.add(nhanVien);
	}
	
	public void suaThongTin(String ten){
		
	}
	
	public void xoaNhanVien(NhanVien nhanvien){
		danhSachNhanSu.remove(nhanvien);
	}
	
	public void sapXepNhanVienTheoTenABC(){
		System.out.println("Danh sach truoc sap xep:");
		inDanhSachNhanVien();
		danhSachNhanSu.sort(new SapXepNhanVienTheoTen());
		System.out.println("Danh sach sau khi sap xep");
		inDanhSachNhanVien();
	}
	
	public int soLuongNhanVienCongTy(){
		int dem = 0;
		dem = danhSachNhanSu.size();
		return dem;
	}
	
	public void inDanhSachNhanVien(){
		Iterator<NhanVien> iterator = danhSachNhanSu.iterator();
		while(iterator.hasNext()){
			NhanVien nhanVien = iterator.next();
			System.out.println(nhanVien.getMaNhanVien() + "|" + nhanVien.getHoTen());
		}
	}
	
	public static void main(String[] args) {
		QuanLiNhanSu qlns = new QuanLiNhanSu();
		NhanVien nv1 = new NhanVien();
		NhanVien nv2 = new NhanVien();
		NhanVien nv3 = new NhanVien();
		
		///nv1
		nv1.setHoTen("Nguyen Van A");
		nv1.setMaNhanVien("nv1");
		//nv2
		nv2.setHoTen("Nguyen Van C");
		nv2.setMaNhanVien("nv2");
		//nv3
		nv3.setHoTen("Luong Van B");
		nv3.setMaNhanVien("nv3");
		
		qlns.them(nv1);
		qlns.them(nv2);
		qlns.them(nv3);
		
		qlns.sapXepNhanVienTheoTenABC();
//		qlns.inDanhSachNhanVien();
	}

}
