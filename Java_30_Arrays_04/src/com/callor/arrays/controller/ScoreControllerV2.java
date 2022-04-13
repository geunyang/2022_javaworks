package com.callor.arrays.controller;

import com.callor.arrays.service.ScoreServiceV2;

public class ScoreControllerV2 {

	public static void main(String[] args) {
		
		ScoreServiceV2 scoreServiceV2 = new ScoreServiceV2();
		scoreServiceV2.makeScore();
		scoreServiceV2.printScore();
		

	}

}
