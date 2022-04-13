package com.callor.arrays.service;

import com.callor.arrays.utils.Line;

/*
 * makeScore()
 * printScore()
 * sumScore()
 * 등의 method를 선언하고
 * 
 * 임의의 성적을 생성하여 intKor에 저장
 * 성적 일람표 출력
 * 
 */
public class ScoreServiceV5 {

	private int[] intKor;

	public ScoreServiceV5 () {
		intKor = new int[100];
	}

	public void makeScore() {
		for (int i = 0; i < intKor.length; i++) {
			intKor[i] = (int) (Math.random() * 100) + 1;
		}
	}

	public void printScore() {
		
		System.out.println(Line.dLine(80));
		System.out.println("국어 성적 일람표");
		System.out.println(Line.sLine(80));
				
		for (int i = 0; i < intKor.length; i++) {
			System.out.printf("%d : %d\t\t", (i + 1), intKor[i]);
			if ((i + 1) % 5 == 0) {
				System.out.println();
			}
		}
		System.out.println(Line.dLine(80));
	}

	public void sumScore() {
		
		System.out.println(Line.dLine(80));
		
		int intSum = 0;
		for (int i = 0; i < intKor.length; i++) {
			intSum += intKor[i];
		}
		System.out.println("국어 점수 합계 : " + intSum);
		System.out.println(Line.dLine(80));
	}

}
