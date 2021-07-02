package filereadingandwriting;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BufferOutputStreamExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileOutputStream fout = new FileOutputStream("ani.txt");
		
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		
		String s= "hi hello how are you mast";
		
		byte b[] = s.getBytes();
		bout.write(b);
		bout.flush();
		bout.close();
		fout.close();

	}

}
