package chap03_exerciseBasic;

import java.util.Scanner;

public class Task5_6_7 {
  public static boolean checkPrime(int n) {
    int count = 0;
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        count++;
      }
    }

    if (count == 0)
      return true;
    else
      return false;
  }

  public static void showPrime(int n) {
    System.out.print("Prime less than " + n + ": ");
    for (int i = 2; i < n; i++) {
      if (checkPrime(i)) {
        System.out.print(i + " ");
      }
    }
  }

  public static int FibonacciDQ(int n) {
    if (n == 0 || n == 1)
      return 1;
    else {
      return FibonacciDQ(n - 1) + FibonacciDQ(n - 2);
    }
  }

  public static void Fibocacci(int n) {
    int fibo = 0;
    int a = 1, b = 1;
    for (int i = 2; i <= n; i++) {
      fibo = a + b;
      a = b;
      b = fibo;
    }
    System.out.println();
    System.out.printf("Fibonacci(%d): %d", n, fibo);

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("n= ");
    int n = sc.nextInt();
    showPrime(n);
    System.out.println();
    System.out.printf("Dùng đệ quy Fibonacci(%d): %d", n, FibonacciDQ(n));
    Fibocacci(n);
    //System.out.println("Ä�áº©y lÃªn báº±ng commit xem sao!");
    sc.close();

  }

}
