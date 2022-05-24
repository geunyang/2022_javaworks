package com.callor.app.exec;

import com.callor.app.model.BookVO;

public class Exec05 {
	
	public static void main(String[] args) {
		
		BookVO[] bookVO = new BookVO[10];
		for (int i = 0; i < bookVO.length; i ++) {
			bookVO[i] = new BookVO();
		}
		
		int index = 2;
		bookVO[index] = new BookVO();
		bookVO[index].setTitle("java");
		bookVO[index].setComp("doul");
		
		System.out.println("도서명 : " + bookVO[index].getTitle());
		System.out.println("출판사 : " + bookVO[index].getComp());
	}

}
