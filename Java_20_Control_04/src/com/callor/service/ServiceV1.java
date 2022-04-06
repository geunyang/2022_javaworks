package com.callor.service;

public class ServiceV1 {
	
	/*
	 * void type method를
	 * gugudan 이름으로 선언하기
	 * void type method는 return 명령이 없어도 된다.
	 */
	public void gugudan() {
		
		int intNum1 = 0;
		int intNum2 = 0;
		
		intNum1 = 3;
		intNum2 = 1;
		
		System.out.printf(" \t%d * %d = %d\n ", intNum1, intNum2, intNum1 * intNum2++ );
		System.out.printf(" \t%d * %d = %d\n ", intNum1, intNum2, intNum1 * intNum2++ );
		System.out.printf(" \t%d * %d = %d\n ", intNum1, intNum2, intNum1 * intNum2++ );
		System.out.printf(" \t%d * %d = %d\n ", intNum1, intNum2, intNum1 * intNum2++ );
		System.out.printf(" \t%d * %d = %d\n ", intNum1, intNum2, intNum1 * intNum2++ );
		System.out.printf(" \t%d * %d = %d\n ", intNum1, intNum2, intNum1 * intNum2++ );
		System.out.printf(" \t%d * %d = %d\n ", intNum1, intNum2, intNum1 * intNum2++ );
		System.out.printf(" \t%d * %d = %d\n ", intNum1, intNum2, intNum1 * intNum2++ );
		System.out.printf(" \t%d * %d = %d\n ", intNum1, intNum2, intNum1 * intNum2++ );
	}

}