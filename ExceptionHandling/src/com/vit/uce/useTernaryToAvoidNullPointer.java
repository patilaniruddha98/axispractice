package com.vit.uce;

import java.io.*;

//A Java program to demonstrate that we can use
// ternary operator to avoid NullPointerException.

public class useTernaryToAvoidNullPointer {

	public static void main(String[] args) {

		
		  //String s =null; 
		  //String s="welcome to java"; 
		  //String result=s.substring(0,5);
		  
		  //System.out.println(result);
		 

		// Initializing String variable with null value

		 String str="welcome to java";
		 //String str = null;

		String message = (str == null) ? "String is Null":str.substring(0,5);

		 System.out.println(message);

	}
}
