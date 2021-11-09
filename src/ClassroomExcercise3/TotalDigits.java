package ClassroomExcercise3;

import java.util.Scanner;


public class TotalDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Number = ");
		int number = scanner.nextInt();
		int digit1, digit2, digit3, digit4, sumDigits = 0;
		if (number >= 0  && number <= 1000) {
			int Number = number;
			digit1 = number / 1000;
			number %= 1000;
			digit2 = number / 100;
			number %= 100;
			digit3 = number / 10;
			number %= 10;
			digit4 = number;
			sumDigits = digit1 + digit2 + digit3 + digit4;
			System.out.println("The sum of all digits in " + Number +" is " + sumDigits);
		} else {
			System.out.println("Exceeding!");
		}
		scanner.close();
	}

}
