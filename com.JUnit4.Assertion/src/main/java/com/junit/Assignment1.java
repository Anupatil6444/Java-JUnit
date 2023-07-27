package com.junit;

import java.util.Scanner;

class Assignment1 {
	Scanner sc = new Scanner(System.in);

	public String makeUpperCase() {
		System.out.println("Enter text for test:");
		String name = sc.nextLine();
		System.out.println(name.toUpperCase());
		return name.toUpperCase();

	}

	public boolean findNumPositiveOrNot() {
		System.out.println("Enter the number for test:");
		int num = sc.nextInt();
		if (num > 0) {
			System.out.println("Yes");
			return true;
		} else {
			return false;
		}

	}

	public int factorial() {
		System.out.println("Enter the number for factorial test:");
		int n = sc.nextInt();
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		System.out.println(fact);
		return fact;
	}
}
