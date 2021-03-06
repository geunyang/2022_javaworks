package com.callor.app.exec;

public class Exec2 {
	public static void main(String[] args) {
		
		// 배열에 값을 채워넣는 부분
		int[] nums = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 100) + 1;
		}
		// 연산하는 부분
		int count = 0; // 개수세기
		int intSum = 0; // 합계
		for (int num : nums) {
			if (num % 2 == 0) {
				count++;
				intSum += num;
			}
		}
		System.out.printf("짝수의 개수는 %d 이고 합계는 %d", count, intSum);
	}
}
