package chap01.basic;

import java.text.DecimalFormat;
import java.util.Scanner;

public class p09_ATM {
  public static void main(String[] args) {
    DecimalFormat formater = new DecimalFormat("#, ###");

    final int FIVE_HUNDRED_THOUSAND = 500000;
    final int TWO_HUNDRED_THOUSAND = 200000;
    final int ONE_HUNDRED_THOUSAND = 100000;
    final int FIFTY_THOUSAND = 50000;
    final int TWEENTY_THOUSAND = 20000;
    final int TEN_THOUSAND = 10000;

    int fiveHunredThousand = 0;
    int twoHunredThousand = 0;
    int oneHunredThousand = 0;
    int fiftyThousand = 0;
    int tweentyThousand = 0;
    int tenThousand = 0;

    int money = 0;
    Scanner sc = new Scanner(System.in);
    do {
      System.out.println("Your's money: ");
      String moneyString = sc.nextLine();
      moneyString = moneyString.replaceAll("\s+", "").replaceAll("\\.+", "").replaceAll("\\,+", "");
      money = Integer.parseInt(moneyString);
      // System.out.println(money);
    } while (money % 10000 != 0);
    sc.close();

    // VND --> USD
    int USD = money / 22790;
    System.out.println("Mệnh giá đồng USD: " + formater.format(USD) + "USD");

    // 500.000vnd
    if (money >= FIVE_HUNDRED_THOUSAND) {
      fiveHunredThousand = money / FIVE_HUNDRED_THOUSAND;
      money = money % FIVE_HUNDRED_THOUSAND;
      System.out.printf("Mệnh giá %sVND: %d tờ", formater.format(FIVE_HUNDRED_THOUSAND),
          fiveHunredThousand);
      System.out.println();
    }

    // 200.000vnd
    if (money >= TWO_HUNDRED_THOUSAND) {
      twoHunredThousand = money / TWO_HUNDRED_THOUSAND;
      money = money % TWO_HUNDRED_THOUSAND;
      System.out.printf("Mệnh giá %sVND: %d tờ", formater.format(TWO_HUNDRED_THOUSAND),
          twoHunredThousand);
      System.out.println();
    }

    // 100.000vnd
    if (money >= ONE_HUNDRED_THOUSAND) {
      oneHunredThousand = money / ONE_HUNDRED_THOUSAND;
      money = money % ONE_HUNDRED_THOUSAND;
      System.out.printf("Mệnh giá %sVND: %d tờ", formater.format(ONE_HUNDRED_THOUSAND),
          oneHunredThousand);
      System.out.println();
    }

    // 50.000vnd
    if (money >= FIFTY_THOUSAND) {
      fiftyThousand = money / FIFTY_THOUSAND;
      money = money % FIFTY_THOUSAND;
      System.out.printf("Mệnh giá %sVND: %d tờ", formater.format(FIFTY_THOUSAND), fiftyThousand);
      System.out.println();
    }

    // 20.000vnd
    if (money >= TWEENTY_THOUSAND) {
      tweentyThousand = money / TWEENTY_THOUSAND;
      money = money % TWEENTY_THOUSAND;
      System.out.printf("Mệnh giá %sVND: %d tờ", formater.format(TWEENTY_THOUSAND),
          tweentyThousand);
      System.out.println();
    }

    // 10.000vnd
    if (money >= TEN_THOUSAND) {
      tenThousand = money / TEN_THOUSAND;
      money = money % TEN_THOUSAND;
      System.out.printf("Mệnh giá %s VND: %d tờ", formater.format(TEN_THOUSAND), tenThousand);
      System.out.println();
    }


    // System.out.println("Số tiền còn lại: " + money);
  }
}
