package com.vit.ce;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckInputMismatch {

	public static void main(String[] args) {
		
		Scanner x=new Scanner(System.in);
		
		int age = 0;
		double salary = 0.0;
		String name="";

		System.out.println("Enter the details");
		try{
			
		age=x.nextInt();
		salary =x.nextDouble();
		name=x.next();
		
		System.out.println("age : "+age+" Salaray :"+salary+" Name : "+name);
		
		}catch(InputMismatchException ime){
			
			ime.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
	}

}
