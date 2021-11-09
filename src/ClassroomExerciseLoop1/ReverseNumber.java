package ClassroomExerciseLoop1;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("number = ");
		int number = scanner.nextInt();
		int num = number;
		int digits;
		String result = "";
		while (num != 0) {
			digits = num % 10;
			result += digits;
			num /= 10;
		}
		System.out.printf("Reverse number of %d is %s", number, result);
		scanner.close();
	}

}
