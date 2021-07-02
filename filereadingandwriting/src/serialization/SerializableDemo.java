package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableDemo {
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.id=101;
		emp.name="aniruddha";
		emp.age=23;
		emp.ssn=1234;
		emp.address="mumbai";
		
		try {
			FileOutputStream fileOut = new FileOutputStream("ani1.ser");
			ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
			objOut.writeObject(emp);
			objOut.close();
			fileOut.close();
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}

}
