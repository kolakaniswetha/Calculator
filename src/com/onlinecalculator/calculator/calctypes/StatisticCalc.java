package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;
import java.lang.Math;
import java.lang.reflect.Array;
public class StatisticCalc extends BasicCalc{
	double no_array[];
	public void menu()
	{
		System.out.println("1.addition");
		System.out.println("2.substraction");
		System.out.println("3.mul");
		System.out.println("4.div");
		System.out.println("5.math");
	    System.out.println("6.mean");
		System.out.println("7.median");
		System.out.println("8.mode");
		System.out.println("enter your chioce");
		Scanner s=new Scanner(System.in);
		ch=s.nextInt();
		
		
    	
	}

    public void userInputs()
    {
    	Scanner s=new Scanner(System.in);
    	if(ch>=5&& ch<=8)
    		{
    		System.out.println("enter the total no values");
    		int len=s.nextInt();
    		no_array=new double[len];
    		for(int i=0;i<no_array.length;i++)
    				{
    			System.out.println("enter data");
    			no_array[i]=s.nextInt();
    			
    			
    			
    				}
    			
    		}
    	else
    	{
    		System.out.println("enter first num");
    		a=s.nextInt();
			
    		System.out.println("enter second num");
    		b=s.nextInt();
			
    	}
    	
    	
    }

    public void performOperation(){    	
    		switch(ch)
    		{
    		case 1:
      			
      		case 2:
      			
      		case 3:
      			
      		case 4:
      			super.performOperation();
      			break;
      		case 5:System.out.println(mean());
      		break;
      		case 6:System.out.println(median());
      		break;
      		case 7:System.out.println(mode());
      		break;
      		case 8:System.out.println(Math.sqrt(mode()));
      		break;
      		case 9:System.out.println("bye");
      		      System.exit(0);
      		break;
      		default:System.out.println("wrong choice");
      		break;
      		
    		
    	}
       
    }
    
	double mean()
	{
		double sum=0;
		for(int i=0;i<no_array.length;i++)
		{
			sum=no_array[i];
		}
		double meanValue=sum/no_array.length;
				return(meanValue);
		
	}
	
	double median()
	{
		int middle=no_array.length/2;
		if(no_array.length%2==1) {
			double medianValue=no_array[middle];
			return(medianValue);
		}
		
		else {
			double medianValue=(no_array[middle-1]+no_array[middle])/2.0;
			return(medianValue);
		}
			
		}
			
		
	double mode ()
	{
		double modeValue=no_array[0];
		int maxCount=0;
		for(int i=0;i<no_array.length;i++){
			double value=no_array[i];
			int count=1;
			for(int j=0;j<no_array.length;j++){
				count++;
				if(count>maxCount){
					modeValue=value;
					maxCount=count;
					
				}
			}
		}
		return modeValue;
		
	}
}