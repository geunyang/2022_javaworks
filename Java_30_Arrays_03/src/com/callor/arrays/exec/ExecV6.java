package com.callor.arrays.exec;

public class ExecV6 {
	public static void main(String[] args) {
		int[] intNums = new int[100];
		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = (int) (Math.random() * 100) + 1;
		}
		int intEvenCount = 0;
		System.out.println("==================================");
		System.out.println("Â¦¼ö ¸®½ºÆ®");
		System.out.println("----------------------------------");
		for (int i = 0; i < intNums.length; i++) {
			boolean bEven = (intNums[i] % 2) == 0;
			if (bEven) {
				System.out.print(intNums[i] + ",\t");
				intEvenCount++;
				if (intEvenCount % 5 == 0) {
					System.out.println();
				}

			}
		}
		System.out.println("==================================\n");
	}
}
