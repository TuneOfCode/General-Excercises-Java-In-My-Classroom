package chap01.basic;

import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Age of you: ");
		int age = scanner.nextInt();
		if (age >=16) {
			System.out.print("Kilograms of you (kg): ");
			double kg = scanner.nextDouble();
			System.out.print("Height of you (m): ");
			double height = scanner.nextDouble();
			double BMI = kg / Math.pow(height, 2);
			
				if (BMI < 18.5) {
					System.out.println("Underweight");
				} else if (BMI >= 18.5 && BMI <25.0) {
					System.out.println("Normal");
				} else if (BMI >= 25.0 && BMI < 30.0) {
					System.out.println("Overweight");
				} else if (BMI >= 30.0) {
					System.out.println("Obese");
				}
		} else {
			System.out.println("You are not old enough");
		}
		scanner.close();
	}

}
