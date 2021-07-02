package singltoneexample;

public class Focus {
	
	private static Focus focus;
	
	private Focus() {}
	
	public static Focus getInstants() {
		if(focus == null) {
			focus = new Focus();
		}
		
		return focus;
	}
	
	public void display() {
		System.out.println("dispaly method");
	}

}
