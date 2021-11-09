package chap01.basic;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI = 3.14;
		Scanner scanner = new Scanner(System.in);
		// input radius
		System.out.println("radius= ");
		double radius = scanner.nextDouble();
		// output
		System.out.println("Perimeter of circle: " + (2 * radius * PI));
		System.out.println("Area of circle: " + (Math.pow(radius, 2) * PI));
		scanner.close();

	}

}
