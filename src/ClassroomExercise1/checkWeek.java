package ClassroomExercise1;

import java.util.Scanner;

public class checkWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Day = ");
		int day = scanner.nextInt();
		if (day >= 1 && day <= 31) {
			int checkDay = day % 7;
			switch (checkDay){
				case 0:
					System.out.println("Sunday");
					break;
				case 1:
					System.out.println("Monday");
					break;
				case 2:
					System.out.println("Tuesday");
					break;
				case 3:
					System.out.println("Wednesday");
					break;
				case 4:
					System.out.println("Thursday");
					break;
				case 5:
					System.out.println("Friday");
					break;
				case 6:
					System.out.println("Saturday");
				default:
					System.out.println("Error!");
					break;
			}
		}
		scanner.close();
	}

}
