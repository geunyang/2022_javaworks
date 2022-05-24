package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.AddressVO;
import com.callor.app.service.AddrServiceV1;

public class AddrEx04 {
	
	public static void main(String[] args) {
		
		List<AddressVO> addrList = new ArrayList<>();
		
		AddressVO addrVO = new AddressVO();
		addrVO.setName("홍길동");
		addrVO.setTel("010-0000-0001");
		addrList.add(addrVO);
		
		addrVO = new AddressVO();
		addrVO.setName("이몽룡");
		addrVO.setTel("010-0000-0002");
		addrList.add(addrVO);
		
		addrVO = new AddressVO();
		addrVO.setName("성춘향");
		addrVO.setTel("010-0000-0003");
		addrList.add(addrVO);
		
		AddrServiceV1 adServiceV1 = new AddrServiceV1();
		adServiceV1.printAddrList(addrList);
	}

}
