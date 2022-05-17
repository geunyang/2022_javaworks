package com.callor.app.service;

import java.util.List;

import com.callor.app.model.AddressVO;

public class AddrServiceV1 {
	
	// AddressVO type 의 매개변수 1개 받기
	public void printAddr(AddressVO vo) {
		
		System.out.println(vo.toString());
	}
	
	// 여기서부터 출력 안됨왜????????????
	// AddressVO 배열 type 의 매개변수 1개 받기
	// 배열의 개수만큼 AddressVO 가 전달된다
	public void printAddrList(AddressVO[] addrs) {
		
		for(AddressVO vo : addrs) {
			// 객체만 println 에 전달하면
			// 내부에서 vo.toString 을 호출하여 문자열을 받아 출력
			System.out.println(vo.toString());
		}
	}
	// 이쪽 하나도 모르겠음
	public void printAddrList(List<AddressVO> addrs) {
		// TODO Auto-generated method stub
		for(AddressVO vo : addrs) {
			System.out.println(vo.toString());
		}
		int size = addrs.size();
		for(int i = 0; i < size; i ++) {
			System.out.println(addrs.get(i));
			
		}
		for(int i = 0; i < size; i ++) {
			AddressVO adVO = addrs.get(i);
			System.out.println(adVO);
		}
	}
}