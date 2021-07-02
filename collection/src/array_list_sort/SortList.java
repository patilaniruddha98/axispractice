package array_list_sort;

import java.util.ArrayList;
import java.util.Collections;

public class SortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Chitrak");
		list.add("Aniruddha");
		list.add("Yash");
		list.add("Satya");
		list.add("Parvesh");
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
	}

}
