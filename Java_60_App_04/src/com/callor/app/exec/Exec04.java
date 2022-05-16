package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.BookVO;

public class Exec04 {
	public static void main(String[] args) {
		List<BookVO> bookList = new ArrayList<>();
		BookVO bookVO = new BookVO();
		for(int i = 0; i < 10; i ++) {
			String title = ((int)(Math.random() * 1000) +100) +"";
			bookVO.setTitle(title);

			// 같은 bookVO 를 list 에 10번추가하기
			// 모든 list 주소가 동일한상태
			// 가장 마지막에 저장한 값으로 모두 통일 되어버림
			bookList.add(bookVO);
		}
		for(BookVO vo : bookList) {
			System.out.println(vo.toString());
		}
		bookList = new ArrayList<>();
		for(int i = 0; i < 10; i ++) {
			// bookVO 를 10번 다시 생성
			// title에 setting
			// List 에 추가
			BookVO bookVO1 = new BookVO();
			String title = ((int)(Math.random() * 1000) +100) +"";
			bookVO1.setTitle(title);
			bookList.add(bookVO1);
		}
		for(BookVO vo : bookList) {
			System.out.println(vo.toString());
		}
	}

}
