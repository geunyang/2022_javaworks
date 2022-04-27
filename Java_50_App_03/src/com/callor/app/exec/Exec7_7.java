package com.callor.app.exec;

public class Exec7_7 {

	public static void main(String[] args) {

		int[] intNums = new int[100];
		for (int i = 2; i < intNums.length; i++) {
			int num = (int) (Math.random() * 100) + 1;
			intNums[i] = num;
			intNums[i]++;
			System.out.println(intNums[i]);

			int a = 0;
			for (int j = 2; j < intNums.length; j++) {
				if (intNums[i] % j == 0) {
					a++;
				}
				int pCount = 0;
				if (a == 0) {
					pCount++;
				}
			}
		}

	}
}
