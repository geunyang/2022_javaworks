package com.callor.app.service;

import java.util.List;

import com.callor.app.model.AddressVO;

public class AddrServiceV1 {
	
	public void printAddr(AddressVO vo) {
		System.out.println(vo.toString());
		
	}
	
	public void printAddrList(AddressVO[] addrs) {
		for(AddressVO vo : addrs)
		System.out.println(vo.toString());
	}
	
	public void printAddrList(List<AddressVO> addrs) {
		for(AddressVO vo : addrs)
		System.out.println(vo.toString());
	}

}
