package com.sahil.java.InterviewQuestion;

import java.util.Scanner;

public class BubbleSorting 
{
	public static void main(String[] args)
	{
		System.out.println("Enter how many Elements you wants in your Array == Size of array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		//for storing array elements
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the Elements to be store in the Array");
			arr[i] = sc.nextInt();
		}
		
		//now Bubble sorting starts from here
		int limit = n-1; int temp; boolean flag = false;
		for(int i = 0;i<n; i++)
		{
			for(int j=0;j<limit-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp     = arr[j];
					arr[j]   = arr[j+1];
					arr[j+1] = temp;
					flag = true;
				}
				if(flag = false)
					break;
				else flag = false;
			}
		}
		//now for the sorted elements of array
		for(int i = 0;i<=n;i++)
		{
			try{
				System.out.println("Sorted array is : "+arr[i]);				
			  }
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
