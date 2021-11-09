package chap03_exerciseBasic;

import java.util.Scanner;

public class Task2 {
  public static void convert(int n, int b) {
    int chuso = 0;
    String hecosoString = "";
    while (n != 0) {
      chuso = n % b;
      hecosoString = chuso + hecosoString;
      n /= b;
    }
    System.out.printf("Hệ cơ số %d là: %s", b, hecosoString);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("n = ");
    int n = sc.nextInt();
    System.out.println("b = ");
    int b = sc.nextInt();
    convert(n, b);
    sc.close();
  }
}
