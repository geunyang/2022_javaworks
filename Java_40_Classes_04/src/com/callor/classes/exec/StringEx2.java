package com.callor.classes.exec;

public class StringEx2 {

	public static void main(String[] args) {
		
		String strText = "KIM,90,80,77";
		String[] names = {"KIM","LEE","JOHN"};
		
		//배열변수를 선언하고 그 변수에 값을 담는다
		String[] items = strText.split(",");
		for(int i = 0; i < items.length; i ++) {
			System.out.println(items[i]);
		}

	}

}
