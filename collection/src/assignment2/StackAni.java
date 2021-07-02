package assignment2;

public class StackAni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		stack<Integer> obj1 = new stack<>(3);

		obj1.push(1);
		obj1.push(2);
		obj1.push(3);

		System.out.println("s1 after pushing 10, 20 and 30 :\n" + obj1);

		obj1.pop();

		System.out.println("s1 after pop :\n" + obj1);

		stack<String> obj2 = new stack<>(3);

		obj2.push("aniruddha");
		obj2.push("chitrak");
		obj2.push("yash");

		System.out.println("\nobj2 after pushing 3 elements :\n" + obj2);

		System.out.println("obj2 after pushing 4th element :");

		obj2.push("satya");

		stack<Float> obj3 = new stack<>(2);

		obj3.push(100.0f);
		obj3.push(200.0f);

		System.out.println("\nobj3 after pushing 2 elements :\n" + obj3);

		System.out.println("top element of 	obj3:\n" + obj3.top());

	}

}
