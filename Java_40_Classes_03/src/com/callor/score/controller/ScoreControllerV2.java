package com.callor.score.controller;

import com.callor.score.service.ScoreServiceV2;

public class ScoreControllerV2 {

	public static void main(String[] args) {
		
		String[] stNames = {"홍길동","이몽룡","성춘향","임꺽정","장영자"};
		ScoreServiceV2 scServiceV2 = new ScoreServiceV2(stNames);
		scServiceV2.makeScore();
		scServiceV2.printScore();
		

		
	}

}
