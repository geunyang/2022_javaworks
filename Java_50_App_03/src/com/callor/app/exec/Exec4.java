package com.callor.app.exec;

public class Exec4 {

	/*
	 * 1 ~100 까지 임의의 수를 생성하고 num에 담긴 값이 소수인 코드를 작성
	 */
	public static void main(String[] args) {

		int num = (int) (Math.random() * 100) + 1;

		// 소수를 판별할 논리형 변수
		boolean bPrime = false;

		// 1은 소수도 합성수도 아니므로 i는 2부터 시작한다.
		// 2의 경우 반복문이 실행되지 않으므로 defalt값으로 실행된다.
		for (int i = 2; i < num; i++) {
			// 1과 num 자신 외에 나누어지는 수가 있는지 검사할 조건문
			if (num % i == 0) {
				// 나누어지는 수가 있을 경우 isPrime의 값을 true로 바꾼다.
				bPrime = true;
				// 한 번이라도 이 조건문이 실행될 경우 num은 소수가 아니므로 반복문을 빠져나온다.
				break;
			}
		}

		// 위 조건문의 결과에 따라 아래의 조건문을 실행한다.
		if (bPrime) {
			System.out.println(num + "은(는) 소수가 아닙니다.");
		} else {
			System.out.println(num + "은(는) 소수입니다.");
		}

	}

}
