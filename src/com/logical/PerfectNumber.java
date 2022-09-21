package com.logical;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:~ ");
		int number = sc.nextInt();
		int result =0;
		for(int i = 1; i<=number/2; i++) {
				if(number % i == 0) {
					result = result + i;
				}
			}
		if(result == number)
			System.out.println(" Perfect Number");
		else
			System.out.println("Not a Perfect number");
		
	}

}
