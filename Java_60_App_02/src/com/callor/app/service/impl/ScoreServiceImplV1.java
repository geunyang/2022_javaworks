package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;

public class ScoreServiceImplV1 implements ScoreService {
		
		protected final Scanner scan;
		protected final List<ScoreVO> scList;
		
		public ScoreServiceImplV1() {
			scList = new ArrayList<ScoreVO>();
			scan =  new Scanner(System.in);
		}
		

		@Override
		public void inputScore() {
			
			while(true) {
				// 학생이름 입력
				System.out.println("이름 입력(QUIT : 종료) >> ");
				String stName = scan.nextLine();
				// QUIT 입력하면 break;
				if(stName.equals("QUIT")) {
					break;
				}
				
				
				// 국어입력
				System.out.println("국어점수 >>");
				String strKor = scan.nextLine();
				Integer intKor = Integer.valueOf(strKor);
				// 영어입력
				System.out.println("영어점수 >>");
				String strEng = scan.nextLine();
				Integer intEng = Integer.valueOf(strEng);
				// 수학입력
				System.out.println("수학점수 >>");
				String strMath = scan.nextLine();
				Integer intMath = Integer.valueOf(strMath);
				
				// VO 생성
				ScoreVO scVO = new ScoreVO();
				// VO 에 Setting
				scVO.setStName(stName);
				scVO.setIntKor(intKor);
				scVO.setIntEng(intEng);
				scVO.setIntMath(intMath);
				
				// scList.add()
				scList.add(scVO);
			} // end while
			System.out.println("입력이 중단되었습니다.");
			
			
		}

		@Override
		public void saveScore() {
			
			
		}

}
