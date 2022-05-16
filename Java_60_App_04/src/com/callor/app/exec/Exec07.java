package com.callor.app.exec;

import com.callor.utils.Line;

public class Exec07 {

	public static void main(String[] args) {
		int num = 7;
		System.out.println(Line.dLine(50));
		System.out.println("7단 구구단");
		System.out.println(Line.sLine(50));
		for(int index = 1; index < 10; index ++) {
			int result = num * index;
		System.out.printf("%d × %d = %d\n", num, index , result );
		}
		System.out.println(Line.dLine(50));
	}

}
