package ClassroomExcerciseLoop2;

import java.util.Scanner;

public class FactorialPrintElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("number = ");
		int number = scanner.nextInt();
		long factorial = 1;
		for (int i=1; i<number; i++) {
			factorial *= i;
			System.out.print(i + " * ");
		}
		System.out.print(number + " = " + (factorial * number));
		scanner.close();
	}

}
