package chap02.oop;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // Teacher
    System.out.println("Enter the number of teachers: ");
    Scanner sc = new Scanner(System.in);
    int numberTeacher = sc.nextInt();

    Teacher[] teacher = new Teacher[numberTeacher];
    System.out.println("Input Information of teachers: ");

    for (int i = 0; i < numberTeacher; i++) {
      teacher[i] = new Teacher();
      teacher[i].setInfor();
    }
    System.out.println("--------------------------");

    // Student
    System.out.println("Enter the number of students: ");
    int numberStudent = sc.nextInt();

    Student[] student = new Student[numberStudent];
    System.out.println("Input Information of students: ");

    for (int i = 0; i < numberStudent; i++) {
      student[i] = new Student();
      student[i].setInfor();
    }
    System.out.println("--------------------------");

    System.out.println("Information of teachers: ");
    for (int i = 0; i < numberTeacher; i++) {
      teacher[i].showInfor();
      System.out.println("--------------------------");
    }

    System.out.println("**********************************************");



    System.out.println("Information of students: ");
    for (int i = 0; i < numberStudent; i++) {
      student[i].showInfor();
      System.out.println("--------------------------");
    }

    sc.close();
  }
}
