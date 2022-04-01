package com.callor.method;

public class Method_02 {

	public static void main(String[] args) {
		/*
		 * 다음 코드가 오류 없이 실행 되도록 코드를 완성하시오
		 */
		/*
		 * 명령문 해석
		 * 1. num()를 실행하여 => num() 를 호출하여 실행하고
		 * 2. num()가 return 하는 데이터를 intNum변수에 저장하라
		 */
		int intNum1 = num();
		double douNum1 = doNum();
		long longNum1 = longNum();
		float fNum1 = floatNum();
		boolean nYes1 = bYes();
		String str = nation();
		
		
		System.out.println(intNum1);
		System.out.println(douNum1);
		System.out.println(longNum1);
		System.out.println(fNum1);
		System.out.println(nYes1);
		System.out.println(str);
		
		
		
		
		
	}
	
	public static int num() {
		return 10;
	}
	public static double doNum() {
		return 20.0;
	}
	public static long longNum() {
		return 1234567;
	}
	public static float floatNum() {
		return 30.0f;
	}
	public static boolean bYes() {
		return true;
	}
	public static String nation() {
		return "KOREA";
	}

}
