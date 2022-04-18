package com.callor.classes.controller;

import com.callor.classes.service.ScoreServiceV3;

public class ScoreControllerV3 {

	public static void main(String[] args) {
		
		ScoreServiceV3 scServiceV3 = new ScoreServiceV3();
		scServiceV3 = new ScoreServiceV3(20);
		
		//String[] strNames = new String[5];
		//strNames[0] = "홍길동";
		//strNames[1] = "홍길동";
		//strNames[2] = "홍길동";
		//strNames[3] = "홍길동";
		//strNames[4] = "홍길동";
		//strNames[5] = "홍길동";
		String[] strNames = {"홍길동","이몽룡","성춘향","임꺽정","장보고"};
		scServiceV3 = new ScoreServiceV3(strNames);

	}

}
