package com.callor.todo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TodoVO {
	
	// id
	private String tKey;
	// todo
	private String tContent;
	// 등록일
	private String sDate;
	// 등록 시간
	private String sTime;
	
	// 완료 일자
	private String eDate;
	// 완료 시간
	private String eTime;
	
	// 완료 여부(true, false)
	private boolean bComp;
	
	@Override
	public String toString() {
		String result = String.format("%s\t", tKey);
		result += String.format("%s\t", sDate);
		result += String.format("%s\t", sTime);
		
		// 상황연산자
		// eDate 의 값이 없으면 진행중 그렇지 않으면 완료 표시
		// eDate == null 이 true 이면 "진행중"을 compStr 에 저장
		// 그렇지 않으면 "완료" 를 compStr에 저장
		// 값이 null 이거나 "" 이면
		//String compStr = eDate.isEmpty() ? "진행중" : "완료";
		String compStr = eDate == null || eDate.isEmpty() ? "진행중" : "완료";
	
		// 아래의 if 문을 간소화 한 명령문
		// if(eDate == null || eDate.isEmpty()) {
		// compStr = "진행중";
		//} else {
		//	compStr = "완료됨";
		//}
		result += String.format("%s\t", tContent);
		result += String.format("%s", compStr);
		return result;
	}

}
