
//Multiplying two matrices

package com.vit.arrays;

public class Example17 {

	public static void main(String[] args) {

		//creating two matrices    
		int a[][]={{1,2,4},{3,5,6}};    //2x3
		int b[][]={{7,8},
				{1,8},{2,4}};  //3x2  

		//creating another matrix to store the multiplication of two matrices    
		int c[][]=new int[2][2];  

		//multiplying and printing multiplication of 2 matrices    

		for(int i=0;i<2;i++){    

			for(int j=0;j<2;j++){    
				c[i][j]=0;      
				for(int k=0;k<2;k++)      
				{      
					c[i][j]+=a[i][k]*b[k][j];      
				}//end of k loop  
				System.out.print(c[i][j]+" "); 
			}
			System.out.println();//new line    
		}    
	}
}  




