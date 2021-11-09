package ClassroomExcercise3;

import java.util.Scanner;

public class Convert_Minutes_To_YearsDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Minutes = ");
		int minutes = scanner.nextInt();
		int years = minutes / 525600;
		minutes = minutes % 525600;
		int days = minutes / 1440;
		System.out.println(minutes + " minutes is approximately " + years + " and " + days + " days");
		scanner.close();
	}

}
