package ClassroomExerciseLoop1;

import java.util.Scanner;

public class CountDigitsLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("number = ");
		int number = scanner.nextInt();
		int count = 0;
		int num = number;
		while (number != 0) {
			number /= 10;
			count++;
		}
		System.out.printf("Count digits of %d is %d ", num, count);
		scanner.close();
	}

}
