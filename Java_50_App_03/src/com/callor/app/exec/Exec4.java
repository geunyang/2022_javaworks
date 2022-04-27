package com.callor.app.exec;

public class Exec4 {

	/*
	 * 1 ~100 까지 임의의 수를 생성하고 num에 담긴 값이 소수인 코드를 작성
	 */
	public static void main(String[] args) {

		int num = (int) (Math.random() * 100) + 1;
		for (int i = 2; i < num; i++) {
			if (num%i == 0) {
				System.out.println(num + "소수가 아닙니다");
			} else {
				System.out.println(num + "소수 입니다.");
			}
			
		}

	}

}
