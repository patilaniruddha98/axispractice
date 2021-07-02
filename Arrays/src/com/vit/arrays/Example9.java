
//Extending Array after initialization

package com.vit.arrays;

public class Example9 {

	public static void main(String[] args) {

		String[] names = new String[] { "Aa", "Bb", "Cc" };

		//create a new array

		String[] extend = new String[5];

		extend[3] = "Dd";
		extend[4] = "Ee";

		System.arraycopy(names, 0, extend, 0, names.length);

		for (String str : extend){
			System.out.println(str);
		}

	}

}
