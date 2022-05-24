package com.callor.app.exec;

import com.callor.app.model.AddressVO;
import com.callor.app.service.AddrServiceV1;

public class AddrEx03 {
	
	public static void main(String[] args) {
		
		AddressVO[] addrVO = new AddressVO[3];
		
		addrVO[0] = AddressVO.builder()
							.Name("홍길동")
							.Tel("010-0000-0001")
							.build();
		addrVO[1] = new AddressVO();
		addrVO[1].setName("이몽룡");
		addrVO[1].setTel("010-0000-0002");
		addrVO[2] = new AddressVO();
		addrVO[2].setName("성춘향");
		addrVO[2].setTel("010-0000-0003");
		AddrServiceV1 adService = new AddrServiceV1();
		adService.printAddrList(addrVO);
	}

}
