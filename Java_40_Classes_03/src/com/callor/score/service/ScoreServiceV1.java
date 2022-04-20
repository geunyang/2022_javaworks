package com.callor.score.service;

import com.callor.score.domain.ScoreV2VO;
import com.callor.score.utils.Line;

public class ScoreServiceV1 {

	protected ScoreV2VO[] scores;

		public ScoreServiceV1() {
			this(10);
		}
		
		public ScoreServiceV1(int length) {
			
			scores = new ScoreV2VO[length];
			for (int i = 0; i < scores.length; i ++) {
				scores[i] = new ScoreV2VO();
			}
		}
		
		public ScoreServiceV1(String[] stNames) {
			
			int length = stNames.length;
			scores = new ScoreV2VO[length];
			for (int i = 0; i < scores.length; i++) {
				scores[i] = new ScoreV2VO();
				scores[i].setStName(stNames[i]);
			}
		}
		
		public void makeScore() {
			
			for(int i = 0; i < scores.length; i ++) {
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
			System.out.println("이   름\t국어\t영어\t수학\t총점\t평균");
			System.out.println(Line.sLine(50));
			
			for (int i = 0; i < scores.length; i ++) {
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
			
			int intKorSum = 0;
			int intEngSum = 0;
			int intMathSum = 0;
			int intSums = 0;
			float fAvgSum = 0;
			
			for(int i = 0; i < scores.length; i ++) {
				
				intKorSum += scores[i].getIntKor();
				intEngSum += scores[i].getIntEng();
				intMathSum += scores[i].getIntMath();
				intSums += scores[i].getIntSum();
				fAvgSum += scores[i].getfAvg();
				
				
			}
			float floatKorAvg = (float)intKorSum / (float)scores.length;
			float floatEngAvg = (float)intEngSum / (float)scores.length;
			float floatMathAvg = (float)intMathSum / (float)scores.length;
			float floatSumAvg = (float)intSums / (float)scores.length;
			float fAvgSumAvg = fAvgSum / (float)scores.length;
			
			System.out.print("평   균\t");
			System.out.print(floatKorAvg + "\t");
			System.out.print(floatEngAvg + "\t");
			System.out.print(floatMathAvg + "\t");
			System.out.print(floatSumAvg + "\t");
			System.out.print(fAvgSumAvg + "\n");
			System.out.println(Line.dLine(50));
		}
		

	}