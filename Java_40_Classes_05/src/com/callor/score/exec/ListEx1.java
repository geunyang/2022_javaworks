package com.callor.score.exec;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListEx1 {
	public static void main(String[] args) {

		List<Integer> nums1 = new ArrayList<Integer>();
		List<Float> nums2 = new LinkedList<Float>();

		// 3개의 요소를 갖는 List
		// 요소를 계속 추가 가능
		// get으로 읽어올수 있다
		nums1.add(10);
		nums1.add(20);
		nums1.add(30);

		int num0 = nums1.get(0);
		System.out.println(num0);

		System.out.println(nums1.get(1));
		System.out.println(nums1.get(2));
		// 3개의 데이터만 추가되어 있기 때문에
		// index 3번 요소의 값은 get 할 수 없다
		// System.out.println(nums1.get(3));

		for (int i = 0; i < nums1.size(); i++) {
			System.out.println(nums1.get(i));
		}
		// 위 코드에서 nums1.size()는 nums1의 요소 개수만큼 반복하여 호출 실행된다.
		// 이는 비효율적인 코드가 될 것이다
		// size 값을 for() 명령 시작 전에 변수에 담고 시작하자
		int nums1Len = nums1.size();
		for (int i = 0; i < nums1Len; i++) {
			Integer num = nums1.get(i);
			System.out.println(nums1.get(i));
		}

		for (Integer num : nums1) {
			System.out.println(num);
		}
	}

}
