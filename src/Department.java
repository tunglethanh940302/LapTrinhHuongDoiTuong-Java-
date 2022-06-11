
public class Department {
	private int maBoPhan, soLuongNhanVien;		// khoi tao cac bien bo phan trong cong ty, ma bo phan va so luong nhan vien
	private String tenBoPhan;
	
	public Department(int maBoPhan, int soLuongNhanVien, String tenBoPhan) {	// tao constructor de khoi tao cac bo phan
		this.maBoPhan = maBoPhan;
		this.soLuongNhanVien = soLuongNhanVien;
		this.tenBoPhan = tenBoPhan;
	}
	public int getMaBoPhan() {			// them getter va setter
		return maBoPhan;
	}
	public void setMaBoPhan(int maBoPhan) {
		this.maBoPhan = maBoPhan;
	}
	public int getSoLuongNhanVien() {
		return soLuongNhanVien;
	}
	public void setSoLuongNhanVien(int soLuongNhanVien) {
		this.soLuongNhanVien = soLuongNhanVien;
	}
	public String getTenBoPhan() {
		return tenBoPhan;
	}
	public void setTenBoPhan(String tenBoPhan) {
		this.tenBoPhan = tenBoPhan;
	}
	@Override
	public String toString() {		// tao ham toString tra ve ten bo phan, ma bo phan va so luong nhan vien dang String
		return "Ten bo phan: " + this.tenBoPhan + "\nMa bo phan: " + this.maBoPhan + "\nSo luong nhan vien: " + this.soLuongNhanVien;
	}
	
}
