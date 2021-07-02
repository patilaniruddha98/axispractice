import java.util.Scanner;

public class Candidate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
		  System.out.print("Enter your age :");
		  int age = sc.nextInt();
		  
		  try {
		   if(age < 18) 
		    throw new AgeNotValidException("age is not valid");
		   else {
			   System.out.println("welcome");
			   }
		   }
		  catch (AgeNotValidException e) {
		  e.printStackTrace();
		  }

	}

}
