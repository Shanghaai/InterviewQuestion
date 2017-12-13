package com.sahil.java.InterviewQuestion;

public class SplitString {

	public static void main(String[] args) {
		
		String x = "Gold:Stroks:sahil:Commodity:Rates";
		String[] ArraySplit = x.split(":");
		
		System.out.println("Split size :"+ArraySplit.length);
		
		for (String string : ArraySplit) 
		{
			System.out.println(string);
		}
	}
}
