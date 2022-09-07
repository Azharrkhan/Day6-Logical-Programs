package com.bl.logicalprograms;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter value of n");

		int n = sc.nextInt();
		int i = 0;
		int firstTerm = 0;
		int secondTerm = 1;
		for (i = 1; i <= n; i++) {
			System.out.println(firstTerm);

			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}
}
