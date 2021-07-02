package syncExample;

public class TestSync {
	public static void main(String[] args) {
	
	Printer p =new Printer();
	Prashant t1 = new Prashant(p);
	Sainath t2 = new Sainath(p);
	
	t1.start();
	
	t2.start();

}
}
