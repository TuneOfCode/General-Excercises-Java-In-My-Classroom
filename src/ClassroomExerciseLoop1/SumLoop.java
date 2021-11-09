package ClassroomExerciseLoop1;

import java.util.Scanner;

public class SumLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("number = ");
		int number = scanner.nextInt();
		int sum = 0;
		for (int i=1; i<=number; i++) {
			sum += i;
		}
		System.out.printf("The sum of all numbers from 1 to %d is %d", number, sum);
		scanner.close();
	}

}
