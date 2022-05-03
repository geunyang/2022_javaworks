package com.callor.app.dbconfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	// 서버 접속 주소, 사용자 이름, 비번을 drivermanager에게 전달 및 연결요청
	private static Connection conn;
	static  {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "user2";
		String password = "12341234";
		
		try {
			conn = DriverManager.getConnection(url,username,password);
			System.out.println("DB Connection OK");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}// end static
	// db 연결 해주는
	public static Connection getDConnection() {
		return conn;
	}

}
