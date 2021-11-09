package chap03_exerciseBasic;

public class Task8 {
  public static boolean checkSymmetricalNumber(int n) {
    String numString = Integer.toString(n);
    String reserseNumberString = "";
    for (int i = numString.length() - 1; i >= 0; i--) {
      reserseNumberString += numString.charAt(i);
    }
    // int m = Integer.parseInt(reserseNumberString);
    // if (n == m)
    // return true;
    // else
    // return false;
    if (reserseNumberString.equals(numString))
      return true;
    else
      return false;
  }

  public static void main(String[] args) {
    for (int i = 100000; i <= 999999; i++) {
      if (checkSymmetricalNumber(i))
        System.out.println(i);
    }
  }

}
