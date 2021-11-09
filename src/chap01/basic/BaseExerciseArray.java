package chap01.basic;

import java.util.Random;
import java.util.Scanner;

public class BaseExerciseArray {
	public static void InputArray(int []a, int n) {
		Random random = new Random();
		for(int i=0; i<n; i++) {
			a[i] = (random.nextInt(40) - 20);
		}
	}
	public static void OutputArray(int []a, int n) {
		for (int i=0; i<n; i++) {
			System.out.print(a[i] + " ");
		}
	}
	// kiểm tra số có 2 chữ số
	public static boolean checkNumberWith2Digits(int n) {
		int count = 0;
		while (n != 0) {
			n/=10;
			count++;
		}
		if (count == 2) return true;
		else return false;
	}
	// xóa phần tử trong mảng
	public static void deleteNumberArray(int []a, int n, int pos) {
		// xóa đầu
		if (pos < 0) {
			pos = 0;
		} 
		// xóa cuối
		else if (pos >= n) {
			pos = n - 1;
		}
		// xóa giữa
		for (int i=pos; i<n-1; i++) {
			a[i] = a[i+1];
		}
		//--n;
	}
	// kiểm tra số chính phương
	public static boolean checkSquareNumber(int n) {
		int sqrt = (int)Math.sqrt(n);
		if ((Math.pow(sqrt, 2) == n) && (n > 1 )) {
			return true;
		} else {
			return false;
		}
	}
	// Tìm số lớn nhất có 2 chữ số
	public static void maxNumberWith2DigitsArray(int []a, int n) {
		int max = a[0];
		for (int i=1; i<n; i++) {
			if (checkNumberWith2Digits(a[i])) {
				if (a[i] > max) { 
					max = a[i];
				}
			} 
		}
		System.out.print("1. Số lớn nhất trong số các phần tử có 2 chữ số: " + max);
		System.out.println();
	}
	// Xóa các số cực trị
	public static void deleteMaxMinArray(int []a, int n) {
		int max = a[0];
		int vt_max = 0;
		int min = a[0];
		int vt_min = 0;
		for (int i=0; i<n;i++) {
			if (a[i] > max) {
				max = a[i];
				vt_max = i;
			}
		}
		if (vt_max < 0) vt_max = 0;
		else if (vt_max >=n) {
			vt_max  = n - 1;
		}
		for (int i=vt_max; i<n-1; i++) {
			a[i] = a[i+1];
		}
		
		
		for (int i=0; i<n;i++) {
			if (a[i] < min) {
				min = a[i];
				vt_min = i;
			}
		}
		if (vt_min < 0) vt_min = 0;
		else if (vt_min >=n) {
			vt_min  = n - 1;
		}
		for (int i=vt_min; i<n-1; i++) {
			a[i] = a[i+1];
		}
		n -= 2;
		// xoá các số cực trị
		
		System.out.print("2. Xoá các số cực trị: ");
		OutputArray(a, n);
		System.out.println();
	}
	// tìm vị trí của các số chia hết cho 10 và ở vị trí chẵn
	public static void positionNumberArray(int []a, int n) {
		System.out.print("3. Vị trí của các phần tử chia hết cho 10 và ở vị trí chẵn trong mảng: ");
		for (int i=0; i<n; i++) {
			if ((a[i] % 10 == 0) && (i % 2 == 0 )) {
				
				System.out.print(i + " ");
			} else {
				System.out.print("không có");
				break;
			}
		}
		System.out.println();
	}
	// Đếm số phần tử là số chính phương trong mảng
	public static void countSquareNumbers(int []a, int n) {
		int count = 0;
		for (int i=0; i<n; i++) {
			if (checkSquareNumber(a[i])) {
				count++;
			}
		}
		System.out.println("4. Số phần tử là số chính phương trong mảng là: " + count);
	}
	// Tính tích các phần tử có hàng chục lẻ
	public static void accumulateOddNumbers(int []a, int n) {
		int accumulate = 1;
		for (int i=0; i<n; i++) {
			if ((a[i] / 10) % 2 != 0) {
				accumulate *= a[i];
			}
		}
		System.out.println("5. Tích các phần tử có hàng chục lẻ: " + accumulate);
	}
	// Đếm số lần phần tử x xuất hiện ở vị trí lẻ trong mảng
	public static void position_x(int []a, int n, int x) {
		int count = 0;
		for (int i=0; i<n; i++) {
			if ((a[i] == x ) && (i % 2 != 0 )) {
				count++;
			}
		}
		System.out.printf("6. Số lần phần tử %d xuất hiện ở vị trí lẻ trong mảng: %d", x, count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("n = ");
		int n = scanner.nextInt();
		int[] a = new int[n];
		
		// input
		InputArray(a, n);
		System.out.print("Vị trí x = ");
		int x = scanner.nextInt();
		
		// output
		System.out.print("Array: ");
		OutputArray(a, n);
		System.out.println();
		System.out.println();
	
		// processed array
		maxNumberWith2DigitsArray(a, n);
		deleteMaxMinArray(a, n);
		positionNumberArray(a, n);
		countSquareNumbers(a, n);
		accumulateOddNumbers(a, n);
		position_x(a, n, x);
		scanner.close();
	}

}
