

//comparing two arrays content

package com.vit.arrays;

import java.util.Arrays;

public class Example14 {

	public static void main(String[] args) {


		int arr1[] = {10, 12, 3};

		int arr2[] = {10, 12, 3}; 

		if (Arrays.equals(arr1, arr2)) {
			System.out.println("Equal"); 
		}else
			System.out.println("Not Equal"); 
	} 
}


