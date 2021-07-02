package com.vit.uce;

public class ExceptionPropagation {
	void method3(){
	    int result = 100 / 0;  //Exception Generated
	  }

	  void method2(){
	    method3();
	  }

	  void method1(){
	    try{
	  method2();
	    } catch(Exception e){
	  System.out.println("Exception is handled here");
	    }
	  }

	  public static void main(String args[]){
	  ExceptionPropagation obj=new ExceptionPropagation();
	  obj.method1();
	  System.out.println("Continue with Normal Flow...");
	  }
}
