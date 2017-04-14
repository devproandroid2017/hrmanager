package com.hrmanager;

import java.util.Comparator;

public class SapXepNhanVienTheoTen implements Comparator<NhanVien>{
	
	@Override
	public int compare(NhanVien o1, NhanVien o2) {
		return o1.getHoTen().compareTo(o2.getHoTen());
	}

}
