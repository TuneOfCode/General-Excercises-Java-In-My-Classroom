package ClassroomExerciseLoop1;

import java.util.Scanner;


public class FactorialLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final long MODULES = 1000000007;
		Scanner scanner = new Scanner(System.in);
		System.out.print("number = ");
		long number = scanner.nextLong();
		long factorial = 1;
		for (long i=1; i<= number; i++) {
			factorial = (factorial * i) % MODULES;
		}
		if (number > 60) {
			factorial %= MODULES;
		}
		
		System.out.printf("The factorial of %d is %s", number, factorial);
		scanner.close();
	}

}
