package com.callor.controller;

public class Method_01 {
	public static void main(String[] args) {
		
		//num()을 호출하여(실행하고) return된 값을
		//intResult에 저장하기
		int intResult = num();
		
		System.out.println(intResult);
		
	}
	/*
	 * num() 를 선언하고 두 수를 덧셈하여 return
	 * 1~100까지의 임의의 정수 2개를
	 */

	//정수 값을 return 하겠다
	public static int num () {
		//임의 정수 2개를 만들고(변수에 저장하고)
		int intNum1 = 0;
		int intNum2 = 0;
		
		intNum1 = (int)(Math.random() * 100) + 1;
		intNum2 = (int)(Math.random() * 100) + 1;
		//두 값을 덧셈하여 return
		return intNum1 + intNum2;
	}
}
