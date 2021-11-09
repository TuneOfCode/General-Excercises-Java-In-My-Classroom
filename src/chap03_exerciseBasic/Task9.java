package chap03_exerciseBasic;

import java.util.Scanner;

public class Task9 {

  public static void main(String[] args) {
    System.out.print("n= ");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.close();
    int[] array = new int[n];
    int tich;
    do {
      tich = 1;
      // In ra mang va tinh tich cac phan tu trong mang
      System.out.println("");
      for (int j = 0; j < n; j++) {
        System.out.print(array[j]);
        tich *= array[j];
      }
      int i = n - 1;
      do {
        if (array[i] == 0) {
          array[i] = 1;
          for (int j = n - 1; j > i; j--) {
            array[j] = 0;
          }
          break;
        } else
          i--;
      } while (i >= 0);
    } while (tich != 1);
  }

}


