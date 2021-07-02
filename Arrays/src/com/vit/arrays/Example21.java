
//returning array from methods

package com.vit.arrays;

public class Example21 {

	public static int[] m1() { 

		int arr[]= {1,2,3,4};

		return arr;
	}    

	public static void main(String args[]){ 

		//calling method which returns an array 

		int arr[] = m1(); 

		//Accessing the array 
		for (int i = 0; i < arr.length; i++) 
			System.out.print(arr[i]+" "); 
	} 

}


