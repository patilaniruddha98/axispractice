package filereadingandwriting;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipeIOStream {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		final PipedInputStream pin = new PipedInputStream();
		final PipedOutputStream po = new PipedOutputStream();
		
		po.connect(pin); // to connect the streams
		
		//creating a thread to write data
		
		Thread t1 = new Thread() {
			public void run() {
				for(int i=50;i<60;i++) {
					try {
						po.write(i);
						Thread.sleep(1000);
						
					}
					catch(Exception e) {
						System.out.println(e);
					}
				}
			}
		};
		
		//creating another thread to read the data

		
		Thread t2 = new Thread() {
			public void run() {
				try {
				for(int i=50;i<60;i++) {
						System.out.print(pin.read()+", ");
						
					}
				}
					catch(Exception e) {
						System.out.println(e);
					}
				}
			};
			
			
			t1.start();
			t2.start();

}
}
