package BaiTapMang_TimKiem_SapXep;

import java.util.Scanner;

public class Bai3_Mang_TimKiem_SapXep {
	public static void Ascending(int []arr) {
		int temp;
		for (int i=0; i<=arr.length-2; i++) {
			for (int j=i+1; j<=arr.length-1; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i]= arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print("Mảng sau khi sắp xếp tăng dần: ");
		Bai1_Mang_TimKiem_SapXep.OutputArray(arr);
		System.out.println();
	}
	public static void Decreasing(int []arr) {
		int temp;
		for (int i=0; i<=arr.length-2; i++) {
			for (int j=i+1; j<=arr.length-1; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i]= arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print("Mảng sau khi sắp xếp giảm dần: ");
		Bai1_Mang_TimKiem_SapXep.OutputArray(arr);
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Độ dài mảng = ");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		Bai1_Mang_TimKiem_SapXep.InputArray(arr);
		Bai1_Mang_TimKiem_SapXep.OutputArray(arr);
		System.out.println();
		Ascending(arr);
		Decreasing(arr);
		scanner.close();
	}

}
