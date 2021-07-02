package com.vit.ce;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
//If the JVM not supports the charset, then you will get the java.io.UnsupportedEncodingException thrown from your application. 
public class UnsupportedEncodingExample {

	public static void main(String[] args){
		ByteArrayOutputStream byteout = new ByteArrayOutputStream(10);
		byteout.write(10);
		try {
			String s = byteout.toString("IBM859");
		}catch (UnsupportedEncodingException exception){
			exception.printStackTrace();
		}
	}
	
}
