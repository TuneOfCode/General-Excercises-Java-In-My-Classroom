package BaiTapMang;

import java.util.Scanner;

public class Bai1_Mang {
	public static void InputArray(int []arr) {
		Scanner scanner = new Scanner(System.in);
		for (int i=0; i<=arr.length-1; i++) {
			System.out.print("a[" + i + "] = ");
			arr[i] = scanner.nextInt();
			
		}
		scanner.close();
	}
	public static void Average(int []arr) {
		double average = 0;
		for(int i=0; i<=arr.length-1; i++) {
			average += arr[i];
		}
		System.out.println("Average of array is " + (average / arr.length));
	}
	
	public static void OutputArray(int []arr) {
		for (int i=0; i<=arr.length-1; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = new int[5];
		InputArray(arr);
		OutputArray(arr);
		System.out.println();
		Average(arr);
	}

}
