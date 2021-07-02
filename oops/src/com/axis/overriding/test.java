package com.axis.overriding;

public class test {

	public static void main(String[] args) {
		faculty f = new faculty();
		f.java();
		f.python();
		f.html();
		
		student s = new student();
		s.html();
		s.java();
		s.python();

	}

}
