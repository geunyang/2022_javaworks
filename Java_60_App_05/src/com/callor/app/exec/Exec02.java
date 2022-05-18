package com.callor.app.exec;

import com.callor.app.model.AddressVO;

public class Exec02 {
	
	public static void main(String[] args) {
		
		AddressVO[] addrs = new AddressVO[3];
		addrs[0] = new AddressVO();
		addrs[0].setName("홍길동");
		addrs[0].setAge(30);
		
		addrs[1] = AddressVO.builder()
							.name("이몽룡")
							.age(20)
							.build();
		addrs[2] = AddressVO.builder()
							.name("성춘향")
							.age(16)
							.build();
		
		for(AddressVO aVO : addrs) {
			System.out.println(aVO.toString());
		}
		int size = addrs.length;
		// 임시변수선언, 배열일 경우엔 이 위치에 선언하는것이 유리
		// 주소가 계속 변경되어 메모리누수발생할수도 있음
		// for 반복문이 시작되기 전에 _tVO 선언하고
		// for 내부에서 반복적으로 값을 교환하는 코드를 사용하는 경우
		// type 형 변수의 생명주기 문제로 메모리 누수가 발생할 수 있다
		// _tVO 는 소모성 변수이므로 가장 내부에서 선언하고
		// 사용후 제거되도록 코드를 작성하는 것이 유리하다
		// _tVO = null;
		for(int i = 0; i < size; i ++) {
			for(int j = i + 1; j < size; j ++) {
				// 배열의 i 번째 요소인 aVO의 나이가 더 큰 값이면
				if(addrs[i].getAge() > addrs[j].getAge()) {
					// 배열의 i 요소를 _tVO에 임시저장
					// 배열의 i 번째 요소를 대피
					AddressVO _tVO = addrs[i];
					// i 번째 요소 위치에 j번째 요소값을 복사
					addrs[i] = addrs[j];
					// 대피해두었던 i번째 요소값을 j번째에 복사
					addrs[j] = _tVO;
					
				}
			}
		}

		
		
	}

}
