package BaiTapMang_TimKiem_SapXep;

import java.util.Scanner;

public class Bai2_Mang_TimKiem_SapXep {
	public static void Find(int []arr, int item) {
		
		int count = 0;
		for (int i=0; i<=arr.length-1; i++) {
			if (arr[i] == item) {
				System.out.printf("Vị trị của %d bằng với %d là %d", arr[i], item, i);
				System.out.println();
				count++;
			} else {
				System.out.printf("Vị trị của %d bằng với %d là %d", arr[i], item, (-1));
				System.out.println();
			}
		}
		if ((arr.length == 0) || (count == 0)) {
			System.out.println("Không có giá trị tìm kiếm nào thỏa mãn !");
		}
		
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
		System.out.print("Số cần tìm = ");
		int item = scanner.nextInt();
		Find(arr, item);
		scanner.close();
	}

}
