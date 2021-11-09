package chap03_exerciseBasic;

import java.util.Scanner;

public class Task3 {
  public static long sumNumber(int n) {
    int number = 0, sum = 0;
    while (n != 0) {
      number = n % 10;
      sum += number;
      n /= 10;
    }
    return sum;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("n = ");
    int n = scanner.nextInt();
    System.out.println(sumNumber(n));
    scanner.close();
  }

}
