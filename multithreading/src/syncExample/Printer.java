package syncExample;

public class Printer {
	
	public synchronized void print(int n) {
		
		for(int i=0;i<n;i++) {
			System.out.println(i);
			try {
				Thread.sleep(3000);
			}catch(InterruptedException e) {
				
			}
		}
		
	}

}
