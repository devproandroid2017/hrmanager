package com.hrmanager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Buoi_7.NhanVien;

public class QuanLiNhanSu {
	private List<NhanVien> danhSachNhanSu = new ArrayList<>();
	
	public NhanVien timKiemNhanSuTheoMNV(String manhanvien){
		NhanVien nv = new NhanVien();
		NhanVien temp = new NhanVien();
		boolean b = false;
		Iterator<NhanVien> nhanSu = danhSachNhanSu.iterator();
			while(nhanSu.hasNext()){
				temp = nhanSu.next();
				if (maNhanVien.equalsIgnoreCase(temp.getMaNhanVien())){
					b = true;
					break;
				}
			}
		if (b){
			nv = temp;
		}
		return nv;
	}
	public List<NhanVien> timKiemTheoPhongBan(String phongban){
		List<NhanVien> list = new ArrayList<>();
		Iterator<NhanVien> nhanSu = danhSachNhanSu.iterator();
		while (nhanSu.hasNext()){
			NhanVien temp = nhanSu.next();
			if (phongban.equalsIgnoreCase(temp.getPhongBan().getTenPhongBan())){
				list.add(temp);
			}
		}
		return list;
	}
	public List<NhanVien> timKiemTheoHoTen(String hoten){
		List<NhanVien> list = new ArrayList<>();
		NhanVien temp;
		Iterator<NhanVien> nhanSu = danhSachNhanSu.iterator();
		while (nhanSu.hasNext()){
			temp = nhanSu.next();
			if (hoten.equalsIgnoreCase(temp.getHoTen())){
				list.add(temp);
			}
		}
		return list;
	}
	
	public void them(NhanVien nhanVien){
		danhSachNhanSu.add(nhanVien);
	}
	
	public void suaThongTin(NhanVien nv, String ten){
		nv.setHoTen(ten);
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
		NhanVien nv4 = new NhanVien();
		
		///nv1
		nv1.setHoTen("Nguyen Van A");
		nv1.setMaNhanVien("nv1");
		nv1.setPhongBan(PB1);
		//nv2
		nv2.setHoTen("Nguyen Van C");
		nv2.setMaNhanVien("nv2");
		nv2.setPhongBan(PB2);
		//nv3
		nv3.setHoTen("Luong Van B");
		nv3.setMaNhanVien("nv3");
		nv3.setPhongBan(PB1);
				
		qlns.them(nv1);
		qlns.them(nv2);
		qlns.them(nv3);
				
				
				
		qlns.sapXepNhanVienTheoTenABC();
//		qlns.inDanhSachNhanVien();
				
		System.out.println("Tim kiem nhan vien co ma la nv1");
		nv4 = qlns.timTheoMaNhanVien("nv1");
		System.out.println(nv4.getMaNhanVien() + "|" + nv4.getHoTen());
		System.out.println("Danh sach nhan vien PB1");
		qlns.danhSach = qlns.timKiemTheoPhongBan("PB1");
		qlns.inDanhSachTheoList(qlns.danhSach);
	}

}
