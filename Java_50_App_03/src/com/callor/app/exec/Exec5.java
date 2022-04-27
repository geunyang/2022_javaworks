package com.callor.app.exec;

public class Exec5 {
	public static void main(String[] args) {

		int num = (int) (Math.random() * 100) + 1;
		int a = 0;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				a++;
			}
		}
		if (a == 0) {
			System.out.println(num + "은(는) 소수이다");
		} else {
			System.out.println(num + "은(는) 소수가 아니다");
			System.out.println(a);
		}
	}

}
