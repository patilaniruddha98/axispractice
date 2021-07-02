package filereadingandwriting;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream f = new FileInputStream("ani.txt");
			int r=0;
			while((r = f.read())!= -1) {
				System.out.print((char)r);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
