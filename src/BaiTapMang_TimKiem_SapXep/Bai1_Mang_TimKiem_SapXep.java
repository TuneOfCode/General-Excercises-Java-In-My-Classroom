package BaiTapMang_TimKiem_SapXep;

import java.util.Scanner;

public class Bai1_Mang_TimKiem_SapXep {
	
	public static void InputArray(int []arr) {
		for (int i=0; i<=arr.length-1;i++) {
			double randomDouble = Math.random();
            randomDouble = randomDouble * 100 + 1;
            int randomInt = (int) randomDouble;
			arr[i] = randomInt;
		}
		
	}
	
	public static void Find(int []arr, int item) {
		int index = 0;
		for (int i=0; i<=arr.length-1; i++) {
			if (arr[i] == item) {
				index = i;
				break;
			} else {
				index = -1;
			}
		}
		System.out.println("Chỉ số đầu tiên tìm kiếm được là: " + index);
	}
	
	public static void OutputArray(int []arr) {
		for (int i=0; i<=arr.length-1; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Độ dài mảng = ");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		InputArray(arr);
		OutputArray(arr);
		System.out.println();
		System.out.print("Số cần tìm = ");
		int item = scanner.nextInt();
		Find(arr, item);
		scanner.close();
	}

}
