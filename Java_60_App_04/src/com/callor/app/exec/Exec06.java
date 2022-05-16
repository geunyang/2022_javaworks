package com.callor.app.exec;

public class Exec06 {
	public static void main(String[] args) {
		int[] nums = new int[100];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 91) + 10;
		}
		/*
		 * 배열 100개에 대하여 반복하면서 각 요소값에 대하여 2부터 요소값까지 반복하면서 index 와 나머지 연산을 하여 0나오면 break
		 * => 소수가 아니다 각 요소값이 소수이려면 index 와 나머지 연산에서 한번도 0이 나오지 않아야 한다 즉 if 조건이 한번도 true
		 * 가 아니며 break 가 실행되지 않아야한다 break 가 실행되지 않고 안쪽 for()가 완전 수행되면 어떤 일이 발생하는가를 보면 된다
		 * 
		 */
		for (int j = 0; j < nums.length; j++) {
			int index = 0;
			// nums[j] 값이 9 라고 했을떄
			// 2~8까지 반복 실행된다
			for (index = 2; index < nums[j]; index++) {
				// 9 % 2 는 나머지가 1, 9 % 3 은나머지가 0 이 된다
				// 9 % 3 이 0 이 되는 순간 break 를 만나서 for 가 중단
				if (nums[j] % index == 0) {
					break;
				}
			} // for(index) end
				// break 가 실행되면 여기로 탈출

			// break 를 만나지 않았을떄는
			// nums[j] 값과 index 값이 같다
			// index 값이 같거나 큰가 비교해본다
			// true 가 된다는 것은 break 를 만나지 않았다는 것이다
			if (nums[j] <= index) {
				System.out.println(nums[j] + "은(는) 소수 입니다.");
			} else {
				System.out.println(nums[j] + "은(는) 소수가 아닙니다.");
			}

		}// for(j) end
	}

}
