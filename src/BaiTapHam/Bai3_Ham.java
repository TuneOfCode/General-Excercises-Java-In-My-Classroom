package BaiTapHam;

import java.util.Scanner;

public class Bai3_Ham {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.print("Notification: ");
		String string = scanner.nextLine();
		
		do {
			System.out.print("n =");
			n = scanner.nextInt();
		} while (n < 0);
		for (int i=0; i<n; i++) {
			Bai2_Ham.Notification(string);
		}
		
		scanner.close();
	}

}
