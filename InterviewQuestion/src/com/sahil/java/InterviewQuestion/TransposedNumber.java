package com.sahil.java.InterviewQuestion;

import java.util.Scanner;

public class TransposedNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Rows of array");
		int r = sc.nextInt();
		System.out.println("Enter the number of Column of array");
		int c = sc.nextInt();
		int arr[][] = new int[r][c];
		
		System.out.println("Enter the elemets of matrix :");
		for(int i =0; i<r;i++)
		for(int j=0;j<c;j++)
			arr[i][j] = sc.nextInt();
		
		System.out.println("Transpose matrix is : ");
		
		int j;
		for(int i = 0;i<c;i++)
		{
			for(j=0;j<r;j++)
			{
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
	}
}
