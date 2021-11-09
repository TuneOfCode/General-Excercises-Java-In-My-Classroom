package chap03_exerciseBasic;

import java.util.Scanner;

public class Task4 {
  public static boolean checkPrime(int n) {
    int count = 0;
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0)
        count++;
    }
    if (count == 0)
      return true;
    else
      return false;
  }

  public static void showPrime(int n) {
    for (int i = 2; i <= (n / 2); i++) {
      if (checkPrime(i))
        System.out.print(i + " ");
    }
  }

  public static String removeLastChar(String str) {
    str = str.substring(0, str.length() - 2);
    return str;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("n = ");
    int n = sc.nextInt();
    String resultString = "";
    int m = n, k = n;

    if (checkPrime(m)) {
      resultString = m + " x " + 1;
      System.out.println(m + " = " + resultString);
    }

    else {
      String loop_iString = "";
      int i = 2;
      while (i <= (k / 2)) {
        int count = 0;
        if (checkPrime(i))
          while (m % i == 0) {
            count++;
            m /= i;
          }
        if (count > 0) {
          for (int j = 1; j <= count; j++)
            loop_iString += i + " x ";
          resultString += loop_iString;
        }

        loop_iString = "";
        i++;
      }
      System.out.println(k + " = " + removeLastChar(resultString));
    }

    sc.close();
  }

}

// method
// while (n % 2 == 0) {
// count_2++;
// n /= 2;
// }
// while (n % 3 == 0) {
// count_3++;
// n /= 3;
// }
// while (n % 5 == 0) {
// count_5++;
// n /= 5;
// }
// while (n % 7 == 0) {
// count_7++;
// n /= 7;
// }
