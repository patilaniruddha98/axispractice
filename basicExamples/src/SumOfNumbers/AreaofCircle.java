package SumOfNumbers;

import java.util.Scanner;

public class AreaofCircle {
	public static void main(String[] args)
    {
		  Scanner sc= new Scanner(System.in);     
		  System.out.print("Enter  radious- ");
		  double r=sc.nextInt();
		  double area=Math.PI*(r*r);
		  System.out.println(area);
		  
    }

}
