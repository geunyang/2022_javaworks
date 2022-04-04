package com.callor.controller;

public class Method_02 {

	public static void main(String[] args) {
		
		int intResult1 = add();
		int intResult2 = multi();
		System.out.println(intResult1 + intResult2);

	}
	public static int add() {
		int intAdd1 = (int) (Math.random()*100) + 1;
		int intAdd2 = (int) (Math.random()*100) + 1;
		return intAdd1 + intAdd2;
	}
	public static int multi() {
		int intMulti1 = (int) (Math.random()*100) +1;
		int intMulti2 = (int) (Math.random()*100) +1;
		return intMulti1 + intMulti2;
	}
}
