package chap02.oop;

import java.util.Calendar;
import java.util.Scanner;

public class Person {
  public String name;
  public String code;
  public int birthday;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public int getBirthday() {
    return birthday;
  }

  public void setBirthday(int birthday) {
    this.birthday = birthday;
  }

  public int getAge() {
    Calendar now = Calendar.getInstance();
    return now.get(Calendar.YEAR) - this.getBirthday();
  }

  // set Student Information
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

    sc.close();
  }

  // show Student Information
  public void showInfor() {
    System.out.println("- Code: " + this.getCode());
    System.out.println("- Name: " + this.getName());
    System.out.println("- Birthday: " + this.getBirthday());
    System.out.println("- Age: " + this.getAge());
  }


}
