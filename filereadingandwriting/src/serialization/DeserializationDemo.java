package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
			Employee emp=null;
			try {
				FileInputStream fileIn=new FileInputStream("ani1.ser");
				ObjectInputStream objIn= new ObjectInputStream(fileIn);
				emp=(Employee) objIn.readObject();
				objIn.close();
				fileIn.close();
				System.out.println(emp);
				System.out.println("Desarlize data.....");
				System.out.println("ID:"+emp.id);
				System.out.println("NAME:"+emp.name);
				System.out.println("AGE"+emp.age);
				System.out.println("SSN:"+emp.ssn);
				System.out.println("ADDRESS:"+emp.address);
				}catch(IOException e) {
					e.printStackTrace();
				}
			catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
			}
}
