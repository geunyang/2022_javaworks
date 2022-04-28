package com.callor.app.exec;

public class Exec1 {
	public static void main(String[] args) {
		
		int[] nums = new int[100];
		for (int i = 0; i < nums.length; i ++) {
			int num = (int) (Math.random() * 100) +1;
			nums[i] = num;
		}
		int count =0;
		for (int i = 0; i < nums.length; i ++) {
			if(nums[i] > 54) {		
				System.out.println(nums[i]);
			}
		}
	}

}
 