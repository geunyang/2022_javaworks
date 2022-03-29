package com.callor.var;

public class Var_02 {

	public static void main(String[] args) {
		
		double doNum1 = 0;
		double doNum2 = 0;
		
		doNum1 = Math.random() * 1000;
		doNum2 = Math.random() * 1000;
		
		double doSum = doNum1 + doNum2;
		double doDes = doNum1 - doNum2;
		double doMulti = doNum1 * doNum2;
		double doDiv = doNum1 / doNum2;
		
		/*
		 * printf()를 사용하여 3개 변수에 담긴 데이터를 console에 출력하기
		 * "%d+%d=%d form String을 사용하여 출력할 모양을 지정하고 각각 %d 위치에 표현할 데이터를 3개 나열했다
		 * 여기에 %d는 Decimal(10진수)을 표현하는 키 단어이다
		 * 그런데 doNum1... 변수는 double type이다
		 * double type 변수에 담긴 값을 %d로 표현하려면
		 * 내부에서 데이터 type 문제로 인한 중대한 문제가 발생한다
		 * %d는 정수만 표현할수 있는데 실수값을 표현하라고 했기 때문에 발생하는 문제 
		 */
		/* System.out.printf("%d + %d = %d\n",doNum1, doNum2, doSum); */
		/*
		 * printf를 사용하여 실수 데이터를 console에 출력하려면 %f를 사용하여 표현해야한다 
		 */
		System.out.printf("%f + %f = %f\n",doNum1, doNum2, doSum);
		
		// %.2f : 정수 부분은 모두 표현하고 소수점이하 2번째 자리까지 출력하라
		System.out.printf("%.2f + %.2f = %.2f\n",doNum1, doNum2, doSum);
		
		System.out.println("=====================================================================");
		System.out.printf("%.2f + %.2f = %.2f\n",doNum1, doNum2, doSum);
		System.out.printf("%.2f * %.2f = %.2f\n",doNum1, doNum2, doMulti);

		/*
		 * %8.2f : 전체 자릿수를 *개로 하고 소수점 이하 2번째 자리까지 표현
		 * 만약 데이터가 전체 자릿수 보다 작으면 남은 부분을 공백으로 표현
		 * 숫자를 오른쪽으로 정렬할때 사용하는 방법
		 * 8.2 : 정수자릿수 + 소수점(1) + 소수점이하 2자리를 모두 합한 갯수가 8개 라는 표현
		 * 전체 자릿수가 8개를 넘어가면 form이 약간 흐트러지는 경우도 있다
		 * 충분히 표현할 수 있는 자릿수로 만들기
		 */
		System.out.println("=====================================================================");
		System.out.printf("%.2f + %.2f = %8.2f\n",doNum1, doNum2, doSum);
		System.out.printf("%.2f * %.2f = %8.2f\n",doNum1, doNum2, doMulti);
		
		
	}

}
