package com.sahil.java.InterviewQuestion;

public class Inheritance {

	public void show()

	{
		System.out.println("in parent class...");
	}
	
}

class child extends Inheritance {
	
	public void show()

	{
		System.out.println("in child class...");
	}
	
public static void main(String[] args) {
	Inheritance p1 =  new Inheritance();
	//Inheritance p2 =  new child();
	//child c =  new Inheritance();
	//if I do not have show method in my parent class and then this
	//Inheritance i =  new child(); we will get CE error we have to hhave show() in our parent
	p1.show();
	
}
	
	
	
}