package BaiTapHam;

import java.util.Scanner;

public class Bai5_Ham {
	public static void PTB2(int a, int b, int  c) {
		double delta = b * b - 4 * a * c;
		if (a < 0) {
			System.out.println("Phương trình không phải là phương trình bậc 2");
		} else {
			if (delta < 0) {
				System.out.println("Phương trình vô nghiệm");
			} else if (delta == 0) {
				System.out.println("Phương trình có nghiệm duy nhất x = " + ((-b) / (2*a)));
			} else {
				double x1, x2;
				x1 = (-b + Math.sqrt(delta)) / (2 * a);
				x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println("Phương trình có hai nghiệm phân biệt: ");
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("a = ");
		int a = scanner.nextInt();
		System.out.print("b = ");
		int b = scanner.nextInt();
		System.out.print("c = ");
		int c = scanner.nextInt();
		System.out.println(a + "x^2 + " + b + "x + " + c + " = 0");
		PTB2(a,b,c);
		scanner.close();
	}

}
