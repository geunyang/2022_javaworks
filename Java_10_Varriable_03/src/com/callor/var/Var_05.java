package com.callor.var;

public class Var_05 {

	public static void main(String[] args) {
		
		int num1 = 1;
		/*
		 * 아래 명령문이 실행되면 앞에서 num1에 저장된 1이 일단 출력되고
		 * println() 명령 실행이 끝나면 비로소 num1++가 실행된다
		 */
		System.out.println(num1++); // 1 이 출력된다
		System.out.println(num1++); // 2 가 출력된다
		System.out.println(num1++); // 3 이 출력된다
		
		num1 = 0;
		
		System.out.println(num1); // 0이 출력
		
		num1 += 1;
		System.out.println(num1); // 1이 출력

	}

}
