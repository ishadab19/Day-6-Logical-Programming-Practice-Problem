package com.logical;
import java.util.*;
public class ReverseNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int number = s.nextInt();
		System.out.println("Original Number: "+number);
		int reverse=0, remain;
		while(number != 0)
		{
			remain = number % 10;
			reverse = reverse* 10 + remain;
			number = number / 10 ;
		}
		System.out.println("Reversed Number: "+reverse);
	}

}
