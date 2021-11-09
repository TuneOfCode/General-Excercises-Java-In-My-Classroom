package ClassroomExcercise3;

import java.util.Scanner;

public class Convert_Inches_To_Meters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Inches = ");
		double inches = scanner.nextDouble();
		double meters = inches / 39.370;
		System.out.println(inches + " inch is " + (Math.round(meters * 10) / 10.0) + " meters");
		scanner.close();
	}

}
