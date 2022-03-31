package com.callor.controller;

public class Boolean_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bYes = true;
		boolean bWhat = bYes;
		
		// bYes에 저장된 값이 false가 물어보는 연산이 실행되고
		// 그 결과가 bWhat에 저장된다
		bWhat = bYes == false;
		// bYes에 저장된 값이 true가 아니냐 라고 묻는 연산
		// 결과 false
		bWhat = bYes != true;
		
		// ! : Not 연산기호
		// boolean 형 데이터를 반전 시키는 연산
		// true가 담겨 있으면 false, false가 담겨있으면 true
		bWhat = !bYes; //false
		
		// !(Not연산자)를 사용하여 변수값을 true,false가 반복되도록 하는 명령문들
		bWhat = !bWhat; //true
		bWhat = !bWhat; //false
		
		

	}

}
