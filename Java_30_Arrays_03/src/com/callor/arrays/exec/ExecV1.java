package com.callor.arrays.exec;

public class ExecV1 {

	public static void main(String[] args) {

		/*
		 * int intNums[] = new int[100]; for (int i = 0; i < intNums.length; i++) {
		 * intNums[i] = (int) (Math.random() * 100) + 1; } if (i % 2 == 0) {
		 * System.out.println(); }
		 * 
		 * }
		 */
		int intNum = 0;
		intNum = (int)(Math.random() * 100) +1;
		boolean bEven = false;
		
		// intNum ������ 2�� ���� �������� 0�ΰ�
		// intNum ������ ��� ���� 2�� ���� �������� 0�ΰ�
		// 0�̸� true�� bEven�� ����, �ƴϸ� false�� bEven�� ����
		bEven = (intNum % 2) == 0;
		
		if(bEven) {
			System.out.println(intNum + "��(��) ¦��");
		} else {
			System.out.println(intNum + "��(��) ¦���� �ƴ�");
		}
		
	}

}
