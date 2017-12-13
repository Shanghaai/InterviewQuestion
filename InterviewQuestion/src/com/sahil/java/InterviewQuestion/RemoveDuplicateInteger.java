package com.sahil.java.InterviewQuestion;

public class RemoveDuplicateInteger 
{
	
	public static void main(String[] args) {

	int[] x = new int[]{1,2,3,1,2,3,1};
	for (int i = 0; i < x.length; i++) 
	{
		for (int j = i+1; j < x.length; j++) 
		{
			if(x[i]==x[j])
				x[i]=-1;
		}
	}
	for (int i = 0; i < x.length; i++) {
		
		if(x[i] != -1)
			System.out.println("Unique Elements are  : "+x[i]);
	}
  }
}
