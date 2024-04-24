package com.dataStructure;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		int size;
		System.out.println("Enter the size");
		size=scanner.nextInt();
		// create the array based on size
		int a[]=new int[size];
		System.out.println("nter the array element");
		System.out.println("============");
		//read element from user 
		for(int i=0;i<=size-1;i++)
		{
			a[i]=scanner.nextInt();
		}
		System.out.println("Array elemnts are:");
		System.out.println("'''''''''''''");
		for(int i=0;i<size-1;i++)
		{
			System.out.println("at index "+i+" the data : "+a[i]);
		}

	}

}
