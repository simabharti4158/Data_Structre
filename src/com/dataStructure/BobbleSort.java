package com.dataStructure;

import java.util.Scanner;

public class BobbleSort {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int size;
		System.out.println("Enter the Array  size");
		size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the array elements");
		System.out.println("'''''''''''''''''''''''''''''''''");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array elements are ---------------");
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("'''''''''''''''''''''''''''''''''");
		
		int temp;
		for(int i=0;i<size-1;i++)// traversing
		{
			boolean b=false;
			for(int j=0;j<size-1-i;j++) // comparinsion
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					b=true;
				}
			}
			if(b==false)
			{
				break;
			}
			
			
		}
		System.out.println("after Sorting");
		System.out.println("'''''''''''''''''''''''''''''''''''''''''''''");
		for(int i1=0;i1<size;i1++)
		{
			System.out.println(a[i1]);
		}
	
	}

}
