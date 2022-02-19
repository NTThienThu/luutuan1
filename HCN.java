package tuan1;

import java.util.Scanner;

public class HCN {
	private double chieuDai;
	private double chieuRong;
	public double getChieuDai() {
		return chieuDai;
	}
	public void setChieuDai(double d) {
		if (d>0) {
			this.chieuDai = chieuDai;
		} else {
			System.out.println("Loi chieu dai");
		}
		
	}
	public double getChieuRong() {
		return chieuRong;
	}
	public void setChieuRong(double r) {
		if (r>0) {
			this.chieuRong = chieuRong;
		} else {
			System.out.println("Loi chieu rong");
		}
		
	}
	public HCN(double chieuDai, double chieuRong) {
		super();
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	public HCN() {
		super();
	}
	public double getChuVi() {
		return (getChieuDai()+getChieuRong())*2;
	}
	public double getDienTich() {
		return getChieuDai()*getChieuRong();
	}
	public static void main(String[] args) {
		
		Scanner scn= new Scanner(System.in);
		System.out.println("Nhap chieu dai\n");
		double d=scn.nextDouble();
		System.out.println("Nhap chieu rong\n");
		double r=scn.nextDouble();
		HCN hcn= new HCN(d,r);
		System.out.println("Dien tich la "+hcn.getDienTich());
		System.out.println("Chu vi la "+ hcn.getChuVi());
		
//		HCN hcn1= new HCN(10,5);
//		System.out.println("Dien tich la "+hcn1.getDienTich());
//		System.out.println("Chu vi la "+ hcn1.getChuVi());
	}
}
