package ClassroomExcercise3;

import java.util.Scanner;

public class Convert_F_To_C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Fahrenheit= ");
		double F = scanner.nextDouble();
		
		double C = (F - 32) / 1.8000;
		System.out.println(F + " degree Fahrenheit is equal to " + C + " in Celsius");
		scanner.close();
	}

}
