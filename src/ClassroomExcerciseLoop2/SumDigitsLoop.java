package ClassroomExcerciseLoop2;

import java.util.Scanner;

public class SumDigitsLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("number = ");
		int number = scanner.nextInt();
		int digits;
		String result = "";
		int num = number;
		int sumDigits = 0;
		while (num != 0) {
			digits = num % 10;
			sumDigits += digits;
			result = digits + " + " + result;
			num /= 10;
		}
		result = result.substring(0, result.length() - 2);
		System.out.print(result + "= " + sumDigits);
		scanner.close();
	}

}
