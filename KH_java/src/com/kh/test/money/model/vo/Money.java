package com.kh.test.money.model.vo;

public class Money {
	public static final String UNIT="원";
	private int money;//변경
	
	public Money(int money) {
		this.money=money;
		
	}


	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	public static String getUnit() {
		return UNIT;
		
	}
	
	public void print() {
		System.out.println(money +UNIT+"이 있습니다.");
	}

}
