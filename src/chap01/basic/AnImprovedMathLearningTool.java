package chap01.basic;

import java.util.Scanner;

public class AnImprovedMathLearningTool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Number 1: ");
		int num1 = scanner.nextInt();
		System.out.print("Number 2: ");
		int num2 = scanner.nextInt();
		System.out.print("What is " + num1 + " - " + num2 + " = ? " );
		System.out.print(" Answer of you: ");
		int answer = scanner.nextInt();
		if (answer == (num1 - num2)) {
			System.out.println("The answer is correct.");
		} else {
			System.out.println("The answer is incorrect.");
		}
		scanner.close();
	}

}
