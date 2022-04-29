package com.callor.app;

public class Exec11 {
	public static void main(String[] args) {
		int num = (int)(Math.random() * 25) +25;
		int pizza = 6;
		/*
		 * 피자가 한판에 6조각
		 * 피자를 부족하지 않도록 먹기 위해서
		 * 최소 몇판의 피자가 필요한가
		 * 인원수/ 피자로 나누었을때 그 결과가 0이거나 최소 1 이상 이어야한다.
		 */
		
		if(num % pizza == 0) {
			System.out.printf("인원 %d 명은 %d 판의 피자가 필요", num, num/pizza);			
		} else {
			int pan = (num/pizza) +1;
			System.out.printf("인원 %d 명은 %d 판의 피자가 필요", num, pan);
		}
	}

}
