package com.callor.controller.op;

public class Operator_02 {

	public static void main(String[] args) {
		
		int intNum1 = 0;
		int intNum2 = 0;
		
		// intNum1 = intNum1 + 10;
		System.out.println(intNum1 += 10);
		
	
		System.out.println( (intNum1 += 10) > 10 );
		
		/*
		 * short-circuit Evaluation(SCE)
		 * (최적화된) 단축 평가 값
		 * 연산의 효율을 높이기 위해 불필요한 연산은 하지 않는다
		 * 이 명령이 수행되면 두개의 논리 연산식이 실행된다
		 * 두개의 논리 연산의 결과를 OR 연산하여 console에 출력한다
		 * 결과는 true 또는 false가 될것이다
		 * 
		 * 1. intNum1 + 10을 연산하고
		 * 2. 그 결과가 >20인지 검사한다. : 결과 true
		 * 3. true || ? 연산에서 좌우 값중 한개라도 true 이면
		 * 	결과는 당연히 true이다 즉 ?의 결과가 무엇이든
		 * 	앞의 결과가 true 이므로 최종 결과는 true이다
		 * 4. 따라서 이후의 연산은 실행하지 않는다
		 */
		System.out.println(
				((intNum1 += 10) > 20) ||
				((intNum2 += 10) > 10)
		);
		System.out.println(intNum1);
		System.out.println(intNum2);

		
		/*
		 * 1. intNum1 + 10 을 연산하고
		 * 2. 그 결과가 < 20인지 검사한다 : 결과 false
		 * 3. false && ? 연산에서 좌우 값중 한개라도 false 이면 결과는 false
		 * 	?의 결과와 상관없이 앞의 결과가 false이므로 최종결과는 false
		 * 4. 따라서 이후의 연산은 실행하지 않는다
		 */
		System.out.println(				
				((intNum1 += 10) < 20) &&
				((intNum2 += 10) < 100)
		);
	}

}
