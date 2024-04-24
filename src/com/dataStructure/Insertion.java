package com.dataStructure;

import java.util.Scanner;

public class Insertion {

	public static void main(String[] args) {
	
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter the Array size");
		 int size=sc.nextInt();
		 int a[]=new int[size+1];
		 // user insert the data
		 System.out.println("User enter the arrays elements :------------");
		 for(int i=0;i<=size-1;i++)
		 {
			 a[i]=sc.nextInt();
		 }
		 System.out.println("Arrays elements are :     ");
		 System.out.println("''''''''''''''''''''''''''''''''''''''''''''");
		 for(int i=0;i<size;i++)
		 {
			 System.out.print(" "+a[i]);
		 }
		 System.out.println();
//		 int a[]=new int[size+1];
		 // insert the data at specifice postion
		 System.out.println("Enter the postion :--------------- ");
		 int pos=sc.nextInt();
		 System.out.println("enter the elements which you want to insert ");
		int element=sc.nextInt();
		for(int i=size-1;i>=pos-1;i--)
		{
			a[i+1]=a[i];
		}
		a[pos-1]=element;
		size++;
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}

	}

}
