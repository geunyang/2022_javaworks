package com.callor.var;
/**
 * 
 * 두개의 정수형 변수를 선언하고
 * 각각 55 33을 저장한 후
 * 변수를 활용하여 사칙연산을 수행하라
 *
 */
public class Var_01 {
	/*
	 * 1. 변수명은 키워드 등으로 사용불가
	 * 2. 같은 변수명은 한블럭({}) 내부에서 두번 이상 선언 불가
	 * 3. 변수명은 첫글자가 반드시 소문자
	 * 4. 두 단어 이상을 조합하여 의미있는 단어로 작성
	 */
	public static void main(String[] args) {
		// 변수 선언과 0으로 초기화(clear)
		int intNum01 = 0;
		int intNum02 = 0;
		
		intNum01 = 55;
		intNum02 = 33;
				
		System.out.println(intNum01 + intNum02);
		System.out.println(intNum01 - intNum02);
		System.out.println(intNum01 * intNum02);
		System.out.println(intNum01 / intNum02);

	}
}
