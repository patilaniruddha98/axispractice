package com.vit.ce;

import java.lang.reflect.InvocationTargetException;

class Focus {

	public  Focus(String arg1) {
		System.out.println(arg1);
	}

}

public class InstantiationExceptionExample {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Class  c = Focus.class;
		Focus a = ( Focus) c.getDeclaredConstructor(String.class).newInstance();

	}

}

