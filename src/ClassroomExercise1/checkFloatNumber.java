package ClassroomExercise1;

import java.util.Scanner;

public class checkFloatNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Number = ");
		float number = scanner.nextFloat();
		if (number < 0) {
			System.out.println("small negative number");
		} else if (number == 0) {
			System.out.println("zero");
		} else if (number > 0 && number < 1 ) {
			System.out.println("small positive number");
		} else if (number >= 1 && number <= 10e5) {
			System.out.println("positive number");
		} else {
			System.out.println("large positive number");
		}
		scanner.close();
	}

}
