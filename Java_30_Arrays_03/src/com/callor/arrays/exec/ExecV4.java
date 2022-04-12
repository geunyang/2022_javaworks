package com.callor.arrays.exec;

public class ExecV4 {

	public static void main(String[] args) {

		int[] intNums = new int[100];
		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = (int) (Math.random() * 100) + 1;
			System.out.println(intNums[i]);
		}
		// Â¦¼öÀÎ ¼ö¸¦ µ¡¼ÀÇÒ º¯¼ö¸¦ ¼±¾ð
		int intEvenSum = 0;
		for (int i = 0; i < intNums.length; i++) {
			boolean bEven = (intNums[i] % 2) == 0;
			if (bEven) {
				//intEvenSum = intEvenSum + intNums[i];
				intEvenSum += intNums[i];
			}
		}
		System.out.println("Â¦¼öÀÇ ÇÕ°è : " + intEvenSum);

	}

}
