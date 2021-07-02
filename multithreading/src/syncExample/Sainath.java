package syncExample;

public class Sainath extends Thread {
	
	Printer p;
	public Sainath(Printer p) {
		this.p=p;
	}
	
	public void run() {
		p.print(3);
	}

}
