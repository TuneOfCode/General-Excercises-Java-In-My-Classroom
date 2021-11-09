package ClassroomExercise1;

import java.util.Scanner;

public class TheLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("First Number: ");
		int numberFirst = scanner.nextInt();
		System.out.print("Second Number: ");
		int numberSecond = scanner.nextInt();
		System.out.print("Third Number: ");
		int numberThird = scanner.nextInt();
		
		int max = (numberFirst >= numberSecond && numberFirst > numberThird) ? (numberFirst) 
				: (numberSecond > numberThird ? numberSecond : numberThird);
		System.out.println(max + " is the largest number");
		scanner.close();
	}	

}
