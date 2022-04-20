package com.callor.classes.exec;

import java.io.InputStream;
import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		
		String fileName = "data.txt";
		InputStream is = ScannerEx2.class.getResourceAsStream(fileName);
		
		Scanner scan = new Scanner(is);
		while(true) {
			//데이터 파일에 읽을 내용이 있는가
			boolean bYes = scan.hasNext();
			//읽을 내용이 없으면 멈추기
			if(bYes == false) {
				break;
			}
			//읽어와서 console에 출력
			String strLine = scan.nextLine();
			System.out.println(strLine);
		}

	}

}
