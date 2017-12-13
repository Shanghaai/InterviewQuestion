package com.sahil.java.InterviewQuestion;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DuplicateIntegers 
{
	public static void main(String[] args) {
		int[] x = {1,3,1,2,4,2,4,66,75,44};
		
		for (int i = 0; i < x.length; i++) 
		{
			for (int j = i+1; j < x.length; j++) 
			{
				if(x[i]==x[j] && i != j)
					System.out.println("Duplicate exist : "+x[i]);
			}
		}
		
		System.out.println("=========================");
		
		Arrays.sort(x);
		

		System.out.println("Sorted arrays are :0");
		for (int i = 0; i < x.length; i++) 
		{
			System.out.println(x[i]);			
		}
		System.out.println("Duplicate Element are  : ");
		for (int i = 0; i < x.length-1; i++) {
			if(x[i]==x[i+1])
			{
				System.out.println("duplicate elements are : "+x[i]);
			}
		}
   }
	
}
