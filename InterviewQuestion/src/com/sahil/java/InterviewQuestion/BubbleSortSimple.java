package com.sahil.java.InterviewQuestion;

public class BubbleSortSimple 
{
	public static void main(String[] args) 
	{
		int[] array = {10,20,34,30,1};
		System.out.println("Before Sorting : ");
		System.out.println("array lenght is :"+array.length);
		for (int i : array) {
			System.out.println(i);
		}
		bubbleSort(array);
	}
	public static void bubbleSort(int[] array)
	{
		for(int i=1;i<array.length;i++)
		{
			for(int j=1;j<(array.length);j++)
			{
				if(array[j-1] > array[j])
				{
					int temp = array[j-1];
					array[j-1] = array[j];
					array[j]=temp;
				}
			}
		}
		System.out.println("after sorting :");
		for (int i : array) {
		    System.out.println(i);
		}
	}
}
