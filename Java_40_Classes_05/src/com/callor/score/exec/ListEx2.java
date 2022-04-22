package com.callor.score.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.domain.StudentVO;

public class ListEx2 {

	public static void main(String[] args) {
		// StudentVO데이터만 List에 저장하겠다
		List<StudentVO> stList = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			StudentVO vo = new StudentVO();
			
			String strNum = String.format("%05d", i+1);
			
			int intNum = (int)(Math.random() * 100 ) + 1;
			int intGrade = (intNum % 4) +1; // 4로 나누고 + 1 = 1~4까지 학년 생성
			String strGrade = intGrade + "";
			vo.setStNum(strNum);
			vo.setStGrade(strGrade);
			stList.add(vo);
		}

	}

}
