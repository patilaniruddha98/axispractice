package SumOfNumbers;
import java.util.Scanner;
public class sumandAvg {

	public static void main(String[] args)
	   {
	      int number, sum = 0;
	      float average;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter number of elements : ");
	      number = sc.nextInt();
	      int[] arrNum = new int[number];
	      System.out.println("Enter " + number + " elements : ");
	      for(int a = 0; a < number ; a++)
	      {
	         arrNum[a] = sc.nextInt();
	         sum = sum + arrNum[a];
	      }
	      System.out.println("Sum is : " + sum);
	      average = (float)sum / number;
	      System.out.println("Average is : " + average);
	      sc.close();
	   }

}
