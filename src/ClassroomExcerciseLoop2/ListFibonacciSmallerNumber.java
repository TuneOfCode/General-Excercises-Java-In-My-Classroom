package ClassroomExcerciseLoop2;

import java.util.Scanner;

public class ListFibonacciSmallerNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("number = ");
		int number = scanner.nextInt();
		int F1 = 1;
		int F2 = 1;
		int Fibonacci = 0;
		System.out.printf("Fibonacci smaller %d: ", number);
		System.out.println();
		System.out.print(F1 + " " + F2 + " ");
		for (int i=2; i<number; i++) {
			Fibonacci = F1 + F2;
			System.out.print(Fibonacci + " ");
			F1 = F2;
			F2 = Fibonacci;
		}
		scanner.close();
	}

}
