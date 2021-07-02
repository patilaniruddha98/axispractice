package com.vit.arrays;

import java.util.Arrays;
import java.util.Collections;
//Write a program to sort an Array in descending order
public class Example11 {

	public static void main(String[] args) {

		Integer [] array = {13, -9, 68, 110, 4, 0, -5, 12, 6, 120, 215};

		//sorts array in ascending order
		Arrays.sort(array);

		System.out.println(Arrays.toString(array));

		// sorts array[] in descending order   
		Arrays.sort(array, Collections.reverseOrder());  

		System.out.println("descending order: " +Arrays.toString(array));   
	}   
}


