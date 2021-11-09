package ClassroomExcerciseLoop2;

public class ListPrimeHaveFiveDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The prime have five digits is: ");
		for (long num=10000; num<=99999; num++) {
			int count = 0;
			for (int i=2; i<=Math.sqrt(num); i++) {
				if (num % i == 0) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(num + " ");
			} else {
				count = 0;
			}
		}
	}

}
