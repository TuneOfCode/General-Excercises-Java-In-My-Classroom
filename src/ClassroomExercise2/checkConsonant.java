package ClassroomExercise2;

import java.util.Scanner;


public class checkConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("character = ");
		char character = scanner.next().charAt(0);
		if (Character.isAlphabetic(character)) {
			switch(character) {
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'o':
			case 'O':
			case 'i':
			case 'I':
			case 'u':
			case 'U':
				System.out.println("letter is Vowel");
				break;
			default:
				System.out.println("letter is Consonant");
				break;
			}
		} else {
			System.out.println("No type string");
		}
		
		scanner.close();
	}

}
