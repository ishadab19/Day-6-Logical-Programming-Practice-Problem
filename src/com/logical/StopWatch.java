package com.logical;

import java.util.Scanner;

public class StopWatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 To Start Watch");
		int watch = sc.nextInt();
		long startMillis = System.currentTimeMillis();
		System.out.println("Stopwatch Started Now at~ "+startMillis);
		System.out.println("Enter 0 to stop watch");
		watch = sc.nextInt();
		long stopMillis = System.currentTimeMillis();
		System.out.println("StopWatch stopped Now at~ "+stopMillis);
		double elapse = ((stopMillis - startMillis)/1000);
		System.out.println("The Elapsed Time in sec: "+elapse);
		
	}

}
