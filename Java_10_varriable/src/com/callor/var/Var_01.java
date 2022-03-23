/**
 * Var_01.java 파일이 src/com/collor/var 폴더에 저장되어 있다 라느 ㄴ표식
 */

package com.callor.var;

// class 선언문, class prototype
public class Var_01 {
	
	// 여기서부터 실제 명령문 코드가 작성되는 곳
	public static void main(String[] args) {
		
		// 코드에서 사용하는 수의 체계
		// 정수, 실수
		// 정수형(int type), 실수형(float type)
		
		/*
		 * int : 정수형 데이터를 저장할 기억장소 예약요청
		 * num1 : 예약한 기억장소에 쉬운 num1이라는 이름 지정
		 * = 30 : 예약된 num1 기억장소에 30을 저장(할당)
		 * 
		 * 
		 * 정수형 변수 num1을 선언하고 정수 255 값으로 초기화 하라
		 * 정수형 변수 num2를 선언하고 정수 88 값으로 초기화 하라
		 * 
		 * 변수 : 내가 지정한 기억장소
		 * 이름 지정시 첫글자는 소문자
		 */
		int num1 = 255;
		int num2 = 88;
		
		
		System.out.println(num1 + num2);
		System.out.println(num1 * num2);
		System.out.println(num2 - num1);
		System.out.println(num2 / num1);
		
		
		
		System.out.println(40.0 / 30.0);
		
		// 정수형 변수 num3 를 선언"만" 하기
		int num3;
		// 정수형 변수 num4를 선언 "만" 하기
		int num4; // 기억장소 예약
		
		// 선언된 정수형 변수 num3에 정수 40을 대입하기
		// 대입, 할당, 저장
		num3 = 40;
		// 선언된 정수형 변수 num4에 정수 100을 대입하기
		num4 = 100;
		
		/*
		 * 선언만 된 변수에서는 값을 읽을 수 없다
		 * 반드시 앞에서 어떤 값이라도 저장, 할당을 
		 * 해야만 이후에 읽을 수 있다.
		 */
		System.out.println(num3 + num4);
		
		// 변수 값 지정 전 예상값이 숫자일 경우 0으로 초기화 해둔다
		int num5 = 0;
		System.out.println(num5);
		
		/**
		 * 변수 명명 규칙과 패턴
		 * 1. 첫글자는 무조건 소문자
		 * 2. 이후에는 대소문, 숫자, _ 조합 가능
		 * 3. 두개 이상의 단어 조합 권장
		 * 4. 두개 이상의 단어를 조합할때 두번째 단어부터 대문자 => camel case
		 * 5. 두개 이상의 단어를 조합할때 첫번째 단어는 변수의 type이 권장됨 => 헝가리언표기법
		 */
		int intNum1 = 0; //이름에 변수 타입명 조합시 탐색 용이
		
		/*
		 * 좋은 변수 이름 짓기
		 * 변수명이 길어지더라도 2개 이상의 단어를 조합
		 * 변수명만 보고 어떤 데이터가 담겨있는지 유추 가능하도록 지정
		 */
		int intStNum = 20220101;
		int intTelNum = 1000000000;
		int intStAge = 33;
		
		System.out.println(intTelNum + intStNum);
		
		
	}
}
