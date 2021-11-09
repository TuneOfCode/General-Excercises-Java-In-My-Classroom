package BaiTapChuoi;

import java.util.Scanner;

public class Bai4_Chuoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("String= ");
		String string = scanner.nextLine();
		String word[] = string.split("\\s+");
		System.out.println("words in string: ");
		for (int i=0; i<word.length; i++) {
			System.out.println(word[i]);
		}
		scanner.close();
	}

}
