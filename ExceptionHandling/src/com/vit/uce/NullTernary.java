package com.vit.uce;

public class NullTernary {

	public static void main(String[] args) {
		
		String str=null;
		//String str="Welcome to prisim";
		
	   //String msg=str.substring(0,5);
		//System.out.println(msg);
		      
		String msg = (str == null)?" object ref is null ":str.substring(0,5);
		
		System.out.println(msg);

		

	}

}
