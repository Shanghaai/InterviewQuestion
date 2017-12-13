package com.sahil.java.InterviewQuestion;

import java.util.HashMap;

public class FirstNonRepeatingElement 
{
	public static void main(String[] args) {
		String content = "AAAAAABBBBBSSBBSSBBSSXTY";
		char[] contentArray=content.toCharArray();
		
		HashMap<Character, Integer> hm  = new HashMap<Character,Integer>();
		int count = 0;
		
		for (int i = 0; i < contentArray.length; i++) {
			char currentLetter = contentArray[i];
			
			if(!hm.containsKey(currentLetter))
			{
				hm.put(currentLetter, 1);
				count=1;
			}
			else
			{
				 count = count+1;
				hm.put(currentLetter, count);
			}
		}
		System.out.println(hm);
		for (int i = 0; i < contentArray.length; i++) 
		{
			char x  = contentArray[i];
			if(hm.get(x)==1){
				System.out.println(x);
				break;
			}
		}
	}
}