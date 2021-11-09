package ClassroomExercise2;

import java.util.Scanner;


public class checkDayInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Month = ");
		int month = scanner.nextInt();
		System.out.print("Year = ");
		int year = scanner.nextInt();
		
		int dayMax;
		if (month == 2) {
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				dayMax = 29;
				System.out.println("February " + year + " has " + dayMax + " days");
			} else {
				dayMax = 28;
				System.out.println("March " + year + " has " + dayMax + " days");
			}
		}
		switch(month) {
		case 1:
			dayMax = 31;
			System.out.println("January " + year + " has " + dayMax + " days");
			break;
		case 3:
			dayMax = 31;
			System.out.println("March " + year + " has " + dayMax + " days");
			break;
		case 4:
			dayMax = 30;
			System.out.println("April " + year + " has " + dayMax + " days");
			break;
		case 5:
			dayMax = 31;
			System.out.println("May " + year + " has " + dayMax + " days");
			break;
		case 6:
			dayMax = 30;
			System.out.println("Jun " + year + " has " + dayMax + " days");
			break;
		case 7:
			dayMax = 31;
			System.out.println("July " + year + " has " + dayMax + " days");
			break;
		case 8:
			dayMax = 31;
			System.out.println("August " + year + " has " + dayMax + " days");
			break;
		case 9:
			dayMax = 30;
			System.out.println("September " + year + " has " + dayMax + " days");
			break;
		case 10:
			dayMax = 31;
			System.out.println("October " + year + " has " + dayMax + " days");
			break;
		case 11:
			dayMax = 30;
			System.out.println("November " + year + " has " + dayMax + " days");
			break;
		case 12:
			dayMax = 31;
			System.out.println("December " + year + " has " + dayMax + " days");
			break;
		}
		
		System.out.println();
		scanner.close();
	}

}
