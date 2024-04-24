package com.dataStructure;

import java.util.Arrays;
import java.util.Scanner;

public class DeletionData {
	
	public static void deletion(int a[] ,int pos)
	{
		
		int size=a.length;
		
		if(pos>0 && pos<=size)
		{
			 for(int i=pos-1;i<size-1;i++)
			 {
				 a[i]=a[i+1];
			 }
			 size--;
			 System.out.println("after deletion of array ");
			 for(int i=0;i<size;i++)
			 {
				 System.out.println(a[i]);
			 }
		
		}
		else {
			System.out.println("invalid choice");
		}
	}

	public static void main(String[] args) {
	
		Scanner s= new Scanner(System.in);
		   System.out.println("Enter the size -----------");
		    int size=s.nextInt();
		    
		    int a[]=new int[size];
		    System.out.println("Enter the element-------------");
		    for(int i=0;i<size;i++)
		    {
		    	a[i]=s.nextInt();
		    }
		    System.out.println("Array elements are --------");
		    for(int i=0;i<size-1;i++)
		    {
		    	System.out.println(Arrays.toString(a));
		    }
		    System.out.println("enter the postion '''''''''''");
		    int pos=s.nextInt();
     	    deletion(a, pos);
		
		

	}

}
