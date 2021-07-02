package com.vit.ce;

import java.io.FileInputStream;
import java.io.IOException;

public class IoException {



	public static void main(String[] args) {

		try {
			FileInputStream input=new FileInputStream("C:\\test\\javaiofiles\\def.txt");

			int r=0;

			while((r=input.read())!=-1){

				System.out.print((char)r);
			}
			input.close();
		} catch (IOException e) {

			e.printStackTrace();
		}


	}

}