
//Adding two Arrays 

package com.vit.arrays;

public class Example5 {

	public static void main(String[] args) {

		// creating the first matrix using arrays
		int[][] matrix1 = { { 1, 2 }, { 4, 5} };

		// creating the second matrix using two dimension array
		int[][] matrix2 = { { 1, 2 }, { 4, 5 } };

		// output array for storing the addition result
		int[][] output = new int[matrix1.length][matrix2[1].length];

		// matrix addition core logic
		for (int i = 0; i < matrix1.length; i++) {

			for (int j = 0; j < matrix2[i].length; j++) {

				output[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}


		// printing the result
		for (int i = 0; i < output.length; i++) {

			for (int j = 0; j < output[i].length; j++) {
				System.out.print(output[i][j]+ " ");
			}
			System.out.println();
		}}}


