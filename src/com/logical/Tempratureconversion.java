package com.logical;

import java.util.Scanner;

public class Tempratureconversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("select type of conversion \n 1~Fahrenheit to celsius");
		System.out.println("select type of conversion \n 2~celsius to Fahrenheit");
		int Type = sc.nextInt();
		
		double F;
		double C;
		
		switch(Type) {
		
		case 1:
			System.out.println("Enter Temp in FahrenHeit");
			F = sc.nextDouble();
			C = (F - 32) * 5 / 9;
			System.out.println("Temp In Celsius is~ "+C);
			break;
			
		case 2:
			System.out.println("Enter Temp in Celsius");
			C = sc.nextDouble();
			F = (C * 9 / 5) + 32;
			System.out.println("Temp In FahrenHeit is~ "+F);
			break;
		default:
			System.out.println("Invalid Input!!!");
			
			
			
		}
	}

}
