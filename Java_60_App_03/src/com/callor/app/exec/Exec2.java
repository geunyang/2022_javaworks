package com.callor.app.exec;

public class Exec2 {
	public static void main(String[] args) {
		// 누적연산
		int intSum = 0;
		int index;
		// index : 0 ~ 99 까지 계속해서 순서대로 변화됨
		for (index = 0; index < 100; index++) {
			// 변화되는 값이 모두 누적
			intSum += ( index + 1 );
		}
		System.out.println("1~100까지 정수의 덧셈 결과 : " + intSum);
	}

}
