package com.callor.app.service;

import java.util.List;

import com.callor.app.domain.StudentVO;

public interface StudentService {
	
	public void loadStudent();
	// 전체 데이터 가져오기
	public List<StudentVO> getStudents();
	// 학번 데이터 가져오기
	public StudentVO findByNum(String stNum); 
	
	public List<StudentVO> findByStName(String stName);

}
