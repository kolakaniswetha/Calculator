package com.onlinecalculator.calculator.calctypes;
import java.util.Scanner;

 class Calc1
 {
	 float a,b,c,res;
	 
	 public Calc1()
{
		 a=0;
		 b=0;
		 c=0;
		 res=0;
 }
	
	public float menu()
        {
		System.out.println("1.addition");
		System.out.println("2.substraction");
		System.out.println("3.mul");
		System.out.println("4.div");
		System.out.println("enter your chioce");
		Scanner s=new Scanner(System.in);
		a=s.nextFloat();
		return 0;
		
        }
	
	public void userInputs()
        {
    	Scanner s=new Scanner(System.in);
    	System.out.println("enter first num");
    	a=s.nextFloat();
        System.out.println("enter second num");
    	b=s.nextFloat();
    	   
	}
	
    public void performOperation()
    {
    	
    switch()
    {
    case 1:
    	System.out.println("addition");
    	res=add();
    	System.out.println("res"+res);
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

    float add()
	
    {	
	c=a+b;
	return c;
	
    }
	
	float subtract()
	{
		c=a-b;
		return c;
		
	}
	
	float multiply()
	{
		c=a*b;
		return c;
	}
		
	float divide()
	{
	c=a/b;
	return c;
	}
	
}
 public class BasicCalc
 {
	 public static void main(String arg[])
	 {
		 Calc1 c=new Calc1();
		 c.menu();
		 c.userInputs();
		 c.performOperation();
		 
	 }
 
	 }
 