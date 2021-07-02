

//Finding the sum and average of an Array

package com.vit.arrays;

public class Example6 {

	public static void main(String args[]) {

		int[] numbers = {2, 4, 10, 5, 11, -12, 15, 9, 8, 13};

		int sum = 0;

		Double average;

		// access all elements using for  loop
		// add each element in sum

		for (int number: numbers) {

			sum += number;  //sum=sum+number;
		}

		// get the total number of elements
		int arrayLength = numbers.length;

		// calculate the average
		// convert the average from int to double
		average =  ((double)sum / (double)arrayLength);

		System.out.println("Sum = " + sum);
		System.out.println("Average = " + average);
	}
}


