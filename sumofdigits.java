import java.io.*;
import  java.util.*;
import java.lang.Math;


class sod
{ 
static int digitSum(int input1)
{
		int sum=0;
		int f=0;
		int temp=input1;
		if(input1<0)
		{
	            input1=0-input1;
		    f=1;
		}

		while(input1>0)
		{
		sum=sum+(input1%10);
		input1=input1/10;			
		}
		while(sum>9)
		{
		  input1=sum;
		  sum=0;
	       while(input1>0)
	       {
		      sum=sum+(Math.abs(input1%10));
		      input1=input1/10;			
	        }
		}
		if(f==1)
			return -sum;
		else
			return sum;
}

public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int input1 = sc.nextInt();
int sum = digitSum(input1);
System.out.println("Sum of digits is " + sum);

}
}