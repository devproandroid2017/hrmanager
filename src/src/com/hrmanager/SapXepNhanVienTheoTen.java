package com.hrmanager;

import java.util.Comparator;

import Buoi_7.NhanVien;

public class SapXepNhanVienTheoTen implements Comparator<NhanVien>{
	
	@Override
	public int compare(NhanVien nv1, NhanVien nv2){
		String[] s1 = nv1.getHoTen().split("\\s");
		String[] s2 = nv2.getHoTen().split("\\s");
		return s1[s1.length-1].compareTo(s2[s2.length-1]);
	}


//	@Override
//	public int compare(NhanVien o1, NhanVien o2) {
//		return o1.getHoTen().compareTo(o2.getHoTen());
//	}
}
