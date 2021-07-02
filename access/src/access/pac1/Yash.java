package access.pac1;

public class Yash extends Thread {
	public void run() {
		
			System.out.println("aniruddha");
		
	}
	
	
	
	
public static void main(String[] args) {
	Yash y = new Yash();
	y.start();
	
	Yash y1 = new Yash();
	y1.start();
	
	
	
	
}

}
