package ClassroomExcerciseLoop2;

import java.util.Scanner;

public class NumberDevide7NotDevide5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=10; i<=200; i++) {
			if ((i % 7 == 0) && (i% 5 != 0 )) {
				System.out.print(i + " ");
			}
		}
	}

}
