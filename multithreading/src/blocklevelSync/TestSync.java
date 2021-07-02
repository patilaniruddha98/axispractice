package blocklevelSync;

public class TestSync {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Print p = new Print();
	      Thread t1 = new Thread(p);
	      Thread t2 = new Thread(p);
	      t1.start();
	      
	      t2.start();
	      
			
			  
			 

	}

}
