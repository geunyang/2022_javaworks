package com.callor.app.service;

import java.util.Scanner;

import com.callor.app.utils.LinePrint;

public class ServiceV5 {

		int intKor = 0;
		int intEng = 0;
		int intMath = 0;
		
		public int scoreSum() {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println( LinePrint.dLine );
			System.out.println("나라 고교 성적 처리 V1");
			System.out.println( LinePrint.sLine );
			System.out.println("다음 성적을 50 ~ 100점 범위에서 입력하세요");
			
			System.out.println("국어 > ");
			intKor = scanner.nextInt();

			System.out.println("영어 > ");
			intEng = scanner.nextInt();
			
			System.out.println("수학 > ");
			intMath = scanner.nextInt();
			
			int intSum = intKor + intEng + intMath;
			
			return intSum;
		} //end scoreSum
		
		public void scorePrint() {

			int intSum =scoreSum();

			
			System.out.println( LinePrint.dLine );
			System.out.println("철수의 성적표");
			System.out.println( LinePrint.sLine );
			System.out.println("국어 : \t" + intKor);
			System.out.println("영어 : \t" + intEng);
			System.out.println("수학 : \t" + intMath);
			System.out.println( LinePrint.sLine );

			System.out.println("총점 : \t" + intSum);
			System.out.println( LinePrint.dLine );
		}
}
