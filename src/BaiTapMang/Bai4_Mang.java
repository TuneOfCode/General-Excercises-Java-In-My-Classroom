package BaiTapMang;

import java.util.Scanner;

import BaiTapMang_TimKiem_SapXep.Bai1_Mang_TimKiem_SapXep;
public class Bai4_Mang {
	public static void DisplayFromRightToLeft(int []arr) {
		for (int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Độ dài của mảng = ");
		int n = scanner.nextInt();
		int []arr = new int [n];
		Bai1_Mang_TimKiem_SapXep.InputArray(arr);
		System.out.print("In mảng từ trái sang phải: ");
		Bai1_Mang_TimKiem_SapXep.OutputArray(arr);
		System.out.println();
		System.out.print("In mảng từ phải sang trái: ");
		DisplayFromRightToLeft(arr);
		scanner.close();
	}

}
