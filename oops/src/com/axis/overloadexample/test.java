package com.axis.overloadexample;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		operation o = new operation();
		System.out.println( o.add(4, 5));
		System.out.println(o.add(1, 2, 3));
		o.add(5, 5.5, 5);

	}

}
