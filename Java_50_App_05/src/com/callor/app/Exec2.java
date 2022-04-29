package com.callor.app;

public class Exec2 {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		int g = 0;
		int h = 0;

		int pay = 3123450;		
		
		a = pay/50000;
		System.out.println("5만원권 : " + a + "장");
		
		b = pay%50000/10000;
		System.out.println("1만원권 : " + b + "장");
		
		c = pay%10000/5000;
		System.out.println("5천원권 : " + c + "장");

		d = pay%10000/1000;
		System.out.println("1천원권 : " + d + "장");
		
		e = pay%1000/500;
		System.out.println("500원 동전 : " + e + "개");

		f = pay%500/100;
		System.out.println("100원 동전 : " + f + "개");

		g = pay%100/50;
		System.out.println("50원 동전 : " + g + "개");

		h = pay%50/10;
		System.out.println("10원 동전 : " + h + "개");
		
		

		

	}

}
