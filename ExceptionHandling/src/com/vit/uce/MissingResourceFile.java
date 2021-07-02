package com.vit.uce;
import java.util.ResourceBundle;

public class MissingResourceFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResourceBundle myResources = ResourceBundle.getBundle("com.prisim.resources.abc");
		String name = myResources.getString("name");
		
		        String city = myResources.getString("city");
		
		        
		
		        System.out.println("Hello! I'm %s %s, %s years old"+name+ city);
	}

}
