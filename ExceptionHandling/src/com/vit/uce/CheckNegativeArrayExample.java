package com.vit.uce;
import java.util.Scanner;

public class CheckNegativeArrayExample {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		  int s1=0;
		  System.out.println("enter number of elements ");

		  //Read the size of array from user and check if it is not negative

		  s1=sc.nextInt();
		  if(s1<0) throw  new NegativeArraySizeException("Array size cannot be negative.");
		  int array[]=new int[s1];
		  int s2 = 0;
		  System.out.println("Enter elements");
		  for(int i=0;i<array.length;i++) {
			 
		    s2=sc.nextInt();

		  //get input from user and dont allow negtive numbers in the array

		   if(s2<0) throw new IllegalArgumentException("Negative numbers not allowed");
		    array[i]=s2;
		  }
	
		 
	}

}
