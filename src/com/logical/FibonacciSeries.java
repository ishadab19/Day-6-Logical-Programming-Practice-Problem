package com.logical;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int value = sc.nextInt();
		int num1 = 0, num2 = 1;
		int num3;
		
		System.out.println("Fibonacci Series of: " + value);
		System.out.print(num1 + " " + num2);
		for (int i = 2; i <= value; i++) {
			num3 = num1 + num2; //adding 0+1

			System.out.print(" " + num3);
			num1 = num2;
			num2 = num3;
		}
	}
}