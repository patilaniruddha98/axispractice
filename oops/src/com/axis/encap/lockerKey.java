package com.axis.encap;

public class lockerKey {

	public static void main(String[] args) {
		locker l = new locker();
		l.setMoney(1000);
		l.setGold("500 grams");
		System.out.println(l.getMoney());
		System.out.println(l.getGold());

	}

}
