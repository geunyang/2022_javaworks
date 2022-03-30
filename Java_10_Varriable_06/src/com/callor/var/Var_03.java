package com.callor.var;

public class Var_03 {

	public static void main(String[] args) {
		
		int intNum1 = (int)(Math.random() * 100) + 1;
		
		// boolean type의 변수 초기화는 true값을 주로 사용
		boolean bEven = true; 
		
		bEven = (intNum1 % 2) == 0;
		
		/*
		 * 비교(조건) 명령문
		 *  	if(boolean) { boolean이 true일떄 실행 }
		 *  	else { boolean이 true가 아닐때 실행 }
		 * boolean의 값이 true인가 false인가에 따라
		 * 명령문을 선택적으로 실행할 수 있다
		 */
		if(bEven) {
			System.out.println(intNum1 + "는 짝수");
		} else {
			System.out.println(intNum1 + "는 짝수가 아니다");
		}
		
		//연산식으로 if 명령문 실행
		//연산 결과가 true 또는 false인 경우
		if( (intNum1 % 3) == 0) {
			System.out.println(intNum1 + "는 3의 배수");
		} else {
			System.out.println(intNum1 + "는 3의 배수가 아니다");
		}
		
		if( (intNum1 % 4) == 0) {
			System.out.println(intNum1 + "는 4의 배수");
		} else if( (intNum1 % 3) == 0) {
			System.out.println(intNum1 + "는 4의 배수가 아니다");
			System.out.println("하지만 3의 배수이다");
		} else if( (intNum1 % 2) == 0) {
			System.out.println(intNum1 + "는 4의 배수 아님");
			System.out.println("3의 배수도 아님");
			System.out.println("그런데 2의 배수인것 같음");
		}

	}

}
