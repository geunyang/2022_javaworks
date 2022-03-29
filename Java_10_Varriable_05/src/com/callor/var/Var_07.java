package com.callor.var;

public class Var_07 {

	public static void main(String[] args) {
		
		int intNum = (int)(Math.random() * 1000) + 10;
		int intANS = 33;
		
		/*
		 * Logic Algebra(비교연산), boolean 연산
		 * intNum에 담긴 값이 어떤 제시된 값보다 크거나 작은것을 판단하는 연산
		 * 
		 */
		System.out.println(intNum);
		System.out.println(intNum > intANS);
		System.out.println(intNum <= 99);
		
		// = 변수에 어떤 값을 저장
		// ==검사하는코드
		//intNum을 2로 나눈 나머지가 0인가
		System.out.println((intNum % 2 == 0));
		

	}

}
