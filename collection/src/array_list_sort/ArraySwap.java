package array_list_sort;

import java.util.ArrayList;
import java.util.Collections;

public class ArraySwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Chitrak");
		list.add("Aniruddha");
		list.add("Yash");
		list.add("Satya");
		list.add("Parvesh");
		
		System.out.println(list);
		
		Collections.swap(list,2,4);
		
		System.out.println(list);
	}

}
