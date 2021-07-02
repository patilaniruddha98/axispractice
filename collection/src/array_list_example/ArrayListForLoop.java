package array_list_example;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		for(int items:list) {
			System.out.println(items);
			
		}
		
		System.out.println("*********************************************");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("*********************************************");
		
		list.forEach(item->System.out.println(item));
		
		System.out.println("*********************************************");
		
		int i=0;
		while(i<list.size()) {
			System.out.println(list.get(i));
			i++;
		}
		
		System.out.println("*********************************************");
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		System.out.println("*********************************************");

	}

}
