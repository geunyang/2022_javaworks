package com.callor.app.pesistance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.callor.app.dbconfig.DBConnection;
import com.callor.app.dbconfig.DBContract;
import com.callor.app.model.StudentVO;

public class StudentDao {
	
	private final Connection dbConn; 
	public StudentDao() {
		dbConn = DBConnection.getDConnection();
	}
	/*
	 * Exception을 처리하는 두가지방법
	 * 1. Exception이 발생할 만한 코드 try-catch 로 묶어주기
	 * 2. Exception을 나를 호출한 곳으로 던지기
	 * 
	 * Service 에서 다음과 같이 selecAll()을 호출할 것이다
	 * List<StudentVO> stList = dao.selectAll();
	 * dao.selectAll() 에서 Exception이 발생하면
	 * dao.selectAll() 에서 Exception 을 직접 처리(핸들링) 하지 않고
	 * service 로 Exception 던지기(전달) 하여 Exception을 모아서 처리하기
	 * 
	 */
	public List<StudentVO> selectAll() throws SQLException {

		PreparedStatement pStr = null;
		String sql = DBContract.ST_SELECT;
		// 문자열로 되어있는 sql 문을 db에 보낼 수 있도록 가공
		pStr = dbConn.prepareStatement(sql);
		//셀렉트결과 담기
		ResultSet rSet = pStr.executeQuery();
		
		return getResult(rSet); // SQLException로 exception토스
	}
													//rSet에 exception 토스
	//resultset 결과로 리스트 만들기
	private List<StudentVO> getResult(ResultSet rSet) throws SQLException {
		List<StudentVO> stList = new ArrayList<>();
		while (rSet.next()) {
			
			StudentVO stVO = StudentVO.builder()
					// rSet에서 데이터 꺼내다가 각각의 요소에 담기
					.stNum(rSet.getString(DBContract.ST_COL.ST_NUM))
					.stName(rSet.getString(DBContract.ST_COL.ST_NAME))
					.stDept(rSet.getString(DBContract.ST_COL.ST_DEPT))
					.stGrade(rSet.getInt(DBContract.ST_COL.ST_GRADE))
					.stAddr(rSet.getString(DBContract.ST_COL.ST_ADDR))
					.stTel(rSet.getString(DBContract.ST_COL.ST_TEL))
					.build();
					
			stList.add(stVO);
		}
		
		return stList;
	}

}
