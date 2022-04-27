package com.callor.app.exec;

public class Exec5_5 {
	
	public static void main(String[] args) {
		
		int num = (int)(Math.random() * 100) + 1;
		int iFlag = 0;
		
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				iFlag ++;
			}
		}
	if (iFlag == 0) {
		System.out.println(num + "는 소수");
	} else {
		System.out.println(num + "는 소수가 아님");
	}
	// 안전한 조건검사
	if(iFlag>0) {
		System.out.println(num + "는 소수가 아님");
	} else {
		System.out.println(num + "는 소수");
		
	}
	}

}
