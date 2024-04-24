package com.dataStructure;

import java.util.Scanner;

public class LinerSearch 
{
	public static void main(String[] args)
	{
		  Scanner sc= new Scanner(System.in);
		  int size;
		  System.out.println("Enter the Array size");
		  size=sc.nextInt();
		  int a[]=new int[size];
		  System.out.println("Enter the array elements");
		  System.out.println("'''''''''''''''''''''''");
		  for(int i=0;i<=size-1;i++)
		  {
			  a[i]=sc.nextInt();
		  }
		  System.out.println("array elements are:===================");
		  for(int i=0;i<=size-1;i++)
		  {
			  System.out.println(a[i]);
		  }
		boolean repeat=true;
		while(repeat)
		{
			  int elements;
			  System.out.println("Enter the searching elements:==========");
			  System.out.println("'''''''''''''''''''''''");
			  elements=sc.nextInt();
			  boolean found=false;
			  for(int i=0;i<size;i++)
			  {
				  if(elements==a[i])
				  {
					System.out.println("elements founded at index: "+i); 
					found=true;
					break;
				  }	  
				  
			  }
			  if(found==false)
			  {
				  System.out.println("Elements not founded:::::::::");
			  }
			  System.out.println("do you want to serch another elements \1.yes\2.No");
			  int choice=sc.nextInt();
			  if(choice==1)
			  {
				repeat=true;  
			  }
			  else {
				System.out.println("thanku ");
				repeat=false;
			}
		}
		}
}
