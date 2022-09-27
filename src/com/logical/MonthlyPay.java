package com.logical;

public class MonthlyPay {
	public static double monthlyPayment(double P, int Y, double R) {
		 double r = R / (12 * 100);
		 double n = 12 * Y;
			double payment = P * r / 1 - Math.pow((1 + r), -n);
			return payment;
		
		
	}
	public static void main(String[] args) {
	double principle = Double.parseDouble(args[0]);
	int year = Integer.parseInt(args[1]);
	double interest = Double.parseDouble(args[2]);
	
	double monthlyPayment = monthlyPayment(principle, year, interest);
	System.out.println("Monthly Payment: "+monthlyPayment );
	}

}
