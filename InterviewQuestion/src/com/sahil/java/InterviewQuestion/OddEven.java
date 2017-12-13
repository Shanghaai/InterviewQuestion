package com.sahil.java.InterviewQuestion;

import java.util.Scanner;

class OddEven
{
    public static void main(String args[])
    {
    	int j = 0; int temp; int i;
    	
    	System.out.println("Enter the size of array");
        Scanner in=new Scanner(System.in);

        //Print array
        int n=Integer.parseInt(in.nextLine());
        int a[]= new int[n];

        for(i=0;i<n; i++)
           {
        	//STORING ELEMENTS    
        	System.out.println("Enter the elements of array");
        	a[i] = in.nextInt();
           }
       
       	    //even-odd array
         for(i=0;i<n;i++)
         {
        	 if(a[i]%2==0)
              {
        		System.err.println("Even elements of array are :");
        		System.err.println(a[i]);
              }
        	 else if(a[i]%2!=0)
            {
            	System.err.println("Odd elements of array are :");
            	System.err.println(a[i]);
            }
         }
    }
}