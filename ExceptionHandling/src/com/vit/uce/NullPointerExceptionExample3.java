package com.vit.uce;

public class NullPointerExceptionExample3 {
	
	private String name;

	public void setName(String name) {
		
		this.name = name;
	}

	public void print() {

		printString(name);
	}

	private void printString(String s) {
		
		System.out.println(s + " (" + s.length() + ")");
	}

	public static void main(String[] args) {
		
		NullPointerExceptionExample3 printer = new NullPointerExceptionExample3();
		
		//printer.setName("Venkat");
		
		printer.print();

	}
}
