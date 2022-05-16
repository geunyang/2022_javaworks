package com.callor.app.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Exec08 {

	public static void main(String[] args) {
		String filename = "src/com/callor/app/exec/data.txt";
		
		// file 과 관련한 클래스는
		// 객체 선언문과 생성을 분리한다
		// try catch 때문에
		InputStream is = null;
		Scanner scan = null;
		
		try {
			is = new FileInputStream(filename);
			scan = new Scanner(is);
			while (scan.hasNext()) {
				String strLine = scan.nextLine();
				System.out.println(strLine);
			}
			scan.close();
			is.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
