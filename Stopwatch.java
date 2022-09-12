package com.bl.logicalprograms;

import java.util.Scanner;

public class Stopwatch {
	 
	
	public static void main(String[] args) {
		long startTime = 0;
		long stopTime = 0;
		double elapsedTime;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type any number to start timer");
		sc.nextInt();
		
		startTime = System.currentTimeMillis();
		
		System.out.println("Type any number to stop timer");
		sc.nextInt();
		
		stopTime = System.currentTimeMillis();
		
		elapsedTime = (stopTime - startTime)/1000;
		
		System.out.println(elapsedTime);
	}
}
