
public class Manager extends Staff implements ICalculator{
	
	private String chucDanh, chucVu;				// tao cac bien can thiet
	private int businessLeader = 8000000;			// bien luong trach nhiem cua Truong phong
	private int projectLeader = 5000000;
	private int technicalLeader	= 6000000;

	public Manager() {			// constructor rong de su dung Scanner them quan ly
		super();
	}

	public Manager(String maNhanVien, int tuoiNhanVien, int soNgayNghiPhep, int ngayVaoLam, String tenNhanVien,		// Constructor them nhan vien voi day du thong tin
			String boPhanLamViec, float heSoLuong, String chucDanh, String chucVu) {
		super(maNhanVien, tuoiNhanVien, soNgayNghiPhep, ngayVaoLam, tenNhanVien, boPhanLamViec, heSoLuong);
		this.chucDanh = chucDanh;
		this.chucVu = chucVu;
	}

	public String getChucDanh() {			// them getter va setter
		return chucDanh;
	}

	public void setChucDanh(String chucDanh) {
		this.chucDanh = chucDanh;
	}

	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	@Override												// ghi de phuong thuc displayInformation tu class cha  Staff
	public void displayInformation() {
		System.out.println("-Ma nhan vien: "+ getMaNhanVien()
				+ "\n-Ten nhan vien: "+ getTenNhanVien()
				+ "\n-Chuc danh: "+ chucDanh				// bo sung them chuc danh
				+ "\n-Tuoi: "+ getTuoiNhanVien()
				+ "\n-He so luong: "+ getHeSoLuong()
				+ "\n-Ngay vao lam: "+ getNgayVaoLam() + "/3/2022"
				+ "\n-Bo phan lam viec: "+ getBoPhanLamViec()
				+ "\n-So ngay nghi phep: "+ getSoNgayNghiPhep());

	}

	@Override
	public int tinhLuong() {								// ghi de phuong thuc tinh luong implements tu ICalculator
		if (chucVu.equalsIgnoreCase("Truong nhom kinh doanh")) {		// Tuong nhom kinh doanh + 8.000.000
			return (int)(getHeSoLuong() * 5000000 + this.businessLeader);
		} else if (chucVu.equalsIgnoreCase("Lanh dao du an")) {			// Lanh dao du an + 5.000.000
			return (int) (getHeSoLuong() * 5000000 + this.projectLeader);
		}else
			return (int) (getHeSoLuong() * 5000000 + this.technicalLeader);	// Truong phong khac + 6.000.000
	
	}
	

	
}
