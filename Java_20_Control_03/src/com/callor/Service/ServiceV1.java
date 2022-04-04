package com.callor.Service;

public class ServiceV1 {
	/*
	 * add() 는 static으로 선언되었다
	 * add()는 코드가 run 되는 순간 add() 를
	 * 사용 가능한 상태가 된다
	 * static method는 클래스.method()와 같이 호출(실행)된다
	 */
	public static int add() {
		int intNum1 = (int)(Math.random() * 100) +1;
		int intNum2 = (int)(Math.random() * 100) +1;
		return intNum1 + intNum2;
	}
	public static int multi() {
		int intNum1 = (int)(Math.random() * 100) +1;
		int intNum2 = (int)(Math.random() * 100) +1;
		return intNum1 + intNum2;
	}
}
