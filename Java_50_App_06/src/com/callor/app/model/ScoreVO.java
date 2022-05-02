package com.callor.app.model;
/*
 * 성적 처리를 하기 위해서 반드시 필요한 데이터
 * 		학번, 국어, 영어, 수학
 * 출력 결과를 보기 위해서 총점과 평균도 있는것이 좋다
 * 더 확장 하여 학생의 석차 항목도 있으면 좋다	
 * 
 * 추상화 : 필요한 데이터를 설계
 * private 변수 선언 : VO 클래스의 추상화 된 데이터를 저장할 변수들
 * private 변수에 접근하기 위하여 getter, setter method 선언
 * 저장된 데이터를 확인하기 위하여 toString() method 도 재정의
 * 
 * spring project 에서는 기본 생성자, 모든 필드를 포함한 임의 생성자를 만들지만
 * Console Project 에서는 생성자를 생략해도 된다 
 * 
 * 
 */
public class ScoreVO {
	
	private int intStNum;
	
	private int intKor;
	private int intEng;
	private int intMath;
	
	private int intSum;
	private float fAvg;
	 
	private int intRank;

	public int getIntStNum() {
		return intStNum;
	}

	public void setIntStNum(int intStNum) {
		this.intStNum = intStNum;
	}

	public int getIntKor() {
		return intKor;
	}

	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}

	public int getIntEng() {
		return intEng;
	}

	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}

	public int getIntMath() {
		return intMath;
	}

	public void setIntMath(int intMath) {
		this.intMath = intMath;
	}

	public int getIntSum() {
		// VO에서 미리 생성해서 return
		intSum = intKor + intEng + intMath;
		return intSum;
	}

	public void setIntSum(int intSum) {
		this.intSum = intSum;
	}

	public float getfAvg() {
		
		fAvg = (float) getIntSum() / 3;
		return fAvg;
	}

	public void setfAvg(float fAvg) {
		this.fAvg = fAvg;
	}

	public int getIntRank() {
		return intRank;
	}

	public void setIntRank(int intRank) {
		this.intRank = intRank;
	}
	
	/*
	 * toString() method 를 재정의하여
	 * 한 학생의 성적내용을 문자열로 만들어
	 * return 하도록 하였다 
	 */

	@Override
	public String toString() {
		
		String scStr = String.format("%5d\t", intKor);
		scStr += String.format("%5d\t", intEng);
		scStr += String.format("%5d\t", intMath);
		scStr += String.format("%5d\t", getIntSum());
		scStr += String.format("%5.2f\n", getfAvg());
		return scStr;
	}
	
	
	

}
