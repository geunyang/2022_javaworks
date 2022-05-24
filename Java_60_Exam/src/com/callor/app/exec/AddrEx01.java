package com.callor.app.exec;

import com.callor.app.model.AddressVO;

public class AddrEx01 {
	public static void main(String[] args) {

		AddressVO hong = new AddressVO();
		AddressVO lee = new AddressVO();
		AddressVO sung = new AddressVO();
		
		hong.setName("홍길동");
		lee.setName("이몽룡");
		sung.setName("성춘향");
		
		hong.setTel("010-0000-0001");
		lee.setTel("010-0000-0002");
		sung.setTel("010-0000-0003");
		
		System.out.println(hong.toString());
		System.out.println(lee.toString());
		System.out.println(sung.toString());
		
	}

}
