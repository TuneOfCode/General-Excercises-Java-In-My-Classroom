package BaiTapChuoi;

import java.util.Scanner;

public class Bai5_Chuoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("String= ");
		String string = scanner.nextLine();
		int len = string.length();
		int count[] = new int[500];
		char s[] = new char[len];
		for (int i=0; i<len; i++) {
			count[string.charAt(i)]++;
			//System.out.println(string.charAt(i) + "= " + count[string.charAt(i)]);
		}
		for (int i=0; i<len; i++) {
			s[i] = string.charAt(i);
			int countCharacter = 0;
			for (int j=0; j<=i; j++) {
				if (string.charAt(i) == s[j]) {
					countCharacter++;
				}			
			}
			if (countCharacter == 1) {
				System.out.println("Numbers of character " + string.charAt(i) + " is " + count[string.charAt(i)]);
			}
			
		}
		
		scanner.close();
	}

}
