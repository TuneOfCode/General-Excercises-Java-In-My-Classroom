package chap01.basic;

import java.util.Scanner;

public class p08_tower {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 0; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(" * ");
      }
      System.out.println();
    }
    System.out.println("-------------------------------");

    for (int i = n; i >= 0; i--) {
      for (int j = i; j >= 1; j--) {
        System.out.print(" * ");
      }
      System.out.println();
    }
    System.out.println("-------------------------------");

    for (int i = 1; i <= n; i++) {
      for (int k = 1; k <= n - i; k++)
        System.out.print(" ");
      for (int j = 1; j <= i; j++) {
        System.out.print(" * ");
      }
      System.out.println();
    }
    System.out.println("-------------------------------");

    for (int i = n; i >= 0; i--) {
      for (int k = 1; k <= n - i; k++)
        System.out.print(" ");
      for (int j = 1; j <= i; j++)
        System.out.print(" * ");
      System.out.println();
    }
    System.out.println("-------------------------------");

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
    System.out.println("-------------------------------");

    String record = "";
    String result = "";
    String space = "", left = "", right = "";
    int number = 1;
    while (number <= n) {
      space = "";
      left = "";
      right = "";
      for (int s = 1; s <= n - number; s++)
        space += " ";
      for (int l = number; l >= 2; l--)
        left += l;
      for (int r = 2; r <= number; r++)
        right += r;

      record = space + left + "1" + right + "\n";
      result = result + record;
      number++;
    }
    System.out.println(result);
    sc.close();
  }
}

