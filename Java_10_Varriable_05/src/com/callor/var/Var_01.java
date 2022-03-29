package com.callor.var;

public class Var_01 {

	public static void main(String[] args) {
		
		// 실수(double)형으로 선언할 경우 0보다는 0.0으로 명확하게 표현하는 것이 권장
		double douNum1 = 0.0;
		double douNum2 = 0.0;
		
		douNum1 = Math.random() * 1000;
		douNum2 = Math.random() * 1000;
		
		System.out.println(douNum1);
		System.out.println(douNum2);
		
		System.out.println(douNum1 + douNum2);
		System.out.println(douNum1 - douNum2);
		System.out.println(douNum1 * douNum2);
		System.out.println(douNum1 / douNum2);

		
	}

}
