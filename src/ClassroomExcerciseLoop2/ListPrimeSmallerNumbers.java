package ClassroomExcerciseLoop2;

import java.util.Scanner;

public class ListPrimeSmallerNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("number = ");
		int number = scanner.nextInt();
		System.out.printf("The prime smaller %d is: ", number);
		for (int num=2; num<number; num++) {
			int count = 0;
			for (int i=2; i<=Math.sqrt(num); i++) {
				if (num % i == 0) {
					count++;
				}
			}
			if (count == 0) {
				System.out.print(num + " ");
			} else {
				count = 0;
			}
		}
		scanner.close();
	}

}
