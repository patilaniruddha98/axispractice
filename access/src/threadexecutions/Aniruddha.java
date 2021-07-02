package threadexecutions;

public class Aniruddha implements Runnable {
	
	public void run() {
		System.out.println("aniruddha");
	}
	
	
	public static void main(String[] args) {
		Aniruddha a = new Aniruddha();
		Thread t = new Thread(a);
		t.start();
	}



}
