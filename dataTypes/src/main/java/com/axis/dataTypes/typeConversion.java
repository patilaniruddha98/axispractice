package com.axis.dataTypes;

public class typeConversion {
	public static void main(String args[]) {
		int i =100;
		long l = i;
		float f = l;
		System.out.println(f);
		
		double d = 100.04;
		long lo = (long)d;
		int in = (int)lo;
		System.out.println(d);
		System.out.println(lo);
		System.out.println(in);
	}
	
	

}
