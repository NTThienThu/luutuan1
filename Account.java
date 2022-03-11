package tuan2ACCOUNT;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Account {
	final double PHI=2000;
	private String tenTk, soTk;
	private double tienTk;
	public String getTenTk() {
		return tenTk;
	}
	public void setTenTk(String tenTk) {
		this.tenTk = tenTk;
	}
	public String getSoTk() {
		return soTk;
	}
	public void setSoTk(String soTk) {
		this.soTk = soTk;
	}
	public double getTienTk() {
		return tienTk;
	}
	public void setTienTk(double tienTk) {
		this.tienTk = tienTk;
	}
	public double getPHI() {
		return PHI;
	}
	
	
	public Account() {
		super();
	}
	
	public Account(String tenTk, String soTk, double tienTk) {
		super();
		this.tenTk = tenTk;
		this.soTk = soTk;
		this.tienTk = tienTk;
	}
	
	// Locale loc = new Locale("vi","VN");
	//    NumberFormat vn = NumberFormat.getCurrencyInstance(loc);
	 DecimalFormat vn = new DecimalFormat("###,###,###");
	    
	public void napTien(Account ac, double tienNap) {
		if (tienNap>0&& ac!=null) {
			ac.setTienTk(getTienTk()+tienNap);
		} else {
			System.out.println("Loi nap tien\n");
		}
	}
	public double rutTien(Account ac, double tienRut) {
		if (tienRut+PHI+50000<= ac.getTienTk()) {
			ac.setTienTk(getTienTk()-tienRut-PHI);
			return tienRut;
		} else {
			return 0;
		}
	}
	
	public void chuyenTien(Account ac1, Account ac2, double tienChuyen) {
		ac2.napTien(ac2, ac1.rutTien(ac1, tienChuyen));
	}
	@Override
	public String toString() {
		String s="";
		s=s+s.format("|%20s|%-30s|%20s|",getSoTk(),getTenTk(),vn.format(getTienTk())+" VND");
		return s;
	}
	    
	 
	
	
	
}
