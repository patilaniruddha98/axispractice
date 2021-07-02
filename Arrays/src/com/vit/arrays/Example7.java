package com.vit.arrays;

public class Example7 {

	public static void main(String[] args) {

		int array[]= {10,20,30,40,50};

		int arraycopy[]=new int[5];

		//arraycopy=array;


		System.arraycopy(array,0,arraycopy,0,array.length);

		array[3]=25;


		System.out.println("array elements"); 

		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		System.out.println("arrcopy elements");
		for(int i=0;i<arraycopy.length;i++) {
			System.out.println(arraycopy[i]);

		}
	}
}



