package com.sahil.java.InterviewQuestion;

import java.util.Arrays;

public class ArraySorting 
{
	int i=0;
	static int arr[];
	
	 ArraySorting(int n)
		{
		 	this.arr = new int[n];
		}
	 public void insert(int Data)
	 {
		 this.arr[++i] = Data;
	 }
	 
	public void checkOrder(){
		 Arrays.sort(arr);
	 }
	 
	 public static void main(String[] args) 
	 {
		ArraySorting f = new ArraySorting(6);
		f.insert(-1);
		f.insert(4);
		f.insert(33);
		f.insert(-5);
		f.insert(11);
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(arr[i]);
		}
	
		f.checkOrder();
		System.out.println("After sorting the elements see this asending...uh just have to use Arrays.sort() and pass your array object");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	 }
}
