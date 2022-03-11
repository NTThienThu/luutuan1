package Tuan1SV;

public class SinhVien {
	private int mssv;
	private String hoTen;
	private float diemLT, diemTH;
	
	
	public SinhVien() {
		super();
	}
	
	
	public SinhVien(int mssv, String hoTen, float diemLT, float diemTH) {
		super();
		this.mssv = mssv;
		this.hoTen = hoTen;
		this.diemLT = diemLT;
		this.diemTH = diemTH;
	}
	

	public int getMssv() {
		return mssv;
	}
	public void setMssv(int mssv) {
		this.mssv = mssv;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public float getDiemLT() {
		return diemLT;
	}
	public void setDiemLT(float diemLT) {
		this.diemLT = diemLT;
	}
	public float getDiemTH() {
		return diemTH;
	}
	public void setDiemTH(float diemTH) {
		this.diemTH = diemTH;
	}
	public float getDiemTrungBinh() {
		float dtb= (getDiemLT()+getDiemTH())/2;
		return dtb;
	}


	@Override
	public String toString() {
		return String.format("%10d%30s%10.2f%10.2f%10.2f", 
				getMssv(), getHoTen(),getDiemLT(),getDiemTH(),getDiemTrungBinh());
		
		
	}
	
}
