

//merging two arrays by using arrayCopy method

package com.vit.arrays;

import java.util.Arrays;

public class Example8 {

	public static void main(String[] args) {

		//creating first array 

		int[] firstArray = {23,45,12,78,4,90,5};   

		//creating second array
		int[] secondArray = {77,11,45,88,32,56,3};   

		//determines length of firstArray 
		int fl = firstArray.length;  

		//determines length of secondArray
		int sl = secondArray.length;    

		//resultant array of size first array and second array  
		int[] result = new int[fl+ sl]; 

		//using arrayCopy method

		System.arraycopy(firstArray,1,result,0,fl-1);
		System.arraycopy(secondArray, 0, result, fl-1, sl);  


		//printing the resultant array  
		System.out.println(Arrays.toString(result));    
	}  
}


