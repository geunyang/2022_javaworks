package com.callor.controller;

/*
 *  com.callor.sevice.ServiceV1 클래스의
 *  
 */
		
import com.callor.Service.ServiceV1;

public class Method_03 {

	public static void main(String[] args) {
		//ServiceV1 클래스에 선언된 add() 를 호출하여
		//return 된 값을 intSum 변수에 저장
		int intSum = ServiceV1.add();
		int intMulti = ServiceV1.multi();
		
		System.out.println(intSum + intMulti);

	}

}
