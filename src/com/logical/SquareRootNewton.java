package com.logical;

public class SquareRootNewton {

	public static void main(String[] args) {
		double c = Double.parseDouble(args[0]);
		double epsilon = 1e-15;
		double t = c ; //initialize t = c
		while(Math.abs(t - c/t) > epsilon*t) {
			t = (c/t + t) / 2;
		}
		System.out.println("the square root of a nonnegative number c:"+ c + " = " + t);

	}

}
