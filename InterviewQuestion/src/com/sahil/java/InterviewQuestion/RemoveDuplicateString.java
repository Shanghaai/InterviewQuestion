package com.sahil.java.InterviewQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateString 
{

	public static void main(String[] args) {
		
		String[] str = {"java","hibernate","spring","hibernate","java"};
		int[] x = {1,3,3,1,3,4,5,6,};
		
		Arrays.sort(x);
		for (int i = 0; i < x.length; i++) {
			if(x[i]==x[i+1])
				System.out.println("duplicate number is : "+x[i]);
		}
		
		for (int i = 0; i < x.length; i++) 
		{
			for (int j = 0; j < (str.length)-i; j++) 
			{
				if(str[i].equals(str[j+1]))
					System.out.println("duplicate element : "+str[j]);
			}
		}
		
		
		/*		HashSet nonDuplicate  =  new HashSet<>();
		HashSet duplicate  =  new HashSet<>();
		for (String object : str) {
			if(!nonDuplicate.contains(object))
				nonDuplicate.add(object);
			else
				duplicate.add(object);
		}
			System.out.println(duplicate);
		 */		
		/*List list = new ArrayList();
		for (String string : str) 
		{
			list.add(string);
		}
		Set set = new HashSet(list);
		System.out.println(set.toString());
		*/
		
		
		
		
		
	}
}
