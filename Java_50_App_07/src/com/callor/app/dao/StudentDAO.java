package com.callor.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.callor.app.dbconfig.DBConnetion;
import com.callor.app.model.StudentVO;

public class StudentDAO {

	private final Connection dbConn;

	public StudentDAO() {
		dbConn = DBConnetion.getDBConnection();

	}

	public List<StudentVO> selectAll() throws SQLException {
		
		String sql = " SELECT * FROM tbl_student ";
		PreparedStatement pStr = null;
		pStr =dbConn.prepareStatement(sql);
		ResultSet rSet = pStr.executeQuery();
		
		List<StudentVO> stList = new ArrayList<>();
		while (rSet.next()) {
			// 임의의 생성자에 필드 사용해 직접 값 채워넣음
/*			StudentVO stVO = new StudentVO(
					rSet.getString("st_num"),
					rSet.getString("st_name"),
					rSet.getString("st_tel"),
					rSet.getString("st_addr"),
					rSet.getString("st_dept"),
					rSet.getInt("st_grade")
					);*/
			// 기본 생성자를 호출하여 비어있는 VO를 만들고 
			// setter() 메서드를 사용하여 변수에 값 setting 하기
			StudentVO stVO = new StudentVO();
			stVO.setStNum(rSet.getString("st_num"));
			stVO.setStName(rSet.getString("st_name"));
			stVO.setStTel(rSet.getString("st_tel"));
			stVO.setStAddr(rSet.getString("st_addr"));
			stVO.setStDept(rSet.getString("st_dept"));
			stVO.setStGrade(rSet.getInt("st_grade"));
			
			StudentVO stVO2 = StudentVO.builder()
								.stNum(rSet.getString("st_num"))
								.stName(rSet.getString("st_name"))
								.stTel(rSet.getString("st_tel"))
								.build();
			
			
		}
		
		
	}

}
