package com.callor.classes.utils;

public class Line {
	
	public static String dLine(int length) {
		//문자열변수 dLine을 선언하고 "=" 문자열을 저장한다
		String dLine = "=";
		//dLine에 저장된 문자열을 length 길이만큼 생성하고 return한다
		return dLine.repeat(length);
		
	}
	
	public static String sLine(int length) {
		
		return "-".repeat(length);
		
	}
	

}
