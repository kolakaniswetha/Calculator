package com.onlinecalculator.calculator.maincalc;
import java.util.Scanner;

import com.onlinecalculator.calculator.calctypes.BasicCalc;
import com.onlinecalculator.calculator.calctypes.ScientificCalc;
import com.onlinecalculator.calculator.calctypes.StatisticCalc;
public class MainPgm {
public static void main(String args[])
{
        int type;
        type=disp();
        if(type==1)
        {
         BasicCalc cal=new  BasicCalc();
   		 cal.menu();
   		 cal.userInputs();
   		 cal.performOperation();
        }
        if(type==2)
        {
        	ScientificCalc scal =new ScientificCalc();
      		scal.menu();
      		scal.userInputs();
      		scal.performOperation();
       		
       	}
        	
        	if(type==3)
        	{
        		StatisticCalc scal=new StatisticCalc();
        		scal.menu();
         		scal.userInputs();
         		scal.performOperation();
        	}
}

        
    static int disp()
    {
    	int ch;
    	Scanner s=new Scanner(System.in);
    	System.out.println("************************Calculator*************************************");
    	System.out.println("************************1.Basic Calculator*************************************");
    	System.out.println("************************2.Scientific Calculator*************************************");
    	System.out.println("***********************3.Statistical Calculator*************************************");
    	System.out.println("*************************************************************");
    	System.out.println("please enter any option");
    	ch=s.nextInt();
    	return(ch);
    }
}
