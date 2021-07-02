
//finding minimum and maximum value in an array

package com.vit.arrays;

public class Example10 {

	public int max(int [] array) {

		int max = array[0];

		for(int i=1; i<array.length; i++ ) {
			if(array[i]>max) {
				max = array[i];
			}
		}
		return max;
	}
	public int min(int [] array) {
		int min = array[0];

		for(int i=1; i<array.length; i++ ) {
			if(array[i]<min) {
				min = array[i];
			}
		}
		return min;
	}
	public static void main(String args[]) {

		int[] myArray = {110,23, 92, 56, 39, 193};

		Example10 m = new Example10();

		System.out.println("Max value ="+m.max(myArray));
		System.out.println("Min value ="+m.min(myArray));
	}

}
