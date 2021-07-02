package Linked_List;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		
		System.out.println(list);
		
		
		System.out.println(list.poll());
		
		System.out.println(list.pollFirst());
		
		System.out.println(list.pollLast());
		
		System.out.println(list.peek());
		
		System.out.println(list.peekFirst());
		
		System.out.println(list.peekLast());
		

	}

}
