package chap01.basic;

public class p04_loop {
  public static void multi_table() {
    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= 9; j++) {
        System.out.println(j + " x " + i + " = " + (i * j));
      }
      System.out.println("\t");
    }
  }

  public static void main(String[] args) {
    multi_table();
  }
}
