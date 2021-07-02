package assignment1;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Serialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Customer cust = new Customer();
		System.out.print("enter name: ");
		cust.customerName = s.nextLine();
		System.out.println();
		System.out.print("enter address: ");
		cust.address = s.nextLine();
		System.out.println();
		System.out.print("enter phone: ");
		cust.phone = s.nextLine();
		
		try {
			FileOutputStream fileOut = new FileOutputStream("CustomerData.ser");
			ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
			objOut.writeObject(cust.toString());
			objOut.close();
			fileOut.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
