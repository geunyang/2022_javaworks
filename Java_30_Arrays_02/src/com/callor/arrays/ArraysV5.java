package com.callor.arrays;

public class ArraysV5 {

	public static void main(String[] args) {
		
		/*
		 * int index = 0; int[] intScore = new int[100]; for(index = 0 ; index <
		 * intScore.length ; index++) { intScore[index] = (int)(Math.random() * 100) +
		 * 1; } System.out.println();
		 */
		
		int[] intScore = new int[100];
		
		for(int i = 0; i < intScore.length; i++) {
			intScore[i] = (int)(Math.random() * 100) +1;
		}
		
		/*
		 * intScore �迭�� ��� ���� for()���� ����Ͽ�
		 * �� ��Һ��� ���ٷ� ����ϴٰ� 
		 * �ټ���° ��Ҹ� ����� �� Enter(new line println())�� �϶�
		 * i(index) ���� 5�� ���� �������� 0�� �ɶ� println()�� �����Ͽ� new line�� �ο��Ѵ�
		 * �׷��� i ���� 0���� �����Ѵ� 0 % 5 �� ����� 0�� �Ǿ� ó�� ��Ҹ� ������ �� new line�� �Ǿ� ������
		 * �׷��� i + 1�� ���� �����Ͽ� index % 5 �� ������ 1���� �����ϵ��� �Ѵ�
		 */
		for(int i = 0; i < intScore.length; i++) {
			System.out.print(intScore[i] + ",\t");
			if((i +1) % 5 == 0) {
				System.out.println();
			}
			
		}

	
		

	}

}
