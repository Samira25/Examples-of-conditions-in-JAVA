package com.batchtwoproject.conditions;

import java.util.Scanner;

public class FloatingNumber {

	public static void main(String[] args) {
		double num;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Input number:");
		num = scan.nextDouble();

		if (num == 0){
			System.out.println("Zero");
		}
		else if (num > 0 && num < 1){
			System.out.println("Small");
		}
		else if (num >= 1 && num < 1000000){
			System.out.println("Positive");
		}
		else if (num > 1000000){
			System.out.println("Large");
		}
		else if (num < 0){
			System.out.println("Negative");
		}
	}

}
