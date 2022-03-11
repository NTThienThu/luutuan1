package tuan3CD;

public class CD {
	private String maCD, tuaCD, caSy;
	private int soBH;
	private double giaThanh;
	public String getMaCD() {
		return maCD;
	}
	
	public CD() {
		super();
	}

	public CD(String maCD, String tuaCD, String caSy, int soBH, double giaThanh) {
		super();
		this.maCD = maCD;
		this.tuaCD = tuaCD;
		this.caSy = caSy;
		this.soBH = soBH;
		this.giaThanh = giaThanh;
	}

	public void setMaCD(String maCD) {
		this.maCD = maCD;
	}
	public String getTuaCD() {
		return tuaCD;
	}
	public void setTuaCD(String tuaCD) {
		if (tuaCD!=null) {
			this.tuaCD = tuaCD;			
		} else {
			System.out.println("Loi tua CD");
		}

	}
	public String getCaSy() {
		return caSy;
	}
	public void setCaSy(String caSy) {
		if (caSy!=null) {
			this.caSy = caSy;		
		} else {
			System.out.println("Loi ca sy");
		}
		
	}
	public int getSoBH() {
		return soBH;
	}
	public void setSoBH(int soBH) throws Exception {
		if (soBH>=1) {
			this.soBH = soBH;
		} else {
			throw new Exception("so bai hat phai >0");
		}
		
	}
	public double getGiaThanh() {
		return giaThanh;
	}
	public void setGiaThanh(double giaThanh) throws Exception {
		if (giaThanh>0) {
			this.giaThanh = giaThanh;
		} else {
			throw new Exception("gia thanh phai >0");
		}
		
		
	}

	@Override
	public String toString() {
		return "CD [maCD=" + maCD + ", tuaCD=" + tuaCD + ", caSy=" + caSy + ", soBH=" + soBH + ", giaThanh=" + giaThanh
				+ "]";
	}
	
	
}
