package com.vit.uce;

public class NullInsatnceOfCheck {

	public static void main(String[] args) {
		
		String x=null;
		//String x="def";
		String s="abc";
				if(s instanceof String){
					System.out.println("condition is satisfied as s is having value");
				}	
				
		if(x instanceof String){
			System.out.println("condition is satisfied");
		}
	}

}
