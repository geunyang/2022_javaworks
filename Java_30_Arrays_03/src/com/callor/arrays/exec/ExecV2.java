package com.callor.arrays.exec;

public class ExecV2 {

	public static void main(String[] args) {

		int[] intNum = new int[100];
		int i = 0;
		// for () 명령문의 선언부에서 변수를 선언하면
		// for () {}이 끝날때 변수가 소멸된다
		// 같은 method 내에서 같은 이름의 변수를 계속 사용할 수 있다
		for (i = 0; i < intNum.length; i++) {
			intNum[i] = (int) (Math.random() * 100) + 1;
		}

		for (i = 0; i < intNum.length; i++) {
			boolean bEven = (intNum[i] % 2) == 0;
			System.out.print(intNum[i]);
			if(bEven) {
				System.out.println("는(은) 짝수이다.");
			} else {
				System.out.println("는(은) 짝수가 아니다.");
			}
		}

	}

}
