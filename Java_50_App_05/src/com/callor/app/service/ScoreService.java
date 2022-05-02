package com.callor.app.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.utils.Line;

public class ScoreService {

	private final List<ScoreVO> scList;

	public ScoreService() {
		List<ScoreVO> scs = new ArrayList<>();
		this.scList = scs;
	}

	public void makeScore() {
		for (int i = 0; i < 20; i++) {
			ScoreVO scVO = new ScoreVO();
			scVO.setStNum(i + 1);
			scVO.setScKor((int) (Math.random() * 50) + 50);
			scVO.setScEng((int) (Math.random() * 50) + 50);
			scVO.setScMath((int) (Math.random() * 50) + 50);
			scList.add(scVO);
		}

	}

	public void scorePrint() {
		System.out.println(Line.dLine(50));
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println(Line.sLine(50));

		int intSumKor = 0;
		int intSumEng = 0;
		int intSumMath = 0;
		int intSums = 0;

		for (ScoreVO vo : scList) {
			System.out.printf("%2d\t", vo.getStNum());
			System.out.printf("%3d\t", vo.getScKor());
			System.out.printf("%3d\t", vo.getScEng());
			System.out.printf("%3d\t", vo.getScMath());
			System.out.printf("%3d\t", vo.getScKor() + vo.getScEng() + vo.getScMath());
			System.out.printf("%3.2f\t", (float) (vo.getScKor() + vo.getScEng() + vo.getScMath()) / 3);
			System.out.println();
			
			intSumKor += vo.getScKor();
			intSumEng += vo.getScEng();
			intSumMath += vo.getScMath();
			intSums += vo.getScKor();
			intSums += vo.getScEng();
			intSums += vo.getScMath();

		}
		
		System.out.println(Line.sLine(50));
		System.out.printf("총점\t%4d\t%4d\t%4d\t%4d\n", intSumKor, intSumEng, intSumMath, intSums);
		System.out.println(Line.dLine(50));

	}

}