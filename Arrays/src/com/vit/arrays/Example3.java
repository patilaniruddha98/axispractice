

//creating a multidimensional Array

package com.vit.arrays;

public class Example3 {

	public static void main(String args[]) {

		// declaring and initializing 2D array
		int[][] array = { {1, 2},   {5, 6} };


		//Accessing an Array by for loop
		for (int i = 0; i < array.length; i++) {

			for(int j = 0; j < array[i].length; j++)
			{
				System.out.print(array[i][j] +"  ");
			}
			System.out.println();
		}
	}

}


