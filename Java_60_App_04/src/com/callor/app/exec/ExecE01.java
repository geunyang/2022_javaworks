package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

public class ExecE01 {
	
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		for(int i = 0; i < 100; i ++) {
			int num = (int)(Math.random() * 100) +1;
			nums.add(num);
		}
		int lastIndex = 0;
		int lastValue = 0;
		int size = nums.size() -1; // ???
		for(int i = 0; i < size; i ++) {
			int num = nums.get(i);
			if (num >= 55) {
				lastIndex = i;
				lastValue = num;
			}
		}
		System.out.printf("%d번째 값 %d", lastIndex, lastValue);
	}

}
