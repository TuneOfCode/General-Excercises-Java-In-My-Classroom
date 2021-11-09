package chap01.basic;

import java.util.Scanner;

public class CheckAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		final String $_USERNAME = "HuyHoang";
		final String $_PASSWORD = "2021";
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Your username: ");
		String username = scanner.next();
		username = username.trim();
		scanner.nextLine();
		
		System.out.print("Your password: ");
		String password = scanner.nextLine();
		
		if (username.equals($_USERNAME) && password.equals($_PASSWORD)) {
			System.out.printf("Bạn đã nhập đúng (%s, %s) ", username, password);
			System.out.println();
		} else {
			System.out.println("Sai username hoặc password");
		}
		scanner.close();
	}

}
