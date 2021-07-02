package com.axis.overloadexample;

public class employee {
	int id;
	String name;
	int sal;
	public employee() {
		super();
	}
	public employee(int id) {
		super();
		this.id = id;
	}
	public employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public employee(int id, String name, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	
	public static void main(String[] args) {
		employee e = new employee();
		
	}
	
	

}
