package BaiTapChuoi;

import java.util.Scanner;

public class Bai6_Chuoi {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("String= ");
		String string = scanner.nextLine();
		String str[] = string.split("\\s+");
		System.out.print("word= ");
		String word = scanner.nextLine();
		int count = 0;
		for (int i=0; i<str.length; i++) {
			if (str[i].equals(word)) {
				count++;
			}
		}
		if (count <= 0) {
			System.out.println("The number of appearances of \"" + word + "\" là " + count + " so there is no position !");
		} else {
			System.out.print("The number of appearances of \"" + word + "\" là " + count + " in the positions: ");
			for (int i=0; i<str.length; i++) {
				if (str[i].equals(word)) {
					System.out.print(i + " ");
				}
			}
		}
		scanner.close();
	}

}
