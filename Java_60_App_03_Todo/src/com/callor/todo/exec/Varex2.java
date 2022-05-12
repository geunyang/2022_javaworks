package com.callor.todo.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.todo.model.TodoVO;
import com.callor.utils.Line;

public class Varex2 {

	public static void main(String[] args) {

		List<TodoVO> todoList = new ArrayList<>();
		/*
		 * Builder 패턴을 사용한 VO 객체 생성 클래스.builder() 메서드에 의해서 VO 객체가 선언되고 필드변수로 선언한 것과 같은
		 * 이름의 setter method를 사용하여 VO 객체의 각 변수값을 채워넣으면서 VO 객체를 생성하는것
		 */
		TodoVO tVO = TodoVO.builder().sDate("2022-05-12").tContent("과제하기").build();
		todoList.add(tVO);

		// 기본 생성자를 사용하여 객체 초기화 하고
		// setter method를 사용하여 각 변수 값을 저장하기

		tVO = new TodoVO();
		tVO.setSDate("2022-05-12");
		tVO.setTContent("목요일오후");
		todoList.add(tVO);

		// 필드 생성자를 사용하여 객체변수를 저장하면서 객체생성
		tVO = new TodoVO("001", "생성자", "2022-05-22", "09:00:00", "", "", false);
		todoList.add(tVO);
		for (TodoVO vo : todoList) {
			System.out.println(vo.toString());
		}
		// todoList의 0번째 요소를 getter 하면
		// 한개의 todoVO를 추출할 수 있다
		TodoVO todoVO = todoList.get(0);
		todoVO.setTKey("009");
		// type형 변수에서 꺼낸 변수는 리스트에 담겨있는 변수 아래의 코드가 필요없어짐
		todoList.set(0, todoVO);
		System.out.println(Line.dLine(50));
		for (TodoVO vo : todoList) {
			System.out.println(vo.toString());
		}
		// VO에 key값 setting
		todoList.get(1).setTKey("101");
		System.out.println(Line.dLine(50));
		for (TodoVO vo : todoList) {
			System.out.println(vo.toString());
		}

	}
}
