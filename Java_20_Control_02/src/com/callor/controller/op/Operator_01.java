package com.callor.controller.op;

public class Operator_01 {

	public static void main(String[] args) {
		
		/*
		 * 명령문(statement)
		 * java코드에서 명령문은 반드시 끝에 세미콜론(;)이 온다
		 * 명령문의 시작은 keyword와 변수만 올수있따
		 * keyword로 시작하는 명령문은 어떤 기능을 수행하는 경우이고
		 * 변수로 시작하는 경우는 연산자가 따라온다
		 * 변수의 바로 다음에 오는 연산자에는 
		 * 대입연산자(=), 단항연산자(++,--), 복합연산자(+=,*=,-+,/=,%=), 상항연산자 등이 있다
		 * 
		 */
		int intNum1 = 10;
		int intNum2 = 0;
		
		//대입연산자 : 리터럴 100을 변수 intNum2에 대입하라
		intNum2 = 100;
		
		System.out.println(intNum1);
		System.out.println(intNum2);
		
		//단항연산자 : 혼자 스스로 1을 증가시키고 그 결과를 intNum2에 저장하라
		intNum2++; // intNum2를 1 증가시켜라
		System.out.println(intNum2);
		
		//대입연산자
		intNum2 = ++intNum1; // intNum1을 1 증가시키고 결과를 intNum2에 저장
		System.out.println(intNum2);

		//대입연산자
		intNum1 = intNum1 + 10; // intNum1의 값을 10 증가시켜라
		intNum2 = intNum1; // intNum1에 저장된 값을 intNum2에 복사하라
		System.out.println(intNum2);
		
		//복합연산자(+=,*=,-=,/=)
		//먼저 앞의 변수 이름이 설정된 기억장치에서 값을 읽어온후
		//연산(여기서는 +10)을 실행하고
		//결과를 맨 앞의 변수에 저장하라
		intNum1 += 10; // intNum1의 값을 10증가시켜라
		intNum2 = intNum1;
		System.out.println(intNum2);
		
		/*
		 * 대입연산자가 변수 다음에 올 경우
		 * 
		 * 1. 무조건 오른쪽을 먼저
		 * 1-1. (intNum1 = intNum1 + 10)
		 * 1-2. intNum1 다음에 또 대입 연산자가 온다
		 * 1-3. 오른쪽
		 * 1-4. intNum1 + 10 연산 수행
		 * 
		 * 2. 1-4의 결과를 intNum1에 대입(저장)한다
		 * 3. intNum1에 저장된 값을 읽어서 intNum2에 저장한다
		 */
		intNum2 = intNum1 = intNum1 + 10;
		System.out.println(intNum2);
		
		/* 대입연산식이(intNum1 =intNum2 +10) 이
		 * 다른 명령문 내에 포함되는 경우
		 * 대입연산식을 따로 뗴어서 바라보자
		1 .intNum2 + 10을 연산하고
		2. 결과를 intNum1에 대입(저장)한다
		3. intNum1 저장된 값을 console에 출력하고
		4. intNum1의 값은 그대로 유지한다
		5. 이후의 코드에서 intNum1 값을 사용할 수 있다
		*/
		System.out.println(intNum1 = intNum2 + 10);
		System.out.println(intNum1 = intNum2 += 30);
		
		
	}

	public static int num() {
		return 0;
	}

}
