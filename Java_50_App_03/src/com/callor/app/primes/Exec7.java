package com.callor.app.primes;

public class Exec7 {

	public static void main(String[] args) {
		int count = 0;
		int[] intNums = new int[100];
		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = (int) (Math.random() * 100) + 2;
		}
		for (int i = 0; i < intNums.length; i++) {
			
			boolean bPrime = true;
			for (int j = 2; j * j < intNums.length; j++) {
				if (intNums[i] % j == 0)
					bPrime = false;
			}
			if (bPrime)
				count++;
			System.out.println(intNums[i]);
		}
		System.out.println("소수의 개수 : " + count);

	}
}

