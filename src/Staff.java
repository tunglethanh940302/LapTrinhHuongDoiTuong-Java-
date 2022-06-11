
public abstract class Staff implements ICalculator{
	private int tuoiNhanVien, soNgayNghiPhep, ngayVaoLam;		// khoi tao cac bien la cac thong tin cua nhan vien
	private String tenNhanVien, boPhanLamViec, maNhanVien;
	private float heSoLuong;

	public Staff() {			// constructor rong de su dung Scanner them nhan vien
	}
	public Staff(String maNhanVien, int tuoiNhanVien, int soNgayNghiPhep, int ngayVaoLam, String tenNhanVien,	// Constructor them nhan vien voi day du thong tin
			String boPhanLamViec, float heSoLuong) {
		this.maNhanVien = maNhanVien;
		this.tuoiNhanVien = tuoiNhanVien;
		this.soNgayNghiPhep = soNgayNghiPhep;
		this.ngayVaoLam = ngayVaoLam;
		this.tenNhanVien = tenNhanVien;
		this.boPhanLamViec = boPhanLamViec;
		this.heSoLuong = heSoLuong;
	}
	public String getMaNhanVien() {					// them getter va setter
		return maNhanVien;	
	}
	public void setMaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}
	public int getTuoiNhanVien() {
		return tuoiNhanVien;
	}
	public void setTuoiNhanVien(int tuoiNhanVien) {
		this.tuoiNhanVien = tuoiNhanVien;
	}
	public int getSoNgayNghiPhep() {
		return soNgayNghiPhep;
	}
	public void setSoNgayNghiPhep(int soNgayNghiPhep) {
		this.soNgayNghiPhep = soNgayNghiPhep;
	}
	public int getNgayVaoLam() {
		return ngayVaoLam;
	}
	public void setNgayVaoLam(int ngayVaoLam) {
		this.ngayVaoLam = ngayVaoLam;
	}
	public String getTenNhanVien() {
		return tenNhanVien;
	}
	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}
	public String getBoPhanLamViec() {
		return boPhanLamViec;
	}
	public void setBoPhanLamViec(String boPhanLamViec) {
		this.boPhanLamViec = boPhanLamViec;
	}
	public float getHeSoLuong() {
		return heSoLuong;
	}
	public void setHeSoLuong(float heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
		
	public void displayInformation() {			// ham displayInformation hien thi thong tin nhan vien
		System.out.println("-Ma nhan vien: "+ getMaNhanVien()		// su dung System.out.println de xuat thong tin nhan vien 
				+ "\n-Ten nhan vien: "+ getTenNhanVien()
				+ "\n-Tuoi: "+ getTuoiNhanVien()
				+ "\n-He so luong: "+ getHeSoLuong()
				+ "\n-Ngay vao lam: "+ getNgayVaoLam() + "/3/2022"
				+ "\n-Bo phan lam viec: "+ getBoPhanLamViec()
				+ "\n-So ngay nghi phep: "+ getSoNgayNghiPhep());
	}
	@Override
	public int tinhLuong() {				// ke thua ham tinh luong tu interface ICalculator
		return (int)(getHeSoLuong() * 3000000);
	}
	
	
	
}
