package filereadingandwriting;

import java.io.File;
import java.io.FileReader;

public class FileReaderExample {

	public static void main(String[] args) {
		
		try {
			
			FileReader fr = new FileReader("ani.txt");
			
			File file = new File("ani.txt");
			
			FileReader reader = new FileReader(file);
			
			System.out.println(reader.read());
			
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
