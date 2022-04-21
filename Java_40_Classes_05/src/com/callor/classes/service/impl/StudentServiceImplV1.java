package com.callor.classes.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

import com.callor.classes.service.StudentService;
import com.callor.score.domain.StudentVO;

public class StudentServiceImplV1 implements StudentService {

	private StudentVO[] stVO;
	private String stFile;

//	private StudentServiceImplV1() {
//	}
	// 파일 이름을 쓰지 않고 argument로 받는 이유 중요
	public StudentServiceImplV1(String stFile, int length) {
		this.stFile = stFile;
		this.stVO = new StudentVO[length];
		for (int i = 0; i < this.stVO.length; i++) {
			this.stVO[i] = new StudentVO();
		}

	}

	@Override
	public void loadStudent() {
		
		// InputStream 인터페이스 역할
		// 모든 입력장치의 조상
		InputStream is = null;
		try {
			is = new FileInputStream(this.stFile);
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println(stFile + "파일을 찾을 수 없습니다.");
			return;
		}
		// 내용 유무 확인 후 없으면 멈춤
		Scanner scan = new Scanner(is);
		/*
		while(true) {
			boolean bYes = scan.hasNext();
			if(bYes == false) {
				break;
			}
			//true 일때만 실행
			String stLine = scan.nextLine();
			System.out.println(stLine);
		}
 		*/
		// 내용이 있으면 콘솔에 한줄씩 출력
		while(scan.hasNext()) {
			String stLine = scan.nextLine();
			System.out.println(stLine);
			
			String[] stInfos = stLine.split(":");
			System.out.println("학번:" + stInfos[0]);
			System.out.println("이름:" + stInfos[1]);
			System.out.println("학년:" + stInfos[2]);
			System.out.println("학과:" + stInfos[4]);
			System.out.println("주소:" + stInfos[5]);
			
			StudentVO stVO = new StudentVO();
			stVO.setStNum(stInfos[0]);
			stVO.setStName(stInfos[1]);
			stVO.setStGrade(stInfos[2]);
			stVO.setStDept(stInfos[4]);
			stVO.setStAddr(stInfos[5]);
			
		}
		

	}

	@Override
	public StudentVO[] getStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentVO findByNum(String stNum) {
		// TODO Auto-generated method stub
		return null;
	}

}
