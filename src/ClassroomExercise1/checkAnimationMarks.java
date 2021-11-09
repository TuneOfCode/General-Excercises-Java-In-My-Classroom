package ClassroomExercise1;

import java.util.Scanner;

public class checkAnimationMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Number First = ");
		float numberFirst = scanner.nextFloat();
		System.out.print("Number Second = ");
		float numberSecond = scanner.nextFloat();
		//String numberString = "";
		float checkNumberFirst, checkNumberSecond;
		numberFirst *= 1000;
		checkNumberFirst = numberFirst % 1000;
		numberSecond *= 1000;
		checkNumberSecond = numberSecond % 1000;
		if (checkNumberFirst == checkNumberSecond) {
			System.out.println("They are same");
		} else {
			System.out.println("They are different");
		}
		scanner.close();
	}

}
