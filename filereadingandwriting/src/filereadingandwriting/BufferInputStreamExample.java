package filereadingandwriting;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class BufferInputStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			InputStream input = new FileInputStream("ani.txt");
			
			BufferedInputStream bf = new BufferedInputStream(input);
			
			int r=0;
			while((r=bf.read())!= -1) {
				System.out.print((char)r);
			}
			
			bf.close();
			input.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
