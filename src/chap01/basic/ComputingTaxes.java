package chap01.basic;

import java.util.Scanner;

public class ComputingTaxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SINGLE = 1;
		final int MFJ = 2;
		final int MFS = 3;
		final int HOH = 4;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1 is Single filer");
		System.out.println("2 is married file jointly");
		System.out.println("3 is married file separately");
		System.out.println("4 is tax for head of household");
		
		System.out.print("Status of you: ");
		int status = scanner.nextInt();
		System.out.print("Income of you: ");
		double income = scanner.nextDouble();
		
		double tax = 0;
		
		if (status == SINGLE) {
			if (income > 0 && income <= 8.350) {
				tax = income * 10;
			} else if (income > 8.351 && income <= 33.950) {
				tax = income * 15;
			}else if (income > 33.951 && income <= 82.250) {
				tax = income * 25;
			}else if (income > 82.251 && income <= 171.550) {
				tax = income * 28;
			}else if (income > 171.551 && income <= 372.950) {
				tax = income * 33;
			}else  {
				tax = income * 35;
			}
			System.out.print("Tax for single filers: " + (tax / 100 ) + " USD" );
		} else if (status == MFJ) {
			if (income > 0 && income <= 16.700) {
				tax = income * 10;
			} else if (income > 16.701 && income <= 67.900) {
				tax = income * 15;
			}else if (income > 67.901 && income <= 137.050) {
				tax = income * 25;
			}else if (income > 137.051 && income <= 208.850) {
				tax = income * 28;
			}else if (income > 208.851 && income <= 372.950) {
				tax = income * 33;
			}else  {
				tax = income * 35;
			}
			System.out.println("tax for married file jointly: " + (tax / 100 ) + " USD");
		} else if (status == MFS) {
			if (income > 0 && income <= 8.350) {
				tax = income * 10;
			} else if (income > 8.351 && income <= 33.950) {
				tax = income * 15;
			}else if (income > 33.951 && income <= 68.525) {
				tax = income * 25;
			}else if (income > 68.526 && income <= 104.425) {
				tax = income * 28;
			}else if (income > 104.426 && income <= 186.475) {
				tax = income * 33;
			}else  {
				tax = income * 35;
			}
			System.out.println("tax for married file separately: " + (tax / 100 ) + " USD");
		} else if (status == HOH) {
			if (income > 0 && income <= 11.950) {
				tax = income * 10;
			} else if (income > 11.951 && income <= 45.500) {
				tax = income * 15;
			}else if (income > 45.501 && income <= 117.450) {
				tax = income * 25;
			}else if (income > 117.451 && income <= 190.200) {
				tax = income * 28;
			}else if (income > 190.201 && income <= 372.950) {
				tax = income * 33;
			}else  {
				tax = income * 35;
			}
			System.out.println("tax for head of household: " + (tax / 100 ) + " USD");
		} else {
			System.out.println("Wrong status");
			System.out.println();
		}
		scanner.close();
	}

}
