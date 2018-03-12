package com.batchtwoproject.conditions;

import java.util.Scanner;

public class QuadraticEquations {

	public static void main(String[] args) {
		double a, b, c, root, resplus, resminus;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input a:");
		a = scan.nextDouble();
		System.out.println("Input b:");
		b = scan.nextDouble();
		System.out.println("Input c:");
		c = scan.nextDouble();
		root = Math.pow(b, 2) - (4 * a * c);
		if (root>=0) {
			resplus = ((-b) + (Math.pow(root, 0.5))) / (2 * a);
			resminus = ((-b) - (Math.pow(root, 0.5))) / (2 * a);
			System.out.println("The roots are " + resplus + " and " + resminus);
		} else {
			System.out.println("The equation has no real roots");
		}
	}

}
