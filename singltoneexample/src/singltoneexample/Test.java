package singltoneexample;

public class Test{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Focus d=Focus.getInstants();
		d.display();
		
		Focus e=Focus.getInstants();
		e.display();
		
	}

	

}
