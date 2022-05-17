package com.callor.app.exec;

import com.callor.app.model.AddressVO;
import com.callor.app.service.AddrServiceV1;

public class AddrEx02 {
	
	public static void main(String[] args) {
		
		
		AddressVO hong = AddressVO.builder()
							.name("홍길동")
							.tel("010-1111-1111")
							.addr("서울특별시")
							.build();
		AddrServiceV1 addService = new AddrServiceV1();
		/*
		 * printAddr() method 는 AddressVO type의 매개변수를 갖고 있다
		 * 특별히 return type이 없다= void
		 */
		addService.printAddr(hong);
	}

}
