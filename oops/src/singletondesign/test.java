package singletondesign;

public class test {

	public static void main(String[] args) {
		focus f = focus.getInstance();
		f.display();
		
		focus f1 = focus.getInstance();
		f.display();

	}

}
