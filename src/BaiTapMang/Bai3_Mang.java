package BaiTapMang;

import java.util.Scanner;

import BaiTapMang_TimKiem_SapXep.Bai1_Mang_TimKiem_SapXep;

public class Bai3_Mang {
	public static void InputRandomArray(double []arr) {
		for (int i=0; i<=arr.length-1; i++) {
			double number = Math.random() * 1;
			arr[i] = Math.floor(number * 1000) / 1000;
		}
	}
	public static void OutputRandomArray(double []arr) {
		for (int i=0; i<=arr.length-1; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void Average(int []arr1, double []arr2) {
		int length = arr1.length-1;
		double sum = 0.0;
		for (int i=0; i<=length; i++) {
			sum += arr1[i] + arr2[i];
		}
		
		System.out.println(sum);
		System.out.print("Trung bình trọng số của 2 mảng là " + (sum / (length + 1) ));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Độ dài của mảng = ");
		int n = scanner.nextInt();
		int []arr1 = new int [n];
		double []arr2 = new double [n];
		Bai1_Mang_TimKiem_SapXep.InputArray(arr1);
		Bai1_Mang_TimKiem_SapXep.OutputArray(arr1);
		System.out.println();
		InputRandomArray(arr2);
		OutputRandomArray(arr2);
		System.out.println();
		Average(arr1, arr2);
		scanner.close();
	}

}
