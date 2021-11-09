package BaiTapMang_TimKiem_SapXep;

import java.util.Scanner;

public class Bai4_Mang_TimKiem_SapXep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Độ dài mảng = ");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		Bai1_Mang_TimKiem_SapXep.InputArray(arr);
		Bai1_Mang_TimKiem_SapXep.OutputArray(arr);
		System.out.println();
		Bai3_Mang_TimKiem_SapXep.Ascending(arr);
		Bai3_Mang_TimKiem_SapXep.Decreasing(arr);
		System.out.println();
		System.out.print("Số cần tìm= ");
		int item = scanner.nextInt();
		Bai1_Mang_TimKiem_SapXep.Find(arr, item);
		System.out.println();
		Bai2_Mang_TimKiem_SapXep.Find(arr, item);
		scanner.close();
	}
}
