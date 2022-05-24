package com.callor.app.exec;

import com.callor.utils.Line;

public class Exec07 {
	public static void main(String[] args) {
		int num = 7;
		int index = 0;
		System.out.println(Line.dLine(50));
		System.out.println("7 단 구구단");
		System.out.println(Line.sLine(50));
		for (index = 1; index < 10; index++) {
			System.out.printf("%d × %d = %d\n", num, index, num * index);
		}
		System.out.println(Line.dLine(50));
	}
}
