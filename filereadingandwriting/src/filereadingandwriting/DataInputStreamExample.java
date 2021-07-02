package filereadingandwriting;

import java.io.FileInputStream;
import java.io.InputStream;

public class DataInputStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			InputStream input = new FileInputStream("ani.txt");
			
			
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}

	}

}
