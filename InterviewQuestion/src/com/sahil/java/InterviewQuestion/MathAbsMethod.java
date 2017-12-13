package com.sahil.java.InterviewQuestion;

import java.lang.*;

public class MathAbsMethod {

   public static void main(String[] args) {

   // get some integers to find their absolute values
   int x = -3;
   int y = 2;

   // get and print their absolute values
   System.out.println("Math.abs(" + x + ")=" + Math.abs(x));
   System.out.println("Math.abs(" + y + ")=" + Math.abs(y));
   System.out.println("Math.abs(-0)=" + Math.abs(-0));
   
   System.out.println("----------------------");
   System.out.println(Math.abs(x-y));
   System.out.println(Math.abs(x+y));
   
   }
}