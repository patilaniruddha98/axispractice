package filereadingandwriting;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FileIOExample {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		FileOutputStream of =new FileOutputStream("customer.txt");
		System.out.println("enter the data");
		String s = scan.nextLine() ;
		
		byte b[]=s.getBytes();
		
		of.write(b);
		of.close();

	}

}
