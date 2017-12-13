package com.sahil.java.InterviewQuestion;

import java.io.*;
import java.util.*;

public class SumToZero {
	
	public static void main(String[] args) 
	{
		
		int array[] = new int[5];
		array[0] = -3; array[1] = -2; array[2] = -1; array[3] = 1; array[4] = 2; // Fill array

		int idx[] = new int[2]; // Will store the result (index of the two elements that need to be added)
		double lowest_sum = Double.POSITIVE_INFINITY; // Of type double to be able to use infinity

	for(int i = 0; i < array.length; i++) 
	{
	    // Outer loop --> Uses a current (array[i]) from left to right
	    int current = array[i];
	    for(int j = i+1; j < array.length; j++) 
	    {
	        // Inner loop --> Check all elements we didn't used as current till now
	        int compare_with = array[j];
	        if((Math.abs(current + compare_with) < lowest_sum) && ((current + compare_with) != 0)) 
	        {
	            // We found two elements whose sum is closer to zero
	            lowest_sum = Math.abs(current + compare_with);
	            idx[0] = i; // Index of the first element to add
	            idx[1] = j; // Index of second element to add
	        }
	    }
	    
	}
	
	
		int res_idx1 = idx[0];
		int res_idx2 = idx[1];
		System.out.println("The first element to add is : " + array[res_idx1] + "\nThe second element to add is : " + array[res_idx2]);
  }
}