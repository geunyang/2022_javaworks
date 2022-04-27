package com.callor.app.exec;

public class Exec7 {

	public static void main(String[] args) {

		int[] intNums = new int[100];
		int k = 0; // 배열에 1~100까지 입력값 제어 변수
		int i, j = 0; // 배열위치 i, 카운트 j
		int m; // 소수의 배수에 0을 입력할 제어변수

		for (i = 2; i < intNums.length; i++) {
			int num = (int) (Math.random() * 100) + 1;
			intNums[i] = num;
			{
				intNums[k] = k; // 배열의 인덱스번호와
			} // 입력값을 같게 하기 위해서

			for (i = 2; i < intNums.length; i++)
			{
				if (intNums[i] == 0) // 인덱스요소 값이 0이면
				{
					continue; // 다시 for 문으로
				} else // 인덱스 요소의 값이 0이 아니면
				{
					System.out.println("소수 : " + intNums[i]);
					j++; // 소수의 갯수 카운터

					m = i + i; // i=2 라면 인덱스의 2가 0이
					// 되면 안되기 때문에
					for (; m < intNums.length; m += i) {
						intNums[m] = 0; // 소수가 아닌 인덱스에 0을 저장
					}
				}
			}

			System.out.println("소수의 갯수 : " + j);

		}
	}
}
