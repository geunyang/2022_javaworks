package com.callor.arrays.exec;

public class ExecV2 {

	public static void main(String[] args) {

		int[] intNum = new int[100];
		int i = 0;
		// for () ��ɹ��� ����ο��� ������ �����ϸ�
		// for () {}�� ������ ������ �Ҹ�ȴ�
		// ���� method ������ ���� �̸��� ������ ��� ����� �� �ִ�
		for (i = 0; i < intNum.length; i++) {
			intNum[i] = (int) (Math.random() * 100) + 1;
		}

		for (i = 0; i < intNum.length; i++) {
			boolean bEven = (intNum[i] % 2) == 0;
			System.out.print(intNum[i]);
			if(bEven) {
				System.out.println("��(��) ¦���̴�.");
			} else {
				System.out.println("��(��) ¦���� �ƴϴ�.");
			}
		}

	}

}
