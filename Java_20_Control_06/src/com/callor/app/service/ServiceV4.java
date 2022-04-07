package com.callor.app.service;

public class ServiceV4 {
	/*
	 * 클래스 영역(scope)에서 변수 선언하기
	 * class scope에 선언된 변수는
	 * 현재 class의 모든 method에서 공통으로 공유할수 있다
	 */
	int intKor = 0;
	int intEng = 0;
	int intMath = 0;
	/* 
	 * 두 가지 일을 수행하는 method
	 * 1. class scope에 선언된 3개의 변수에 값을 저장하고
	 * 2. 3개의 변수 값을 합산하여 return 하기
	 * 
	 */
	public int scoreSum() {
		/*
		 * class scope에 선언된 변수에
		 * 1 ~ 100 까지의 정수를 생성하여 저장해 두기
		 * 여기에서 저장된 변수 값은 다른 method에서
		 * 값을 변경(저장) 하기 전에는 계속 유지 된다
		 * 		현재 프로젝트가 종료 될 때까지
		 * 여기에서 저장된 변수 값은 scorePrint()에서
		 * 		읽어서 출력하면 같은 값이 출력된다.
		 */
		intKor = (int)(Math.random() * 100) + 1;
		intEng = (int)(Math.random() * 100) + 1;
		intMath = (int)(Math.random() * 100) + 1;
		int intSum = intKor + intEng + intMath;
		return intSum;
		
	}
	
	public void scorePrint() {
		String dLine = "=";
		String sLine = new String("-");
		int intSum =scoreSum();

		
		System.out.println(dLine.repeat(50));
		System.out.println("철수의 성적표");
		System.out.println(sLine.repeat(50));
		System.out.println("국어 : \t" + intKor);
		System.out.println("영어 : \t" + intEng);
		System.out.println("수학 : \t" + intMath);
		System.out.println(sLine.repeat(50));

		System.out.println("총점 : \t" + intSum);
		System.out.println(dLine.repeat(50));
	}
	
}
