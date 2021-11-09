package ClassroomExercise2;

import java.util.Scanner;

public class AverageFiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Number First = ");
		float num1 = scanner.nextFloat();
		System.out.print("Number Second = ");
		float num2 = scanner.nextFloat();
		System.out.print("Number Third = ");
		float num3 = scanner.nextFloat();
		System.out.print("Number Fourth = ");
		float num4 = scanner.nextFloat();
		System.out.print("Number Fifth = ");
		float num5 = scanner.nextFloat();
		
		float sum = num1 + num2 + num3 + num4 + num5;
		float average = (num1 + num2 + num3 + num4 + num5) / 5;
		System.out.println("The sum of 5 no is: " + sum);
		System.out.println("The Average is: " + average);
		scanner.close();
	}

}
