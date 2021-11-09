package chap03_exerciseBasic;

import java.util.Scanner;

public class calendar {
	// Hàm hiển thị ra tháng và năm
	public static void DisplayMonthAndYear(int month, int year) {
		String Month[] = {"January", "February", "March", 
				"April", "May", "Jun", "July", "August", 
				"September", "October", "November", "December"};
		for (int i=0; i<=Month.length; i++) {
			if (month == i) {
				System.out.printf(" %22s, %d ", Month[i-1], year);
	
			}
		}
	}
	
	// Hàm hiển thị ra các thứ trong tuần
	public static void DisplayDayOfWeek() {
		String Week[] = {"Sun", "Mon", "Tue", "Wed", "Thu", 
				"Fri", "Sat"};
		for (int i=0; i<=Week.length-1; i++) {
			System.out.printf(" %5s ", Week[i]);
		}
	}
	
	// Hàm tính ra số ngày tối đa của mỗi tháng
	public static int MaxNumberOfDaysInMonth(int month, int year) {
		int maxMonth;
		
		switch(month) {
		case 4: case 6: case 9: case 11: maxMonth = 30;
			break;
		case 2: maxMonth = 28 + ((year % 4 == 0 && year % 100 !=0) || (year % 400 == 0) ? 1 : 0);
			break;
		default: 
			maxMonth = 31;
			break;
			
		}
		return maxMonth;
	}
	
	// Hàm tính thứ của ngày đầu tiên trong tháng
	public static int FirstDayOfWeekInMonth(int month, int year) {
		int a = (14 - month) / 12;
		int y = year - a;
		int m = month + 12 * a - 2;
		int FirstDayOfWeek = (1 + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;
		
		FirstDayOfWeek = FirstDayOfWeek != 0 ? FirstDayOfWeek  : 0;
		return FirstDayOfWeek;
	}
	
	// Hàm in ra lịch
	public static void DisplayCalendar(int month, int year) {
		String space = " ";
		for (int i=0; i<FirstDayOfWeekInMonth(month, year); i++) {
			System.out.printf(" %5s ", space);
		}
		
		for (int day=1; day<=MaxNumberOfDaysInMonth(month, year); day++) {
			 System.out.printf(" %5d ", day);
			 if ((day + FirstDayOfWeekInMonth(month, year)) % 7 == 0) {
				 System.out.println();
			 }
		}
		
		if ((MaxNumberOfDaysInMonth(month, year) + FirstDayOfWeekInMonth(month, year)) % 7 == 0) {
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
//		System.out.print("Month = ");
//		int month = scanner.nextInt();
		
		// In lịch của 1 năm
		System.out.print("Year = ");
		int year = scanner.nextInt();
		
		for (int month=1; month<=12; month++) {
			// Hiển thị ra tiêu đề tháng và năm
			DisplayMonthAndYear(month, year);
			
			System.out.println();
			System.out.println("--------------------------------------------------- \n");
			
			// Hiển thị ra thứ trong 1 tháng
			DisplayDayOfWeek();
			
			System.out.println();
			
			// Hiển thị ra lịch
			DisplayCalendar(month, year);
			System.out.println("\n \n");
		}
		
		
		scanner.close();
	}

}