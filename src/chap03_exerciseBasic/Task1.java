package chap03_exerciseBasic;

import java.util.Scanner;

public class Task1 {
  public static int ucln(int a, int b) {
    while (a != b && a != 1) {
      if (a > b)
        a -= b;
      else
        b -= a;
    }
    return a;
  }

  public static int bcnn(int a, int b) {
    return (a * b) / ucln(a, b);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("a =  ");
    int a = sc.nextInt();
    System.out.println("b = ");
    int b = sc.nextInt();

    System.out.printf("UCLN của %d và %d là: %d", a, b, ucln(a, b));
    System.out.println();
    System.out.printf("BCNN của %d và %d là: %d", a, b, bcnn(a, b));
    sc.close();
  }
}
