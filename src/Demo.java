import java.util.Scanner;

public class Demo {
	// nhap nhan vien 
	// xem danh sach
	// thoat
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("MENU");
			System.out.println("1. Nhap nhan vien");
			System.out.println("2. Xuat nhan vien");
			System.out.println("0. Thoat");
			
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				
				System.out.println("Nhap nhan vien");
				break;
			case 2:
				System.out.println("2. Xuat nhan vien");
				break;
			case 0:
				break;
			default:
				break;
			}
			
		} while (choice != 0);
	}
}
