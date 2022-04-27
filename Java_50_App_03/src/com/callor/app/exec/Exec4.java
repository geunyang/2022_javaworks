package com.callor.app.exec;

public class Exec4 {

	/*
	 * 1 ~100 까지 임의의 수를 생성하고 그 수가 소수인지 판별
	 */
	public static void main(String[] args) {

		int num = (int) (Math.random() * 100) + 2;

		// 소수를 판별할 논리형 변수
		boolean pFlag = true;

		for (int i = 2; i < num; i++) {
			// 1과 num 자신 외에 나누어지는 수가 있는지 검사할 조건문
			if (num % i == 0) {
				pFlag= !pFlag;
				// 한 번이라도 이 조건문이 실행될 경우 num은 소수가 아니므로 반복문을 빠져나온다.
				break;
			}
		}
		/*
		 * 만약 num 값이 소수인 경우 for() 반복문이 모두 완료되고 종료된다
		 * 그러면 pFlag는 처음 설정한 값이 변함이 없기 때문에 true 이다
		 * 
		 * 만약 num 값이 소수가 아닌 경우 중간의 if() {} 코드가 실행되어
		 * pFlag 가 반전되고 (즉 false가 되고) 다음의 if 조건을 만족하지 않아
		 * else{} 코드가 실행된다
		 */

		// 위 조건문의 결과에 따라 아래의 조건문을 실행한다.
		if (pFlag) {
			System.out.println(num + "은(는) 소수 입니다.");
		} else {
			System.out.println(num + "은(는) 소수가 아닙니다.");
		}

	}

}
