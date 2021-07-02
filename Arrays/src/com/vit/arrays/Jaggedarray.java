package com.vit.arrays;

public class Jaggedarray {

	public static void main(String[] args) {

		int jarr[][] = {{12}, {32,12,38}, {14,6},{3}};

		for (int i = 0; i < jarr.length; i++) {



			for (int j = 0; j < jarr[i].length; j++) {
				System.out.print( jarr[i][j]+" ");
			}
			System.out.println();
		}
	}

}


