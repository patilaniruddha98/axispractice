package com.axis.dataTypes;

public class test {
	public void display() {
		System.out.println("display method");
		int myNum = 5;  
	    float myFloatNum = 3.536f;   
	    double doub = 123.123;
	    char myLetter = 'D';         
	    boolean myBool = true;      
	    String myText = "Hello";        
	    System.out.println(myNum);
	    System.out.println(myFloatNum);
	    System.out.println(myLetter);
	    System.out.println(myBool);
	    System.out.println(myText);
	    System.out.println(doub);
	}
	
	
	public static void main(String args[]) {
		System.out.println("welcome !");
		
		test t = new test();
		t.display();
	}

}
