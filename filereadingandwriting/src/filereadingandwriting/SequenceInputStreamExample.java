package filereadingandwriting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class SequenceInputStreamExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileInputStream input1 = new FileInputStream("ani.txt");
		FileInputStream input2 = new FileInputStream("ani.txt");
		
		FileOutputStream dest= new FileOutputStream("dest.txt");
		
		SequenceInputStream si = new SequenceInputStream(input1,input2);
		
		int r=0;
		while((r = si.read())!= -1) {
			System.out.print(r);
			dest.write(r);
		}
		
		si.close();
		input1.close();
		input2.close();

	}

}
