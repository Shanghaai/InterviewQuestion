package com.sahil.java.InterviewQuestion;

class PalindromeExample
{  
	 public static void main(String args[]){  
	  int r,reverse=0,temp;    
	  int n=2322;//It is the number variable to be checked for palindrome  
	  
	  temp=n;    
	  while(n>0)
	  {    
	   r=n%10;  //getting remainder  4
	   n=n/10; //n=45
	   reverse=(reverse*10)+r;    
	  }    
	  if(temp==reverse)    
	   System.out.println("palindrome number ");    
	  else    
	   System.out.println("not palindrome");    
	}  
	}  