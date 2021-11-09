package chap01.basic;

import java.util.Scanner;

public class p07_find {
  public static void main(String[] args) {
    int max = 100, min = 1;
    int range = max - min + 1;
    int score = 0;
    int secretNumber = (int) (Math.random() * range) + min;
    System.out.println(secretNumber);
    int yourNumber = 0;
    Scanner sc = new Scanner(System.in);
    while (secretNumber != yourNumber) {
      System.out.println("Your' s Number (1-100): ");
      yourNumber = sc.nextInt();
      if (yourNumber > secretNumber) {
        System.out.println("Greater than!");
        // yourNumber = sc.nextInt();
      } else if (yourNumber < secretNumber) {
        System.out.println("Less than");
        // yourNumber = sc.nextInt();
      } else
        System.out.println("Sucessfull !");
      score++;
    }
    sc.close();
    System.out.println("Score: " + score);
  }
}
