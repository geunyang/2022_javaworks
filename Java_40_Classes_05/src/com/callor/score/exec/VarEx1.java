package com.callor.score.exec;

import com.callor.classes.service.impl.ScoreServiceImplV1;
import com.callor.score.domain.StudentVO;

public class VarEx1 {
	public static void main(String[] args) {
		
		// 모두 초기화(생성)된 변수들
		// primitive(기본) type keyword : 소문자로 구성
		// primitive type 변수 선언
		int num1 = 100;
		float num2 = 100.3f;
		boolean bYes = true;
		
		// 첫글자가 대문자 = class type keyword
		// class type 변수 선언
		// (주소)참조형 변수 선언
		Integer intNem1 = 100;
		Float fNum2 = 100.3f;
		Boolean bYes1 = true;
		
		String str = "korea";
		StudentVO stVO = new StudentVO();
		// 배열형
		StudentVO[] stList = new StudentVO[10];
		// ScoreService 클래스 타입
		ScoreService scService = new ScoreServiceImplV1();
	}

}
