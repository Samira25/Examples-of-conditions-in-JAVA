package com.batchtwoproject.conditions;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		int num;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Input number:");
		num = scan.nextInt();
		
		if (num>0) {
			System.out.println("Number is positive");
		} else if(num<0) {
			System.out.println("Number is negative");
		} else {
			System.out.println("Number is zero");
		}
	}

}
