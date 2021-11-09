package ClassroomExcercise3;

import java.util.Scanner;

public class checkDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("distance in meters: ");
		double distance = scanner.nextDouble();
		System.out.print("hour: ");
		double hour = scanner.nextDouble();
		System.out.print("minutes: ");
		double minutes = scanner.nextDouble();
		System.out.print("seconds: ");
		double seconds = scanner.nextDouble();
		
		if ((hour >= 0  && hour <= 23) && (minutes >= 0 && minutes <= 59) && (seconds >= 0 && seconds <= 59)) {
			double getHours = hour + (minutes / 60) + (seconds / 3600);
			double getSeconds = hour * 3600 + minutes * 60 + seconds;
			
			System.out.println("Your speed in meters/second is " + ((double)distance / getSeconds));
			System.out.println("Your speed in km/h is " + ((double)(distance / 1000) / getHours));
			System.out.println("Your speed in miles/h is " + ((double)(distance * 1000) / getHours));
		} else {
			System.out.println("error format time !");
		}
		
		
		scanner.close();
	}

}
