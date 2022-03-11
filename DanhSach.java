package tuan2ACCOUNT;

import Tuan2DangKiXe.ThongTinDangKyXe;

public class DanhSach {
	private Account accKH[];
	public int soLuongAcc=0;
	
	public DanhSach(int soLuongKhoiTao) {
		accKH= new Account[soLuongKhoiTao];
	}
	public Account[] getHetDanhSach() {
		return accKH;
	}
	public void tangKichThuocMang() {
		Account tempAcc[] = new Account[accKH.length * 2];
		for (int i = 0; i < accKH.length; i++) {
			tempAcc[i] = accKH[i];
		}
		accKH = tempAcc;
	}
	public int timKiem(Account acc) {
		for(int i=0;i< soLuongAcc;i++) {
			if(acc.getSoTk()==accKH[i].getSoTk())
				return i;
		}
		return -1;
	}
	public Account timKiemBietMa(String maTim) {
		for(int i=0;i< soLuongAcc;i++) {
			if(maTim==accKH[i].getSoTk())
				return accKH[i];
		}
		return null;
	}
	public void themAcc(Account acc) throws Exception{
		if(timKiem(acc)==-1) {
			if(soLuongAcc==accKH.length)
				tangKichThuocMang();
			accKH[soLuongAcc]=acc;
			soLuongAcc++;
		}
		else throw new Exception("trung ma");
	}
}
