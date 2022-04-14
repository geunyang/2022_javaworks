package com.callor.arrays.service;

import java.util.Scanner;

import com.callor.arrays.utils.Line;

public class StudentServiceV1 {
	
	// 상속 해줄 준비
	// 클래스 변수의 접근 제한자를 protected로 변경
	protected String[] strStudents;
	protected Scanner scan;

	// 기본생성자
	// 클래스를 선언하면 자동으로 선언되는 생성자 method
	public StudentServiceV1() {
		// strStudents = new String[10];
		// scan = new Scanner(System.in);
		/*
		 * strStudents, scan 두개의 변수는 초기화가 되어야 하는데 생성자에 초기화 시키는 코드를 작성한다 하지만 현제 ServiceV1
		 * 클래스에는 두개의 생성자가 있다 그래서 기본 생성자에서는 임의생성자에게 정수 10을 전달하면서 strStudents 와 scan 두개의
		 * 변수를 초기화 하도록 toss 해 버린다
		 */
		this(10);
	}

	// 임의 생성자
	// 클래스 개발자가 필요에 의해 임의로 선언하는 생성자 method
	public StudentServiceV1(int length) {
		strStudents = new String[length];
		scan = new Scanner(System.in);
	}

	public int inputStudent() {
		System.out.println( Line.dLine(50));
		System.out.println("학생 이름 입력");
		System.out.println( Line.sLine(50));
		for (int i = 0; i < strStudents.length; i++) {

			System.out.printf("%d 번 학생이름 > ", i + 1);
			String strName = scan.nextLine();
			strStudents[i] = strName;

			this.printStudent();
			System.out.println( Line.sLine(50));
		}
		System.out.println("입력이 종료 되었습니다.");
		System.out.println( Line.dLine(50));
		return 0;
	}

	public void printStudent() {
		for (int i = 0; i < strStudents.length; i++) {
			boolean bYes = strStudents[i] == null;
			if (bYes) {
				break;
			}
			System.out.printf("** %s\t", strStudents[i]);
		}
		System.out.println();
	}

}
