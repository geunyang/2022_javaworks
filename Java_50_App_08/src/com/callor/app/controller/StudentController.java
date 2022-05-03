package com.callor.app.controller;

import java.sql.SQLException;
import java.util.List;

import com.callor.app.model.StudentVO;
import com.callor.app.pesistance.StudentDao;

public class StudentController {
	// 리스트에 받아서 출력
	public static void main(String[] args) {
		StudentDao stDao = new StudentDao();
		try {
			List<StudentVO> stList = stDao.selectAll();
			for (StudentVO stVO :stList) {
				System.out.println(stVO.toString());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
