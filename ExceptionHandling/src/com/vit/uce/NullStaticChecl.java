package com.vit.uce;

public class NullStaticChecl {

	public static void main(String[] args) {
		
		NullStaticChecl check=null;
		check=new NullStaticChecl();
		check.m1();
		check.m2();
		
	}
	
	private  static void m1(){
		
		System.out.println("i am static method");
	}
	
	
	private void m2(){
		
		System.out.println("i am non static method");
	}

}
