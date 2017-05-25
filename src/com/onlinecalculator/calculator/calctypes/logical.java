package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;

public class logical
{
	
	boolean a,b;
	void userinputs()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first num");
	a=sc.nextBoolean();
	System.out.println("enter secnd num");
	b=sc.nextBoolean();
	}
	void display()
	{
	System.out.println("logicaland"+(a&&b));
	System.out.println("logicalor"+(a||b));
	System.out.println("logicalnot"+(a!=b));
	}
	public static void main(String args[])
	{
		logical s1=new logical();
		s1.userinputs();
		s1.display();
	

	
	
}


}

