package com.callor.score.controller;

import com.callor.score.service.ScoreServiceV3;

public class ScoreControllerV3 {

	public static void main(String[] args) {
		
		String[] stNames = {"홍길동","이몽룡","성춘향","임꺽정","장영자"};
		ScoreServiceV3 scServiceV3 = new ScoreServiceV3(stNames);
		scServiceV3.printScore();

	}

}
