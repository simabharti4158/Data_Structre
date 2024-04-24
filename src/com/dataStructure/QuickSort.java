package com.dataStructure;

import java.util.Scanner;

public class QuickSort {
	
	   public static int partition ( int a[] , int least_index , int highest_index) 
	   {
		 int start;
		 int end;
		 start=least_index;
		 end=highest_index;
		 
		 int pivot;
		 pivot=a[least_index];
		 while(start<end)
		 {
			 while(a[start]<=pivot && start<a.length-1)
			 {
				 start++;
			 }
			 while(a[end]>pivot && end>=0)
			 {
				 end--;
			 }
			 if(start<end)
			 {
				 int temp=a[start];
				 a[start]=a[end];
				 a[end]=temp;
			 }
		 }
		 int temp=a[least_index];
		 a[least_index]=a[end];
		 a[end]=temp;
		 return end;
	  }
	   public static void quickSort( int a[] , int least_index , int high_index)
	   {
		 if(least_index<high_index)
		 {
			 int end =partition(a, least_index, high_index);
			 quickSort(a, least_index, end-1);
			 quickSort(a, end+1, high_index);
			 
		 }
    	}

	public static void main(String[] args) 
	{
          Scanner sc=new Scanner(System.in);
          int size;
          System.out.println("enter the array size");
          size=sc.nextInt();
          int a[]=new int[size];
          System.out.println("enter the array elements");
          for(int i=0;i<size;i++)
          {
        	  a[i]=sc.nextInt();
          }
          System.out.println("befor sorting ''''''''''''''''''''''''''''''''''''''''''''");
		  for(int i=0;i<size;i++)
		  {
			System.out.println(" "+a[i]);  
		  }
		  quickSort(a,0,size-1);
		  System.out.println("After sorting ----------------------------------");
		  for(int i=0;i<size;i++)
		  {
			System.out.print(" "+a[i]);  
		  }
		
	}

}
