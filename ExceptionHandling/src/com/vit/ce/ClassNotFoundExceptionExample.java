package com.vit.ce;
//import com.mdits.example.Focus1;

public class ClassNotFoundExceptionExample {
	
	
	private static final String CLASS_TO_LOAD = "CheckedException.Prism1";
	
	
	
	    public static void main(String[] args) {
		 try {
			 
			 
	            Class loadedClass = Class.forName(CLASS_TO_LOAD);
	
	            System.out.println( loadedClass + " found successfully!");
	
	       }
	
	        catch (Exception e) {
	
	            //System.err.println("A ClassNotFoundException : " + ex.getMessage());
	
	            e.printStackTrace();
	
	        }
	
	    }

}
