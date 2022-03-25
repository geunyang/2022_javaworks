package com.callor.var;

public class Var_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0;
		/*
		 * 변수 ++ 또는 ++변수는 단독으로 사용될때 연산 결과가 똑같다
		 * 
		 */
		++num1;
		num1++;
		/*
		 * 하지만 다른 명령문 안에서 사용 될때는 성질이 매우 달라 주의를 해야한다
		 * ++변수 : 가장 먼저 실행되는 명령
		 * 변수++ : 모든 명령이 다 실행되고 다음줄 명령문으로 진행하기 직전에 실행
		 */
		System.out.println(++num1);
		System.out.println(num1++);
		
		System.out.println();
		
		num1 = 0;
		num1 = ++num1 * 3;
		System.out.println(num1);
		
		num1 = 0;
		num1 = num1++ * 3;
		System.out.println(num1);
		
	}

}
