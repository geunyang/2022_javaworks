package com.callor.app.exec;

import com.callor.app.model.AddressVO;
import com.callor.app.service.AddrServiceV1;

public class AddrEx02 {
	
	public static void main(String[] args) {
		
		AddressVO hong = AddressVO.builder()
								.Name("홍길동")
								.Addr("서울")
								.build();
		AddrServiceV1 adService = new AddrServiceV1();
		adService.printAddr(hong);
	}

}
