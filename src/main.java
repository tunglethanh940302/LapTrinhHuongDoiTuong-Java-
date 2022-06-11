import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class main {
public static void main(String[] args) {
	// doan so ngau nhien. nhap so va so sanh voi so ngau nhien
	Scanner sc = new Scanner(System.in);
	Random rd = new Random();
	int randomNum = rd.nextInt(50);
	
	System.out.println("So ngau nhien tu 0 - 49");
	System.out.print("Ban doan: ");
	
	int num = sc.nextInt();
	
	if (num < randomNum) {
		System.out.println("So ban nhap nho hon so ngau nhien");
	} else if (num > randomNum) {
		System.out.println("So ban nhap  hon so ngau nhien");
	}
}
}
