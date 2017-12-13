package com.sahil.java.InterviewQuestion;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		int original;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number please ?");
		original = sc.nextInt();
		int reverse = (reverse(original));
		System.out.println("original number is : "+original+"and reverse of it :"+reverse);
	}

	public static int reverse(int original)
	{
		int remainder=0; int reverse=0;
		
		do
		{
			remainder = original%10;
			reverse = reverse*10 + remainder;
			original = original/10;
		}
		while(original>0);
		{
			return reverse;
		}
	}
}
