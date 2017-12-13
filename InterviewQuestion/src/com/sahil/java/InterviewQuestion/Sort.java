package com.sahil.java.InterviewQuestion;

import java.util.Arrays;

//You can also use sort method of Arrays class to sort integers in ascending order 
//but remember that sort method uses a variation of Quick sort algorithm


class Sort
{
  public static void main(String args[])
  {
    int data[] = { 4, -5, 2, 6, 1 };
 
    Arrays.sort(data);
 
    for (int c: data) 
    {
      System.out.println(c);
    }
  }
}

