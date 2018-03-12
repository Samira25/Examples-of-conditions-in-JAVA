package com.batchtwoproject.conditions;

import java.util.Scanner;

public class CubeOfNumber {

	public static void main(String[] args) {
		int n, i, res;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Input number of terms :");
		n = scan.nextInt();
		for(i = 1 ; i <= n ; i++) {
			res = (int) Math.pow(i, 3);
			System.out.println("Number is : " + i + " and cube of " + i + " is : " + res);
		}
	}

}
