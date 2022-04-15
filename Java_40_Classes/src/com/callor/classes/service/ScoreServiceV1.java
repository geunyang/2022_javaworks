package com.callor.classes.service;

import java.util.Scanner;

import com.callor.classes.utils.Line;

public class ScoreServiceV1 {
	// 인스턴스변수
	/*
	 * 상속을 염두해두고 클래스를 선언할때는 인스턴스변수들을 protected로 선언한다
	 * 
	 * protected : private의 성질을 가지면서 상속받은 클래스에서 상속 받아 변수를 선언한것과 같은 효과를 낸다 인스턴스변수도
	 * 상속이 된다
	 */
	protected String[] students;
	protected int[] intKor;
	protected int lineLength;
	protected Scanner scan;

	public ScoreServiceV1() {
		this(10);
	}

	public ScoreServiceV1(int length) {
		students = new String[length];
		intKor = new int[length];
		lineLength = 50;
		scan = new Scanner(System.in);

	}

	public int input() {
		System.out.println(Line.dLine(lineLength));
		System.out.println("빛나라 고교 성적처리 v1");
		System.out.println(Line.sLine(lineLength));

		int index = 0;
		for (index = 0; index < students.length; index++) {
			int stNum = index + 1;
			System.out.printf("%d 번 학생 이름(END:중단) : ", stNum);
			// 키보드에서 문자열 입력받기
			String strName = scan.nextLine();
			// 이름 대신 END 문자열을 입력하면 입력 받기를 중단한다
			if (strName.equals("END")) {
				break;
			}
			// 학생 이름을 배열에 저장할때는 if() 다음에 위치해야한다
			// 만약 if() 위에 코드를 위치하면 중단 되기전에
			// students[index] 요소에 END 문자열이 먼저 저장 되기 때문에
			// 학생 이름에 END가 나타나게 된다
			// 즉 students[index] = END 가 실행되는 결과가 나온다
			students[index] =strName;
			
			System.out.printf("%d 번 국어점수 : >", stNum);
			//int intScore = scan.nextInt();
			//intKor[index] = intScore;
			
			String strScore = scan.nextLine();
			int intScore = 0;
			if(strScore.equals("")) {
				System.out.println("점수는 숫자만 가능");
			} else {
				intScore = Integer.valueOf(strScore);
			}
			intKor[index] = intScore;
			
		}
		return 0;
	}
	
	public void print() {
		for(int i = 0; i < students.length; i ++) {
			System.out.printf("%s\t", students[i]);
		}
		System.out.println();
		
	}

}
