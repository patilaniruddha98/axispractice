
//Create an Array by using new keyword
//initialize the Array
//Accessing the Array by using for loop

package com.vit.arrays;



public class Example1 {

	public static void main(String[] args) {

		//Create an Array by using new keyword
		// allocating memory for 5 integers.
		int arr[]=new int[5];

		//initializing the Array
		arr[0]=10; 
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50; 




		//Accessing the Array by using for loop
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);


		}


	}

}
