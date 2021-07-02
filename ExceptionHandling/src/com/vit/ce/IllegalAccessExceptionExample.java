package com.vit.ce;


class Test {

	private Test() {
	}

}

public class IllegalAccessExceptionExample{

	public static void main(String[] args) {

		try {
			/*
			 * IllegalAccessException will be thrown because we are trying to
			 * create an instance of Test class that has private no argument
			 * constructor.
			 * 
			 */
			Test test = Test.class.newInstance();
			System.out.println(test);
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}

	}

}

