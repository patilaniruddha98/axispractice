package filereadingandwriting;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte[] array = {2,4,6,8};
		
		try {
			
			
			ByteArrayInputStream input = new ByteArrayInputStream(array);
			
			System.out.println("the bytes read from the input stream");
			
			for(int i=0; i <array.length;i++) {
				int numbers = input.read();
				System.out.println(numbers + " ");
			}
			
			
		}catch(Exception e){
			
			e.printStackTrace();

		}

	}

}
