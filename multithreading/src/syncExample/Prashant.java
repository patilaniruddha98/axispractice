package syncExample;

public class Prashant extends Thread {
	
	Printer p;
	public Prashant(Printer p) {
		this.p=p;
	}
	
	public void run() {
		p.print(5);
	}

}
