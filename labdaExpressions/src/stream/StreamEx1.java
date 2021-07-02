package stream;

import java.util.ArrayList;

public class StreamEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<String>();

		list.add("shreekanth");
		list.add("shreenath");
		list.add("anand");
		list.add("lakshmi");
		list.add("ajay");
		list.add("ravi");
		list.add("shiva");
		list.add("indu");
		list.add("ashish");
		list.add("venkat");

		list.stream().filter(name -> name.startsWith("a")).map(String::toUpperCase).sorted()
				.forEach(System.out::println);

	}

}
