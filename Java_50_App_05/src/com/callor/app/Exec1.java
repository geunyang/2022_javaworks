package com.callor.app;

public class Exec1 {

	public static void main(String[] args) {
		// 25~50 무작위 값을 6으로 나눠서? 
		int nums = (int)(Math.random() * 25) +25;
		/*
		 * 피자가 한판에 6조각
		 * 피자를 부족하지 않도록 먹기 위해서
		 * 최소 몇판의 피자가 필요한가
		 * 인원수/ 피자로 나누었을때 그 결과가 0이거나 최소 1 이상 이어야한다.
		 */
		System.out.println(nums);
		//int nums = 49;
		if (nums % 6 == 0) {
			System.out.println(nums/6);
		} else {
			System.out.println(nums/6+1);
		}
		
		
		

	}

}
