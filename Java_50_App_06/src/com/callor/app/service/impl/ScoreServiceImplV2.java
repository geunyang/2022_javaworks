package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;
import com.callor.app.utils.Line;

// 이해안감 복습 ㄱ
public class ScoreServiceImplV2 implements ScoreService {
	
	// protected는 상속해주기 위해 설계된 클래스에서
	// 상속받은 클래스와 변수를 공유하기 위한 방법
	// 기본 속성은 private 와 같다
	protected final int stCount;
	protected final List<ScoreVO> scList;

	protected final int lineLength = 50;
	protected final String[] subs;

	public ScoreServiceImplV2() {
		scList = new ArrayList<>();
		stCount = 20;
		// 문자열 배열 만들고 생성자에서 선언
		subs = new String[] {"학번","국어","영어","수학","총점","평균"};
	}

	private int getScore() {
		int score = (int) (Math.random() * 50) + 51;
		return score;
	}

	@Override
	public void makeScore() {
		for (int i = 0; i < stCount; i++) {
			ScoreVO scVO = new ScoreVO();
			scVO.setIntStNum(i + 1);
			scVO.setIntKor(getScore());
			scVO.setIntEng(getScore());
			scVO.setIntMath(getScore());
			scList.add(scVO);

		}

	}

	@Override
	public void printScore() {

		System.out.println(Line.dLine(lineLength));
		System.out.println("한국 고교 성적 일람표");
		System.out.println(Line.sLine(lineLength));

		for (String sub : subs) {
			System.out.print(sub + "\t");
		}
		System.out.println();
		System.out.println(Line.sLine(lineLength));

		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		int sumTotal = 0;
		for (ScoreVO scVO : scList) {
			System.out.printf("%5d\t", scVO.getIntStNum());
			System.out.printf("%5d\t", scVO.getIntKor());
			System.out.printf("%5d\t", scVO.getIntEng());
			System.out.printf("%5d\t", scVO.getIntMath());
			System.out.printf("%5.2f\n", scVO.getfAvg());
			korTotal += scVO.getIntKor();
			engTotal += scVO.getIntEng();
			mathTotal += scVO.getIntMath();
			sumTotal += scVO.getIntSum();
		}
		System.out.println(Line.sLine(lineLength));
		System.out.printf("%2d\t", "총점");
		System.out.printf("%5d\t", korTotal);
		System.out.printf("%5d\t", engTotal);
		System.out.printf("%5d\t", mathTotal);
		System.out.printf("%5d\n", sumTotal);
		System.out.println(Line.dLine(lineLength));
	}

}
