package com.vit.ce;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundExceptionExample2 {

	
public void m4() throws FileNotFoundException{
	
	
			
				FileReader file=new FileReader("C:/Demo/bc.txt");
			
		
	}	
public void m3() throws FileNotFoundException {
		this.m4();
		System.out.println("M4 is executed successfully");
		
	}	
public void m2() throws FileNotFoundException{
		this.m3();
		System.out.println("M3 is executed successfully");
		
	}
	public void m1() throws FileNotFoundException{
		
		/*try {
			this.m2();
		} catch (FileNotFoundException e) {
			System.out.println("Exception is caught");
			e.printStackTrace();
		}*/
		
		
			this.m2();
			{
		 throw new FileNotFoundException("no such file in the location");
			}
	}
	
	

	public static void main(String[] args) throws FileNotFoundException {
		
		FileNotFoundExceptionExample2 x=new FileNotFoundExceptionExample2();
	
		x.m1();
	
	
		System.out.println("After main method");
		
	}

}
