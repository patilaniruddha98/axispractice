package com.vit.uce;

public class HashcodeNullPointerCheck {

	public static void main(String[] args) {


		//String i="welcome";

		String i=null;


		if(i!=null){
			System.out.println(i.hashCode());

		}
		else{

			System.out.println(" null reference");
		}


	}
}
