import java.util.ArrayList;
import java.util.Collections;		// import cac thu vien can thiet
import java.util.Comparator;
import java.util.Scanner;
import java.lang.String;

public class HumanResoucres {

	public static void main(String[] args) {
		ArrayList<Staff> nhanVien = new ArrayList<Staff>(); 			// tao list danh sach nhanVien co kieu Staff
		ArrayList<Department> boPhan = new ArrayList<Department>();		// tao list danh sach boPhan co kieu Department
			
		Department keToan = new Department(101, 5, "Ke toan");			// tao doi tuong keToan
		Department mkt = new Department(202, 3, "Marketing");			// tao doi tuong  mkt	
		Department kt = new Department(123, 3, "Ky thuat");				// tao doi tuong kt
		Department hcvp = new Department(256, 3, "Hanh chinh van phong");	// tao doi tuong hcvp
		boPhan.add(hcvp);												// them doi tuong vao list boPhan
		boPhan.add(kt);
		boPhan.add(keToan);
		boPhan.add(mkt);
		
		Manager quanly = new Manager("MKT0", 30, 0, 5, "Hoang Van A", "Marketing", 3.5f, "Truong phong", "Truong nhom kinh doanh");		// tao doi tuong quanly, quanly1, 2, 3
		Manager quanly1 = new Manager("KT0", 40, 0, 5, "Le Thi Hong Gam", "Ke toan", 3.5f, "Truong phong", "Truong phong");
		Manager quanly2 = new Manager("KTH0", 35, 0, 10, "Nguyen Ba Hai", "Ky thuat", 3.5f, "Truong phong", "Lanh dao du an");
		Manager quanly3 = new Manager("HCVP0", 35, 0, 9, "Do Xuan Hop", "Hanh chinh van phong", 3.5f, "Truong phong", "Truong phong hanh chinh");

		Employee nv = new Employee("KT1", 28, 0, 1, "Le Thanh Tung", "Ke toan", 2.5f, 25.5f);			// tao doi tuong nv, nv1,nv2, nv3, nv4, nv5, nv6, nv7, nv8, nv9
		Employee nv1 = new Employee("KT2", 25, 0, 6, "Hong That Cong", "Ke toan", 2.25f, 18.0f);
		Employee nv2 = new Employee("KT3", 35, 0, 6, "Hoang Thi Tham", "Ke toan", 3.15f, 15.5f);
		Employee nv3 = new Employee("KT4", 27, 0, 15, "Do Tu Quyen", "Ke toan", 2.75f, 20.5f);
		
		Employee nv4 = new Employee("KTH1", 26, 0,20, "Le Van Hoi", "Ky thuat", 2.15f, 21.5f);
		Employee nv5 = new Employee("KTH2", 25, 0, 3, "Ho Van Hung", "Ky thuat", 2.15f, 28.0f);
		Employee nv6 = new Employee("HCVP1", 35, 0, 6, "Le Thuy Duong", "Hanh chinh van phong", 3.05f, 10.5f);
		Employee nv7 = new Employee("HCVP2", 27, 0, 20, "Do Tu Quyen", "Hanh chinh van phong", 2.85f, 24.5f);
		
		Employee nv8 = new Employee("MKT1", 25, 0, 17, "Le Thi Thuy", "Marketing", 2.65f, 35.0f);
		Employee nv9 = new Employee("MKT2", 22, 0, 17, "Ho Viet Tuyen", "Marketing", 2.85f, 34.5f);
		
		nhanVien.add(quanly);
		nhanVien.add(quanly1);					// them tat ca cac doi tuong nhan vien va quanly va list nhanVien
		nhanVien.add(quanly2);
		nhanVien.add(quanly3);
		nhanVien.add(nv);
		nhanVien.add(nv1);
		nhanVien.add(nv2);
		nhanVien.add(nv3);
		nhanVien.add(nv4);
		nhanVien.add(nv5);
		nhanVien.add(nv6);
		nhanVien.add(nv7);
		nhanVien.add(nv8);
		nhanVien.add(nv9);
		
		Scanner sc = new Scanner(System.in);		// khoi tao Scanner sc
		int luaChon = 0;							// bien lucChon de luu ket qua nhap vao cua nguoi dung
		do {										// su dung vong lap do-while de thuc thi chuong trinh
			System.out.println("-----MENU-----"
					+ "\n 1. Danh sach nhan vien"	// hien thi MENU chuong trinh
					+ "\n 2. Cac bo phan"
					+ "\n 3. Hien thi nhan vien theo tung bo phan"
					+ "\n 4. Them nhan vien moi"
					+ "\n 5. Tim kiem thong tin nhan vien"
					+ "\n 6. Hien thi bang luong toan cong ty"
					+ "\n 7. Hien thi bang luong nhan vien theo thu tu tang dan");
			luaChon = sc.nextInt();
			switch (luaChon) {					// su dung Switch-case de thuc thi theo yeu cau cua nguoi dung
				case 1: 
					System.out.print("Danh sach nhan vien cong ty:");
					for (int i = 0; i < nhanVien.size(); i++) {		// dung vong lap for duyet qua mang, goi ham displayInformation de xuat thong tin nhan vien
						System.out.print("\n");
						nhanVien.get(i).displayInformation();
					}
					break;
				case 2: 	
					for (int i = 0; i < boPhan.size(); i++) {				// dung vong lap for duyet qua mang, goi ham toString de xuat thong tin cac bo phan
						System.out.println(boPhan.get(i).toString() + "\n");
					}
					break;
				case 3: 
					for (int i = 0; i < boPhan.size(); i++) {		//su dung vong lap for de duyet tung bo phan 
						System.out.println("Danh sach cac nhan vien lam viec o bo phan " + boPhan.get(i).getTenBoPhan());
						for (int j = 0; j < nhanVien.size(); j++) {		// su dung vong lap for de duyet tung nhan vien va xuat ra thong tin nhan vien co ten bo phan trung voi ten bo phan o vong lap ngoai
							String bp = boPhan.get(i).getTenBoPhan();
							String bp1 = nhanVien.get(j).getBoPhanLamViec();
							if (bp1.equalsIgnoreCase(bp)) {
								nhanVien.get(j).displayInformation();	// xuat thong tin nhan vien bang ham displayinformation
								System.out.println(" ");
							}
						}
					}
					break;
				case 4:
					System.out.println("1. Them nhan vien"	// yeu cau nguoi dung chon 1. them quan ly  2. them nhan vien
							+ "\n2. Them quan ly");
					int chose = sc.nextInt();
					sc.nextLine();
					if (chose == 1) {
						Employee nv0 = new Employee();		// tao doi tuong nv0
						System.out.print("Ten nv: "); 		// su dung Scanner de nhap thong tin nhan vien
						nv0.setTenNhanVien(sc.nextLine());
						System.out.print("Tuoi: ");
						nv0.setTuoiNhanVien(sc.nextInt());
						System.out.print("Ma nv: ");
						sc.nextLine();
						nv0.setMaNhanVien(sc.nextLine());
						System.out.print("Bo phan lam viec: ");
						nv0.setBoPhanLamViec(sc.nextLine());
						System.out.print("He so luong: ");
						nv0.setHeSoLuong(sc.nextFloat());
						System.out.print("Ngay vao lam: ");
						nv0.setNgayVaoLam(sc.nextInt());
						System.out.print("So ngay nghi phep: ");
						nv0.setSoNgayNghiPhep(sc.nextInt());
						System.out.print("So gio lam them: ");
						nv0.setSoGioLamThem(sc.nextFloat());
						
						nhanVien.add(nv0);						// them nhan vien nv0 vao list nhanVien 
						System.out.println("Them nhan vien thanh cong!!!\n");
						
					} else if (chose == 2) {
						Manager ql1 = new Manager();			// tao doi tuong ql1
						System.out.print("Ten nv: "); 
						ql1.setTenNhanVien(sc.nextLine());		// su dung Scanner de nhap thong tin quan ly
						System.out.print("Tuoi: ");
						ql1.setTuoiNhanVien(sc.nextInt());
						System.out.print("Ma nv: ");
						sc.nextLine();
						ql1.setMaNhanVien(sc.nextLine());
						System.out.print("Chuc danh: ");
						ql1.setChucDanh(sc.nextLine());
						System.out.print("Chuc vu: ");
						ql1.setChucVu(sc.nextLine());
						System.out.print("Bo phan lam viec: ");
						ql1.setBoPhanLamViec(sc.nextLine());
						System.out.print("He so luong: ");
						ql1.setHeSoLuong(sc.nextFloat());
						System.out.print("Ngay vao lam: ");
						ql1.setNgayVaoLam(sc.nextInt());
						System.out.print("So ngay nghi phep: ");
						ql1.setSoNgayNghiPhep(sc.nextInt());
						
						nhanVien.add(ql1);						// them quan ly ql1 vao list nhanVien
						System.out.println("Them nhan vien thanh cong!!!\n");
					} 
					break;
				case 5:				// tim kiem  thong tin nhan vien 
					System.out.print("Nhap ten hoac ma nhan vien: ");
					sc.nextLine();
					String timKiem = sc.nextLine();
					for (int i = 0; i < nhanVien.size(); i++) {		// su dung vong lap for duyet tung phan tu, nhan vien co ten hoac ma nhan vien trung voi thong tin nguoi dung nhap vao thi xuat ra man hinh
						if (timKiem.equalsIgnoreCase(nhanVien.get(i).getTenNhanVien()) || timKiem.equalsIgnoreCase(nhanVien.get(i).getMaNhanVien())) {
							nhanVien.get(i).displayInformation();		// su dung ham displayInformation de xuat thong tin nhan vien
						}
					}
					break;
				case 6:		// hien thi luong nhan vien theo thu tu giam dan
					Collections.sort(nhanVien, Comparator.comparingInt(Staff::tinhLuong).reversed());	// su dung Collections sort trong thu vien Collections de sap xep list nhanVien dua vao thong so luong
					for (int i = 0; i < nhanVien.size(); i++) {					// duyet tung phan tu trong mang va xuat ra man hinh thong tin ten nhan vien va luong
						System.out.println(nhanVien.get(i).getTenNhanVien() + "\t\t\t" + nhanVien.get(i).tinhLuong());
					}
					break;
				case 7:
					Collections.sort(nhanVien, Comparator.comparingInt(Staff::tinhLuong));	// su dung Collections sort trong thu vien Collections de sap xep list nhanVien dua vao thong so luong
					for (int i = 0; i < nhanVien.size(); i++) {					// duyet tung phan tu trong mang va xuat ra man hinh thong tin ten nhan vien va luong
						System.out.println(nhanVien.get(i).getTenNhanVien() +"\t\t\t"+ nhanVien.get(i).tinhLuong());
					}
					break;
				default:
					break;
			}	
		}while (luaChon != 0);			// dieu kien tiep tuc vong lap neu nguoi dung nhap so khac 0
		sc.close();
	}
}
