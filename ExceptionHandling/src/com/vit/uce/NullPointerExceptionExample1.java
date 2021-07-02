package com.vit.uce;

public class NullPointerExceptionExample1 {

	public static void main(String[] args) {
		
		String s=null;
		//String s=null;
		
		
		try{
			// Rule 1 : Never invoke methods on null
		if("abc".equals(s))
			
			System.out.println("Both are same");
			
		else
			
			System.out.println("Both are not  same");
		
		}catch(NullPointerException e){
			e.printStackTrace();
			System.out.println("Nullpointer is caught");
		}
		
	}


}
