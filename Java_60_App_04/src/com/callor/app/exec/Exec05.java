package com.callor.app.exec;

import com.callor.app.model.BookVO;

public class Exec05 {
	
	public static void main(String[] args) {
		// 객체(클래스를 사용한) 배열 10개 선언
		// 선언된 객체 배열은 아직 사용할 준비가 안된상태
		// 이때 getter, setter 를 호출하면 nullPointerException 발생
		BookVO[] bookVO = new BookVO[10];
		
		// 배열의 각 요소 초기화
		for(int i = 0; i < bookVO.length; i ++) {
			bookVO[i] = new BookVO();
		}
		int index = 2;
		bookVO[index] = new BookVO();// 배열을 선언했으면 초기화를 꼭 해주세요
		bookVO[index].setTitle("자바의 정석");
		bookVO[index].setComp("도울 출판사");
		System.out.println("도서명 : " + bookVO[index].getTitle());
		System.out.println("출판사 : " + bookVO[index].getComp());
	}

}
