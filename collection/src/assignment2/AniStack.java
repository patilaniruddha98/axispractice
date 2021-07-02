package assignment2;

//Importing all utility classes
import java.util.ArrayList;

//user defined class for generic stack
class stack<E> {

	ArrayList<E> myStack;
	int top = -1;
	int size;

	stack(int size) {

		this.size = size;

		this.myStack = new ArrayList<E>(size);
	}

	void push(E X) {

		if (top + 1 == size) {

			System.out.println("Stack Overflow");
		} else {

			top = top + 1;

			if (myStack.size() > top)
				myStack.set(top, X);

			else

				myStack.add(X);
		}
	}

	
	//GET THE TOP MOST ELEMENT
	E top() {
		
		if (top == -1) {

			System.out.println("Stack Underflow");

			return null;
		}

	
		else
			return myStack.get(top);
	}

	//Delete the last element
	void pop() {
		
		if (top == -1) {

			
			System.out.println("Stack Underflow");
		}

		else

			
			top--;
	}

	
	// To check if stack is empty or not
	boolean empty() {
		return top == -1;
	}

	
	public String toString() {

		String Ans = "";

		for (int i = 0; i < top; i++) {
			Ans += String.valueOf(myStack.get(i)) + "->";
		}

		Ans += String.valueOf(myStack.get(top));

		return Ans;
	}
}
