package com.vit.ce;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Arrays;

public class UnsupportedEncodingExceptionExample {
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		
        System.out.println(Arrays.toString("@test string".getBytes()));
        System.out.println(Arrays.toString("naga venkata".getBytes()));
        System.out.println(Arrays.toString("@test string".getBytes("US-ASCII")));
        System.out.println(Arrays.toString("@test string".getBytes(Charset.forName("UTF-8"))));
        System.out.println(Arrays.toString("@test string".getBytes("US-ASCII")));

    }
}
