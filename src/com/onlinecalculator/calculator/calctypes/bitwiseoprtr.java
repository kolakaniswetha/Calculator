package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;

public class bitwiseoprtr {
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
	System.out.println("bitwiseand"+(a&b));
	System.out.println("bitwiseor"+(a|b));
	System.out.println("bitwiseexclusiveor"+(a^b));
	}
	public static void main(String args[])
	{
		bitwiseoprtr s1=new bitwiseoprtr();
		s1.userinputs();
		s1.display();
	

	
	
}


}








