package com.vit.ce;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FilenotFoundException {

	   public static void main(String args[]) {	
		   
	      File file = new File("C:/temp/test.txt");
	      try {
	    	  
			FileReader fr = new FileReader(file);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} 
	   }
}
