package com.vit.uce;

public class ArrayIndexOutOfBounds {

	public static void main(String[] args) {

		try {
			//int arr[] ={1,2,3,4,5};

			//System.out.println(arr[11]);

			String s1="welcome";

			System.out.println(s1.charAt(21));

		}catch(ArrayIndexOutOfBoundsException e) {

			System.out.println("Array Boundary");

		}catch(StringIndexOutOfBoundsException e) {

			System.out.println("String Boundary");

		}catch(Exception e) {

			System.out.println("some othere");
		}
	}

}


