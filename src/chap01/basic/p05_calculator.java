package chap01.basic;

import java.util.Scanner;

public class p05_calculator {
  public static void sum(int x, int y) {
    System.out.println(x + " + " + y + " = " + (x + y));
  }

  public static void sub(int x, int y) {
    System.out.println(x + " - " + y + " = " + (x - y));
  }

  public static void multi(int x, int y) {
    System.out.println(x + " x " + y + " = " + (x * y));
  }

  public static void devide(int x, int y) {
    System.out.println(x + " : " + y + " = " + (x / y));
  }

  public static void module(int x, int y) {
    System.out.println(x + " :R " + y + " = " + (x % y));
  }

  public static void main(String[] args) {
    int numberFirst;
    int numberSecond;
    String caculate;

    Scanner sc = new Scanner(System.in);
    System.out.println("Number first: ");
    numberFirst = sc.nextInt();
    sc.nextLine();

    System.out.println("Number second: ");
    numberSecond = sc.nextInt();
    sc.nextLine();

    System.out.println("calculate: ");
    caculate = sc.nextLine();
    sc.close();

    switch (caculate) {
      case "+":
        sum(numberFirst, numberSecond);
        break;
      case "-":
        sub(numberFirst, numberSecond);
        break;
      case "x":
      case "*":
        multi(numberFirst, numberSecond);
        break;
      case ":":
      case "/":
        devide(numberFirst, numberSecond);
        break;
      case "R":
        module(numberFirst, numberSecond);
        break;
      default:
        System.out.println("NaN");
    }

  }
}
