package com.callor.app.model;

public class ScoreVO {
	
	private int stNum;
	private int scKor;
	private int scEng;
	private int scMath;
	private int scSum;
	private int scAvg;
	
	public int getStNum() {
		return stNum;
	}
	public void setStNum(int stNum) {
		this.stNum = stNum;
	}
	public int getScKor() {
		return scKor;
	}
	public void setScKor(int scKor) {
		this.scKor = scKor;
	}
	public int getScEng() {
		return scEng;
	}
	public void setScEng(int scEng) {
		this.scEng = scEng;
	}
	public int getScMath() {
		return scMath;
	}
	public void setScMath(int scMath) {
		this.scMath = scMath;
	}
	public int getScSum() {
		return scSum;
	}
	public void setScSum(int scSum) {
		this.scSum = scSum;
	}
	public int getScAvg() {
		return scAvg;
	}
	public void setScAvg(int scAvg) {
		this.scAvg = scAvg;
	}
	
	@Override
	public String toString() {
		return "ScoreVO [stNum=" + stNum + ", scKor=" + scKor + ", scEng=" + scEng + ", scMath=" + scMath + ", scSum="
				+ scSum + ", scAvg=" + scAvg + "]";
	}
	
	

}
