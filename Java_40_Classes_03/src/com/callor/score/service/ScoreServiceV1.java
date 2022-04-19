package com.callor.score.service;

import com.callor.score.domain.ScoreV2VO;
import com.callor.score.utils.Line;

public class ScoreServiceV1 {

	private ScoreV2VO[] scores;

	public ScoreServiceV1() {
		this(10);
	}

	public ScoreServiceV1(int length) {

		scores = new ScoreV2VO[length];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = new ScoreV2VO();
		}
	}

	// 학생 이름 리스트를 배열로 받아서 초기화하기
	public ScoreServiceV1(String[] stNames) {

		int length = stNames.length;
		scores = new ScoreV2VO[length];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = new ScoreV2VO();
			scores[i].setStName(stNames[i]);
		}
	}

	public void makeScore() {

		for (int i = 0; i < scores.length; i++) {
			int intKor = (int) (Math.random() * 50) + 51;
			int intEng = (int) (Math.random() * 50) + 51;
			int intMath = (int) (Math.random() * 50) + 51;

			scores[i].setIntKor(intKor);
			scores[i].setIntEng(intEng);
			scores[i].setIntMath(intMath);
		}
	}

	public void printScore() {
		System.out.println(Line.dLine(50));
		System.out.println("빛나 고교 성적표");
		System.out.println(Line.sLine(50));
		System.out.println("이  름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(Line.sLine(50));

		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i].getStName() + "\t");
			System.out.print(scores[i].getIntKor() + "\t");
			System.out.print(scores[i].getIntEng() + "\t");
			System.out.print(scores[i].getIntMath() + "\t");
			System.out.print(scores[i].getIntSum() + "\t");
			System.out.printf("%3.2f\n", scores[i].getfAvg());
		}

		System.out.println(Line.sLine(50));

	}

	public void printAvg() {
		
		int intSumKor = 0;
		int intSumEng = 0;
		int intSumMath = 0;
		int intSum2 = 0;
		int intSumAvg = 0;

		for (int i = 0; i < scores.length; i++) {

			intSumKor += scores[i].getIntKor();
			intSumEng += scores[i].getIntEng();
			intSumMath += scores[i].getIntMath();
			intSum2 += scores[i].getIntSum();
			intSumAvg += scores[i].getfAvg();
		
		

			float favgKor = (float) intSumKor / (float) scores.length;
			float favgEng = (float) intSumEng / (float) scores.length;
			float favgMath = (float) intSumMath / (float) scores.length;
			float favgSum = (float) intSum2 / (float) scores.length;
			float favg = (float) intSumAvg / (float) scores.length;

			System.out.print("평 균 : ");
			System.out.printf("%3.2f\t", favgKor);
			System.out.printf("%3.2f\t", favgEng);
			System.out.printf("%3.2f\t", favgMath);
			System.out.printf("%3.2f\t", favgSum);
			System.out.printf("%3.2f\n", favg);

		}

	}

}
