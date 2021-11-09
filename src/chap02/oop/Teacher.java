package chap02.oop;

import java.util.Scanner;

public class Teacher extends Person {
  public double salary;

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  // set Teacher Information
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

    System.out.print("- Salary: ");
    double salary = sc.nextDouble();
    setSalary(salary);

    sc.close();
  }

  // show Teacher Information
  @Override
  public void showInfor() {
    System.out.println("- Code: " + this.getCode());
    System.out.println("- Name: " + this.getName());
    System.out.println("- Birthday: " + this.getBirthday());
    System.out.println("- Age: " + this.getAge());
    System.out.println("- Salary: " + this.getSalary());
  }


}
