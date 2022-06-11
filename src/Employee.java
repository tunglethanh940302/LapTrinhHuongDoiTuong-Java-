
public class Employee extends Staff implements ICalculator {
	private float soGioLamThem;		
	
	public Employee() {			// constructor rong de su dung Scanner them nhan vien
		super();
	}

	public Employee(String maNhanVien, int tuoiNhanVien, int soNgayNghiPhep, int ngayVaoLam, String tenNhanVien,		// Constructor them nhan vien voi day du thong tin
			String boPhanLamViec, float heSoLuong, float soGioLamThem) {
		super(maNhanVien, tuoiNhanVien, soNgayNghiPhep, ngayVaoLam, tenNhanVien, boPhanLamViec, heSoLuong);
		this.soGioLamThem = soGioLamThem;
	}

	public float getSoGioLamThem() {				// them getter va setter 
		return soGioLamThem;
	}

	public void setSoGioLamThem(float soGioLamThem) {
		this.soGioLamThem = soGioLamThem;
	}

	@Override										// ghi de phuong thuc tinh luong implements tu ICalculator
	public int tinhLuong() {
		return (int)(getHeSoLuong() * 3000000 + soGioLamThem * 200000);		// luong nhan vien = he so luong x 3.000.000 + gio lam them x 200.000
	}
}
