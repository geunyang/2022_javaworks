package com.callor.app;

public class Exec22 {
	
	public static void main(String[] args) {

		int paper = 50000;
		int num = 0;
		boolean sw = true;
		int pay = 3123490;

		while (true) {
			num = pay / paper;
			System.out.println(paper + " 원권 " + num + " 매 ");
			if (paper <= 1) {
				break;
			} 
			pay = pay - paper * num; // 나누어 나온 나머지
			if (sw) {
				paper = paper/2;
			} else {
				paper = paper/5;
			}
			sw = !sw;
		} 
	}
}
