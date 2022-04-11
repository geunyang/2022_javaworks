package com.callor.arrays.service;

public class ServiceV1 {
	
	public int scoreKorSum() {
		
		int intKor1 = (int)(Math.random() * 100) +1;		
		int intKor2 = (int)(Math.random() * 100) +1;		
		int intKor3 = (int)(Math.random() * 100) +1;		
		int intKor4 = (int)(Math.random() * 100) +1;		
		int intKor5 = (int)(Math.random() * 100) +1;
		
		int intKorSum = intKor1;
		intKorSum += intKor2;
		intKorSum += intKor3;
		intKorSum += intKor4;
		intKorSum += intKor5;
		
		return intKorSum;
	}

}
