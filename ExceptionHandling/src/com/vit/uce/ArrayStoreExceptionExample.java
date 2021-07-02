package com.vit.uce;

import java.util.Arrays;

public class ArrayStoreExceptionExample {
	
	public static void main(String args[]) {
		
		Number integerArray[] = new Integer[3];
		
		integerArray[0] = 10;
		integerArray[1] = 20;
		integerArray[2] = 99.12;//double
		integerArray[3] = 40;
		System.out.println(Arrays.toString(integerArray));
	}
}