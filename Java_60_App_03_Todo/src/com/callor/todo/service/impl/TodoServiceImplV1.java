package com.callor.todo.service.impl;

import java.sql.SQLTimeoutException;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.callor.todo.model.TodoVO;
import com.callor.todo.service.TodoService;

public class TodoServiceImplV1 implements TodoService {
	
	private final List<TodoVO> todoList;
	
	public TodoServiceImplV1() {
		todoList = new ArrayList<>();
	}
	
	/*
	 * 매개변수로 content(할일) 내용을 전달받아
	 * Key, 추가 날짜, 시간을 생성한 후 TodoVO에 담고
	 * todoList 에 추가하기
	 * 
	 * java 에서 날짜(시간)을 취급하는 방법이 여러가지가 있다
	 * 1.7 이전에는 Date, Calendar 클래스를 사용
	 * 1.8 이후에는 LocalDate, LocalTime, LocalDateTime 이라는
	 * 클래스는 사용하여 날짜와 시간을 취급
	 */

	@Override
	public void todoInsert(String content) {
		// TODO Auto-generated method stub
		// 컴퓨터의 현재 날짜 시각을 읽어오기
		// java 1.8 에서는 Date 클래스의 생성자에
		// System.currentTimeMillis() method를 주입해주어야한다
		Date curDate = new Date(System.currentTimeMillis());
		
		// Date 객체의 값을 날짜, 시각 문자열 타입으로 변경하기 위한
		// 객체 생성
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
		
		// 커런트데이트 전달하고 SimpleDateFormat("yyyy-MM-dd")대로 만들어 today에 저장
		// 현재 날짜, 시각에 해당하는 문자열 생성하기
		// SimpleDateFormat 에 의해 패턴대로 날짜 시각 문자열을 만든다
		String today = dateFormat.format(curDate);
		String time = timeFormat.format(curDate);
		
		/* 
		 * Data 관련하여 사용되는 key, ID 값
		 * Data 의 무결성을 보장하기 위하여 모든 데이터(레코드단위, row 단위)는
		 * 데이터를 유일하게 식별(구별) 할 수 있는 데이터를 가지고 있어야 한다
		 * 각 언어, DBMS 등에서는 고유의 방법으로 ID를 만들고 관리한다
		 * 
		 * java 에서는 java.util.UUID 클래스를 사용하여
		 * 범우주적으로 유일한 ID 값을 생성하는 도구를 제공한다
		 * 
		 */
		UUID uuid = UUID.randomUUID();
		String idStr = uuid.toString();
		
		TodoVO tVO = TodoVO.builder().tKey(idStr).sDate(today).tContent(content).sTime(time).build();
		todoList.add(tVO); 
		
	}

	@Override
	public List<TodoVO> todoSelectAll() {
		return todoList;
	}

	@Override
	public void findByKey(String key) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(TodoVO tVO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveTodo(String fileName) {
		// TODO Auto-generated method stub
		
	}
	/*
	 * todo 완료하기 숙제
	 * 매개변수로 전달받은 num 값은 List 요소의 실제 값보다 1 만큼 크다
	 * num 값이 4 라면 실제로는 3번 요소를 선택한 것이다
	 * 선택한 요소의 edate, etime 부분을 현재 시스템의 날짜와 시간을 사용하여문자열로 바꾼다음
	 * setting
	 */
	@Override
	public void compTodo(Integer num) {
		Date curDate = new Date(System.currentTimeMillis());
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
		
		String today = dateFormat.format(curDate);
		String time = timeFormat.format(curDate);
		
		TodoVO tVO = TodoVO.builder().tKey().eDate(today).tContent(content).eTime(time).build();
		todoList.add(tVO); 
		
	}
	
	

}