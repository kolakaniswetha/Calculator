package com.onlinecalculator.calculator.calctypes;
import java.util.Scanner;
class abc 
{
	int r=16;
  void display() 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("class variable r="+r);
		r=s.nextInt();
	}
	
}

public class classvariable {
	public static void main(String args[])
	{
		abc s=new abc();
		s.display();
		
	}
	
		


	}


