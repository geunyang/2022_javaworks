package com.callor.app.exec;

public class Exam1 {

	public static void main(String[] args) {
		int nums = 0;
		for (int i = 0; i < 10; i++) {
			nums = (int) (Math.random() * 100) + 1;
			if (nums % 2 == 0) {
				System.out.println(nums + "은(는) 짝수이다");
			} else {
				System.out.println(nums + "은(는) 짝수가 아니다");
			}
		}
	}
}
