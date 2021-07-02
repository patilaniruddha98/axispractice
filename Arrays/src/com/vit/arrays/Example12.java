

//store objects into an array
package com.vit.arrays;

public class Example12 {


	public static void main(String[] args) {


		Student arr[]=new Student[3];

		arr[0]=new Student(1,"avani","hyd");
		arr[1]=new Student(2,"vani","pune");
		arr[2]=new Student(3,"rani","madras");

		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i].roll_no+"  "+arr[i].name+"  "+arr[i].address);
		}

	}}
