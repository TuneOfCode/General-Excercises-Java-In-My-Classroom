package chap01.basic;

import java.util.Scanner;


public class PTB2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("a= ");
		int a = scanner.nextInt();
		System.out.print("b= ");
		int b = scanner.nextInt();
		System.out.print("c= ");
		int c = scanner.nextInt();
		int delta = b*b - 4 * a * c;
		if (delta < 0) {
			System.out.println("No solution");
		} else if (delta == 0) {
			System.out.print("x1 = x2 = " + ((double)(-b) / (2 * a) ));
		} else {
			double sqrtDelta = Math.sqrt(delta);
			System.out.print("x1 = " + ((-b + sqrtDelta) / (2 * a)));
			System.out.println();
			System.out.print("x2 = " + ((-b - sqrtDelta) / (2 * a)));
			System.out.println();
		}
		scanner.close();
	}

}
