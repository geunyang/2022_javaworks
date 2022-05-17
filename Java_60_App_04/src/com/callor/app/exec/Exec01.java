package com.callor.app.exec;

/*
 * 해당 프로젝트가 시험범위
 */
public class Exec01 {
	
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		Call call = new Call();
		
		int sum = call.add(num1, num2);
		System.out.println("두 수의 합계 : " + sum);
		
	}

}
