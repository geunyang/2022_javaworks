package com.callor.app;

import java.util.ArrayList;
import java.util.List;

public class GetValue {
	public List<Integer> getList(int length) {
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < length; i++) {
			int num = (int) (Math.random() * 100) + 1;
			list.add(num);
		}
		return list;
			
	}
	
	public static int[] getArray(int length) {
		int[] nums = new int[100];
		for (int i = 0; i < nums.length; i ++) {
			int num = (int) (Math.random() * 100) +1;
			nums[i] = num;
		}
		return nums;
	}

}
