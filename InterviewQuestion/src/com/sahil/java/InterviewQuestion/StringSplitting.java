package com.sahil.java.InterviewQuestion;

public class StringSplitting 
{
	public static void main(String[] args) 
	{
		String str = "This book on java is too good";
		String[] s;
		s = str.split(" ");
		
		for(int i =0;i<str.length();i++)
		{
		  System.out.println(s[i]);
		}
	}
}
