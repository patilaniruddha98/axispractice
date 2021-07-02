package com.vit.uce;

public class NullPointerExceptionExample2 {

	public static void main(String[] args) {

		//never invoke any methods on null value
		Integer i=null;

		int j=i;
		System.out.println(i);

		System.out.println(j);


	}
}