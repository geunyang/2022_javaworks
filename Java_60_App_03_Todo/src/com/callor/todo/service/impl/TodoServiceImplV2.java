package com.callor.todo.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.callor.todo.model.TodoVO;

public class TodoServiceImplV2 extends TodoServiceImplV1 {
	
	public TodoServiceImplV2() {
		super();
		loadTodoList();
	}
	/*
	 * 저장된 todolist.txt 파일을 읽어서
	 * V1 : saveFileName 에 저장되어 있다
	 * todoList 에 추가하기
	 * 
	 * todolist.txt 파일열기
	 * 한 라인씩 읽어서
	 * , 기준으로 split 하고
	 * todoVO에 담고
	 * todoList에 추가
	 * 		V1의 todoList 객체가 생성되어있다
	 */

	
	protected void loadTodoList() {
		// InputStream 을 생성하고
		// Scanner에 연결
		FileInputStream is = null;
		Scanner scan = null;
		try {
			is = new FileInputStream(saveFileName);
			
		} catch (FileNotFoundException e) {
			System.out.println(saveFileName + "파일을 찾을수 없습니다");
			return;
		}
		scan = new Scanner(is);
		
		int T_KEY = 0;
		int T_SDATE = 1;
		int T_STIME = 2;
		int T_EDATE = 3;
		int T_ETIME = 4;
		int T_CONTENT = 5;
		
		while(scan.hasNext()) {
			
			// 파일로 부터 한 라인을 읽어서 line 변수에 담기
			String line = scan.nextLine();
			
			// 읽어들인 line을 컴마, 를 기준으로 분해(split)
			// 분해한 결과는 String 형 배열 모양이다
			String[] todo = line.split(",");
			// 아래코드빨간불
			// if(todo.length < content) continue;
			// text 파일에 데이터를 저장하면 마지막에
			// 공백의 Line 이 추가되는 경우가 있다
			// 이때는 split 으로 분해한 배열의 개수가 부족하게 된다
			// 이러한 상황을 방지하기 위하여 아래 코드를 추가한다


		
			
			if(todo.length < T_CONTENT +1) continue;
			String eDate = todo[T_EDATE];
			String eTime = todo[T_ETIME];
			
			if(eDate.equalsIgnoreCase("null")) eDate= null;
			if(eTime.equalsIgnoreCase("null")) eTime= null;
			
			
			TodoVO tVO = TodoVO.builder().tKey(todo[T_KEY]).sDate(todo[T_SDATE]).sTime(todo[T_STIME]).eDate(eDate).eTime(eTime).tContent(todo[T_CONTENT]).build();
			todoList.add(tVO);

			
		}
		
		try {
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		scan.close();
	} // end loadtodo
	
	
	// 변경할 컨텐츠까지 같이 받아야
	@Override
	public void update(Integer num, String content) {
		
		int index = num -1;
		
		TodoVO tVO;
		try {
			tVO = todoList.get(index);
		} catch (Exception e) {
			System.out.println("선택한 항목이 리스트에 없습니다");
			return;
		}
		// 할일변경
		tVO.setTContent(content);
		// update 후에 변경한 내용을 강제로 자동저장
		try {
			// 원래는 saveTodo가 파일이름 매개변수로 받아야 하는데 파일이름을 공통 사용해서 대신 null 값 넘김
			this.saveTodo(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
