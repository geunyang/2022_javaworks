package com.callor.app.exec;

/*
 * 정수형 배열 10개 선언하고
 * 1~100까지 임의의 정수를 생성하여 배열에 저장
 * 배열 리스트를 보여주고 
 * 배열에 저장된 정수들의 합을 구하여 console에 출력
 * 평균을 구하여 console에 출력
 */
public class Exec3 {
	public static void main(String[] args) {

		int[] nums = new int[10];
		int intSum = 0;
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 100) + 1;
		}
		for(int num : nums) {
			System.out.println(num);
		}
		for(int num : nums) {
			intSum += num;
		}
		System.out.println("합계 : " + intSum);

		float fAvg = (float) intSum /nums.length;
		System.out.println("평균 : " + fAvg);
		/*
		 * 총점을 구하는 연산이 없다면 평균을 구할때 먼저 총점을 구하고
		 * 계산된 총점으로 나누어 평균을 구하는 것이 좋다
		 * 
		 * 각 항목의 평균을 구하여 누적덧셈을 하는것은 연산 오차를 일으킬수있다
		 */
	}
}
