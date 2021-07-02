package com.vit.arrays;

public class Example16 {

	static int secondLargest(int[] arr)
	{
		int firstLargest;

		int secondLargest;

		//Checking first two elements of arr array

		if(arr[0] > arr[1])
		{
			//If first element is greater than second element

			firstLargest = arr[0];

			secondLargest = arr[1];
		}
		else
		{
			//If second element is greater than first element

			firstLargest =arr[1];

			secondLargest = arr[0];
		}

		//Checking remaining elements of arr array

		for (int i = 2; i < arr.length; i++)
		{
			if(arr[i] > firstLargest)
			{
				//If element at 'i' is greater than 'firstLargest'

				secondLargest = firstLargest;

				firstLargest = arr[i];
			}
			else if (arr[i] < firstLargest && arr[i] > secondLargest)
			{
				//If element at 'i' is smaller than 'firstLargest' and greater than 'secondLargest'

				secondLargest = arr[i];
			}
		}

		return secondLargest;
	}

	public static void main(String[] args)
	{
		System.out.println(secondLargest(new int[] {15, 55, 65, 25, 85, 105}));

	}
}

