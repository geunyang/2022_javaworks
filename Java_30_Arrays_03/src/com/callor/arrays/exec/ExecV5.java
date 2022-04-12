package com.callor.arrays.exec;

public class ExecV5 {
	public static void main(String[] args) {
		int intSum = 0;
		for(int i = 0 ; i <100 ; i++) {
			intSum += (i + 1);
		}
		System.out.println("짝수의 합계" +intSum);
	}
}
