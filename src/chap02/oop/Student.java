package chap02.oop;

import java.util.Scanner;

public class Student extends Person {
  public double score;

  public double getScore() {
    return score;
  }

  public void setScore(double score) {
    this.score = score;
  }

  // set Student Information
  @Override
  public void setInfor() {
    Scanner sc = new Scanner(System.in);

    System.out.print("- Code: ");
    String code = sc.next();
    setCode(code);
    sc.nextLine();

    System.out.print("- Name: ");
    String name = sc.nextLine();
    setName(name);

    System.out.print("- Birthday: ");
    int birthday = sc.nextInt();
    setBirthday(birthday);
    sc.nextLine();

    System.out.print("- Score: ");
    double score = sc.nextDouble();
    setScore(score);

    sc.close();
  }

  // show Student Information
  @Override
  public void showInfor() {
    System.out.println("- Code: " + this.getCode());
    System.out.println("- Name: " + this.getName());
    System.out.println("- Birthday: " + this.getBirthday());
    System.out.println("- Age: " + this.getAge());
    System.out.println("- Score: " + this.getScore());
  }


}
