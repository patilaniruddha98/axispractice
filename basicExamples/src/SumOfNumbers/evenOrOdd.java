package SumOfNumbers;

import java.util.Scanner;

public class evenOrOdd {
	public static void main(String[] args)
    {
		  Scanner sc= new Scanner(System.in);     
		  System.out.print("Enter  number- ");
		  int num=sc.nextInt();
		  String output = (num%2==0)?"even number":"odd number";
		  System.out.println(output);
    }

}
