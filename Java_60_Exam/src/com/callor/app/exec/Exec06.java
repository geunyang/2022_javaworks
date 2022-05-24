package com.callor.app.exec;

public class Exec06 {
	
	public static void main(String[] args) {
		int[] nums =  new int[10];
		for (int i = 0; i < nums.length; i ++) {
			nums[i] = (int) (Math.random() * 100) +1;
		}
		for (int j = 0; j < nums.length; j ++) {
			int index = 0;
			for (index = 2; index < nums[j]; index++) {
				if (nums[j] % index == 0) {
					break;
				}
			}
			if(nums[j] <= index) {
				System.out.println(nums[j] + "소수");
			} else {
				System.out.println(nums[j] + "소수가 아님");
			}
		}
	}

}
