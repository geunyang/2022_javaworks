package com.callor.app.controller;

import com.callor.app.service.ServiceV1;

public class ControllerV1 {

	public static void main(String[] args) {
		
		//ServiceV1 클래스의 method를 사용하기 위한 준비
		//ServiceV1 클래스의 인스턴스 생성
		//			1. 클래스를 사용하여 변수처럼 객체(object)를 선언하고
		//			2. new 키워드와
		//			3. 생성자 method를 사용하여
		//			4. 객체를 인스턴스화 시킨다
		ServiceV1 serviceV1 = new ServiceV1(); //ServiceV1() = 생성자(method)
		
		int intScoreSum = serviceV1.scoreSum();
		System.out.println("철수의 시험 총점: " + intScoreSum);
		
		
		// void type의 method는 항상 단독으로 호출한다.
		// 결과를 변수에 담을수 없다.
		serviceV1.scorePrint();
		
		/*
		 * scoreSum()은 return type int 형이다
		 * scoreSum() 과목의 총점을계산하여 결과를 return 하고 있다
		 * main() 에서는 scoreSum()을 호출하여 결과를 어딘가에 담아서
		 * 출력하는 일을 수행해야 하는데
		 * 아래의 코드는 결과(return)를 받아 수행하는 코드가 없다.
		 * 그래서 결과를 확인할수없다.
		 */
		serviceV1.scoreSum();
		
		// scoreSum()이 return 한 결과를
		// 어딘가의 기억장소에 저장하고 내용을 Console에 출력
		System.out.println( serviceV1.scoreSum() );
		
		// scorePrint()는 void type 이기 떄문에 println()에 포함하여 사용할 수 없다.
		// System.out.println( serviceV1.scorePrint() );
		
		
		
	}

}
