package singletondesign;

public class focus {
	private static focus focus;
	focus() {
		
	}
	public static focus getInstance() {
		if(focus == null) {
			focus=new focus();
		}
		return focus;
	}
	
	public void display() {
		System.out.println("display method");
	}

}
