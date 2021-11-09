package BaiTapMang;
import java.util.Scanner;

import BaiTapMang_TimKiem_SapXep.Bai1_Mang_TimKiem_SapXep;
public class Bai2_Mang {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Độ dài n = ");
		int n = scanner.nextInt();
		int []arr = new int[n];
		Bai1_Mang_TimKiem_SapXep.InputArray(arr);
		Bai1_Mang_TimKiem_SapXep.OutputArray(arr);
		System.out.println();
		Bai1_Mang.Average(arr);
		scanner.close();
	}

}
