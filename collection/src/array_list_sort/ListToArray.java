package array_list_sort;

import java.util.ArrayList;

public class ListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<String>();
		list.add("Chitrak");
		list.add("Aniruddha");
		list.add("Yash");
		list.add("Satya");
		list.add("Parvesh");
		
		String arr[] = list.toArray(new String[list.size()]);
		
		for(String data:arr) {
			System.out.println(data);
		}
		
		
	}

}
