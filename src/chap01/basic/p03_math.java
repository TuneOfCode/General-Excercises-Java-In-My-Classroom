package chap01.basic;

import java.util.*;
public class p03_math {
  public static void max_min(int a, int b) {
    System.out.println("Max: " + Math.max(a, b));
    System.out.println("Min: " + Math.min(a, b));
  }

  // Làm tròn số nguyên lớn hơn
  public static void ceil(double x) {
    System.out.println("ceil: " + Math.ceil(x));
  }

  // Làm tròn số nguyên nhỏ hơn
  public static void floor(double x) {
    System.out.println("floor: " + Math.floor(x));
  }

  // Làm tròn số nguyên theo phần thập phân
  public static void round(double x) {
    System.out.println("round: " + Math.round(x));
  }

  public static void sqrt(int x) {
    System.out.println("sqrt: " + Math.sqrt(x));
  }

  public static void random() {
    System.out.println("random: " + Math.random());
  }

  public static void main(String[] args) {
    int a = 4, b = 10;
    double x = 24.2343;
    max_min(a, b);
    ceil(x);
    floor(x);
    round(x);
    sqrt(a);
    random();
  }
}
