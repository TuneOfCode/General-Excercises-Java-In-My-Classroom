package BaiTapHam;

import java.util.Scanner;

public class Bai7_Ham {
	
	public static void Feature() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập lựa chọn = ");
		int n = scanner.nextInt();
		if (n==1) {
			System.out.print("a = ");
			int a = scanner.nextInt();
			System.out.print("b = ");
			int b = scanner.nextInt();
			System.out.println(a + "x + " + b + " = 0");
			System.out.println("<=> x = " + Bai4_Ham.PTB1(a, b));
		} else if (n==2) {
			System.out.print("a = ");
			int a = scanner.nextInt();
			System.out.print("b = ");
			int b = scanner.nextInt();
			System.out.print("c = ");
			int c = scanner.nextInt();
			System.out.println(a + "x^2 + " + b + "x + " + c + " = 0");
			Bai5_Ham.PTB2(a, b, c);
		}
		String action; 
		do {
			System.out.print("Bạn có muốn tiếp tục không? (y / n): ");
			action = scanner.next();
			if (action.equals("n")) {
				System.exit(0);
			} else {
				System.out.print("Nhập lựa chọn = ");
				n = scanner.nextInt();
				if (n==1) {
					System.out.print("a = ");
					int a = scanner.nextInt();
					System.out.print("b = ");
					int b = scanner.nextInt();
					System.out.println(a + "x + " + b + " = 0");
					System.out.println("<=> x = " + Bai4_Ham.PTB1(a, b));
				} else if (n==2) {
					System.out.print("a = ");
					int a = scanner.nextInt();
					System.out.print("b = ");
					int b = scanner.nextInt();
					System.out.print("c = ");
					int c = scanner.nextInt();
					System.out.println(a + "x^2 + " + b + "x + " + c + " = 0");
					Bai5_Ham.PTB2(a, b, c);
				}
			}
			
		}while (action.equals("y"));
		
		
		scanner.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Feature();
	}

}
