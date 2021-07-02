package com.vit.uce;

public class HashCodeNullCheck {

	public static void main(String[] args) {
		
		//Object o=new Object();
		Object o=null;
	System.out.println(o.hashCode());
		
		
		
		  if(o!=null) {
		  
		  System.out.println(o.hashCode());
		  
		  }else {
		  
		  System.out.println("Object reference is null"); }
		 
		 

	}

}
