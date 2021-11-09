package chap01.basic;

import java.util.Scanner;

public class ComputerLoanPayments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Interest Rate: ");
		double interestRate = scanner.nextDouble();
		System.out.print("Number of years: ");
		double years = scanner.nextDouble();
		System.out.print("Loan Amount: ");
		double loanAmount = scanner.nextDouble();
		double monthlyInterestRate = interestRate/ (years * 12);
		double monthlyPayment = 
				(loanAmount * monthlyInterestRate) / (1 - (1/Math.pow((1+monthlyInterestRate), 12 * years)));
		System.out.println("Monthly Payment: " + monthlyPayment);
		System.out.println("Total Payment: " + Double.toString(years  * 12 * monthlyPayment));
		scanner.close();
	}

}
