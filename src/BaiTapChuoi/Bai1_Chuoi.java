package BaiTapChuoi;

import java.util.Scanner;

public class Bai1_Chuoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("String= ");
		String str = scanner.nextLine();
		str = str.replaceAll("\s+", "");
		System.out.println("String without spaces is " + str);
		scanner.close();

	}

}
