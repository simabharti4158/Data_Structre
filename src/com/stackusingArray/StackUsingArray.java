package com.stackusingArray;

import java.util.Scanner;
import java.util.Stack;

public class StackUsingArray {
	
	static int stack[];
	static int top=-1;
	static int size;
	
   public static void push(int data)
   {
	 if(top==size-1)
	 {
		 System.out.println("Stack is overflow ");
	 }
	 else {
		 top++;
		 stack[top]=data;
		 System.out.println(data +"  inserted at index "+top+"  successfully");
	 }
   }
   public static void pop() 
   {
	  if(top==-1)
	  {
		  System.out.println("stack unserflow");
	  }
	  else {
		  System.out.println("Deleted data is : "+stack[top]);
		  top--;
	  }
   }
   public static void display() 
   {
	 if(top==-1)
	 {
		 System.out.println("Stack underflow ");
	 }
	 else {
		 System.out.println("element present in the stack using array are : ");
		 for(int i=top;i>=0;i--)
		 {
			 System.out.println(stack[i]);
		 }
	 }
   }
   public static void peek()
   {
	 if(top==-1)
	 {
		 System.out.println("stack is empty/underflow");
	 }
	 else {
		 System.out.println("the top most data in the stack is : "+stack[top]);
	 }
   }
   public static void isEmpty()
   {
	 if(top==-1)
	 {
		 System.out.println("Stack is empty");
	 }
	 else {
		 System.out.println("stack is not empty you can perform operations"); 
	 }
    }
   public static void isFull()
   {
	if(top==size-1)
	{
		System.out.println("stack using array is full");
	}
	else {
		System.out.println("Stack is not full you can perform Operations");
	}
}
   public static void search()
   {
	 if(top==-1)
	 {
		 System.out.println("Stack underflow");
		 
	 }
	 else {
		 System.out.println("enter the element to search");
		 Scanner s=new Scanner(System.in);
		int ele=s.nextInt();
		 boolean ele_found=false;
		 for(int i=top;i>=0;i--)
		 {
			 if(stack[i]==ele)
			 {
				 ele_found=true;
				 break;
			 }
		 }
		 if(ele_found)
		 {
			System.out.println("element found"); 
		 }
		 else {
			 System.out.println("Element not found");
		 }
	 }
}
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 boolean repeat=true;
		 while(repeat)
		 {
			 System.out.println("'''''''''''''''''''''''''''''''''''''''''''''");
			 System.out.println("1.Creation\n2.Insertion\n3.Deletion\n4.Dispaly\n5.Top_most_Data"
			 		+ "\6.isEmpty\n7.isFull\n8.search\n9.Exit");
			 System.out.println("'''''''''''''''''''''''''''''''''''''''''");
			 System.out.println("Enter the choice");
			 System.out.println("''''''''''''''''''''''''''''''''");
			 int ch= sc.nextInt();
			 switch(ch)
			 {
			 case 1:
				 if(stack==null)
				 {
					 System.out.println("Enter the size ");
					 size=sc.nextInt();
					 stack=new int[size];
					 System.out.println("Stack using array created");
				 }
				 else {
					 System.out.println("stack using array is already created ");
				 }
				 break;
			 case 2:
				 if(stack==null)
				 {
					 System.out.println("Create stack using array");
				 }
				 else {
					 System.out.println("Enter the element to inserte into stack");
					 int data=sc.nextInt();
					 push(data);
					 {
						 
					 }
				 }
				 break;
			 case 3:
				 if(stack==null)
				 {
					 System.out.println("create stack using array");
				 }
				 else {
					 pop();
				 }
				 break;
			 case 4:
				 if(stack==null)
				 {
					 System.out.println("Create stack using array ");
				 }
				 else {
					 display();
				 }
				 break;
				
			 case 5:
				 if(stack ==null)
				 {
					 System.out.println("Create stack using array");
				 }
				 else {
					 peek();
					 
				 }
				 break;
				 
			 case 6:
				 if(stack==null)
				 {
					 System.out.println("create stack using array");
				 }
				 else {
					 isEmpty();
				 }
				 break;
			 case 7:
				 if(stack ==null)
				 {
					 System.out.println("create stack using array");
				 }
				 else {
					 isFull();
				 }
				 break;
			 case 8:
				 if(stack==null) {
				 System.out.println();
				 }
				 else {
					 search();
				 }
				 break;
			 case 9:
				 System.out.println("create stack using array");
				 repeat=false;
				 break;
				 default:
					 System.out.println("Enter the valid choice");
			 }
		 }

	}

}
