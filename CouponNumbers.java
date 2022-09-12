package com.bl.logicalprograms;

import java.util.Scanner;

public class CouponNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many digit's coupon you want");
		int N = sc.nextInt();
		if((N < 0) ||(N > 10)) {
			System.out.println("Invalid number");
			return;
		}
		String couponNum = "";
		while ( N > 0 ) {
			int num = (int) (Math.random()*10);
//			System.out.print(num+ " ");
//			System.out.print(couponNum.contains(""+num)+"\n");
			
			if(!couponNum.contains("" +num)) {
				couponNum += num;
				N--;
			}
		}
		System.out.println("Your coupon num is: " +couponNum);
	}
}
