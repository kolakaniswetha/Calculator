package com.onlinecalculator.calculator.calctypes;
import java.util.Scanner;

 public class BasicCalc				
 {
	public int  a,b,c,ch,res;

	 
	 public BasicCalc()
{
		 a=0;
		 b=0;
		 c=0;
		 ch=0;
		 res=0;
 }
	
	public void menu()
        {
		System.out.println("1.addition");
		System.out.println("2.substraction");
		System.out.println("3.mul");
		System.out.println("4.div");
		System.out.println("enter your chioce");
		Scanner s=new Scanner(System.in);
		ch=s.nextInt();
		
		
        }
	
	public void userInputs()
        {
    	Scanner s=new Scanner(System.in);
    	System.out.println("enter first num");
    	a=s.nextInt();
        System.out.println("enter second num");
    	b=s.nextInt();
    	   
	}
	
    public void performOperation()
    {
    	
    switch(ch)
    {
    case 1:
    	System.out.println("addition");
    	res=add();
    	System.out.println("res" +res);
    	break;
    case 2:
    	System.out.println("substraction");
    	res=subtract();
    	System.out.println("res"+res);
    	break;
    case 3:
    	System.out.println("mul");
    	res=multiply();
    	System.out.println("res"+res);
    	break;
    case 4:
    	System.out.println("div");
    	res=divide();
    	System.out.println("res"+res);
    	break;
    	
    }
    
    }

    int add()
	
    {	
	res=a+b;
	return res;
	
    }
	
	int  subtract()
	{
		res=a-b;
		return res;
		
	}
	
	int multiply()
	{
		res=a*b;
		return res;
	}
		
	int divide()
	{
	res=a/b;
	return res;
	}
	
}
