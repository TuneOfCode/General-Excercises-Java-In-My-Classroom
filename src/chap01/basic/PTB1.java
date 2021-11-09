package chap01.basic;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PTB1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("a= ");
		double a = scanner.nextDouble();
		System.out.print("b= ");
		double b = scanner.nextDouble();
		if (a!=0) {
			DecimalFormat format = new DecimalFormat("0.#");
			System.out.print("y = " + format.format(a) + "x + " + format.format(b) + " => ");
			double x = (double)(-b)/a;
			System.out.print("x= " + x);
			
		} else {
			System.out.println("Error!");
			System.out.println();
		}
		scanner.close();
	}

}
