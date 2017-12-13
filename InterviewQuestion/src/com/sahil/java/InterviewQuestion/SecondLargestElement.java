package com.sahil.java.InterviewQuestion;

import java.util.Arrays;

public class SecondLargestElement 
{

	public static void main(String[] args) {
		
		int[] array = {10,5,20,30,2,100};
		
		search(array);
	}

	private static void search(int[] array) 
	{
		int i=0;
		Arrays.sort(array);
		System.out.println("after sorting array is :");
		for(i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		System.out.println("second largest element is :"+array[array.length-2]);
	}
}
