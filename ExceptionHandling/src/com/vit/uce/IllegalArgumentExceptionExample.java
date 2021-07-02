package com.vit.uce;

public class IllegalArgumentExceptionExample {

	public static int getLength(String s){
		if (s==null)
			throw new IllegalArgumentException("The argument cannot be null");
		return s.length();

	}

	public static void main(String args[]){

		String s=null;
		System.out.println(getLength(s));
	}

}
