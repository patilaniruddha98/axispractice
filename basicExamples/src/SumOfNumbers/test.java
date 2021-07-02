package SumOfNumbers;
import java.util.*;
public class test {

	public static void main(String[] args) {
		int sum=0;
		System.out.println("Enter number to sum");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			sum = sum+i;
		}
		
		System.out.println(sum);
		

	}

}
