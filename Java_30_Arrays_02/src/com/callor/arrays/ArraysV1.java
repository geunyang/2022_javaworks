package com.callor.arrays;

//ctrl+o
//import  ����ȭ (�ʿ��� Ŭ������ import �ʿ���� �׸��� ����)
public class ArraysV1 {
	
	public static void main(String[] args) {
		
		//������ �迭 intNums�� �����ϰ�, ���� 10���� Ȯ���϶�
		//������ �迭 10��¥�� intNums�� �����϶�
		//������ �迭 intNums���� ������ 10�� ���� �� �� �ִ� 
		//���� ������ �����ȴ�
		//intNums �迭�� 10���� ����Ҵ� 0���� clear �� ���·� ����
		int[] intNums = new int[10];
		
		//�迭 �� ��ҿ� �� �����ϱ�
		intNums[0] = 10;
		intNums[1] = 20;
		intNums[2] = 30;
		intNums[3] = 40;
		intNums[4] = 50;
		// intNums[5] ~ intNums[8] ������ 0���� clear�� ���¸� ����
		intNums[9] = 100;
		
		//�迭�� �� ����� ���� �� �б�
		
		System.out.println(intNums[3]);
		System.out.println(intNums[8]);
		
		int intSum = intNums[1];
		intSum += intNums[2];
		intSum += intNums[9];
		
		System.out.println(intSum);
		
		intNums[8] = intSum;
		intNums[7] = intNums[3] + intNums[2] + intNums[0];
		System.out.println(intNums[8]);
		System.out.println(intNums[7]);
		
		//intNums�� ����� ���� ���ڿ��� �ٲپ println�� �����ϰ� console�� ���
		System.out.println(intNums.toString());		
		
		/*
		 * print() method�� ()���� ������ type�� ���� �۵��ϴ� ����� �ٸ���
		 * 
		 * print(����) : ������ ����� ���� console�� ���
		 * print(����) : ������ ���� �����ϰ� ���� ����� console�� ���
		 * print( method() ) : method() �����ϰ� return�� ����� console�� ���
		 * 					��, method()�� void type�� ���� ������ ����
		 * 
		 * print( ��ü, �ν��Ͻ� ) : ��ü.toString(), �ν��Ͻ�.toString() �� ���� �����ϰ� return ���ڿ� ����� console�� ���
		 * print( �迭 ) : �迭.toString() �� ���� �����ϰ� return�� ������ �ּҸ� console�� ���
		 */
		System.out.println(intNums);
		
	}
	

}
