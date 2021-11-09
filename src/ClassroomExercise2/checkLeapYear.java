package ClassroomExercise2;

import java.util.Scanner;

public class checkLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Year = ");
		int year  = scanner.nextInt();
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year + " is a leap year");
		} else {
			System.out.println(year + " is not a leap year");
		}
		scanner.close();
	}

}
