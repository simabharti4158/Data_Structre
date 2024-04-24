package com.stckUsingLinkedList;

import java.util.Scanner;

public class StackUsingLinkedList {

	static Node top,temp;
	static Scanner s= new Scanner(System.in);
	
	public static void pop()
	{
	 if(top==null)
	 {
		 System.out.println("stack is empty");
		 
	 }
	 else {
		 System.out.println("Deleted data is : "+top.data);
		 top=top.adnextNode;
	 }
	}
	public static void display() 
	{
		if(top==null)
		{
			System.out.println("Stack is empty");
			
		}
		else {
			System.out.println("Elements present in the stack are : ");
			System.out.println("''''''''''''''''''''''''''''");
			temp=top;
			while(temp!=null)
			{
				System.out.println(temp.data);
				temp=temp.adnextNode;
			}
		}
	}
	public static void peek()
	{
	 if(top==null)
	 {
		 System.out.println("Stack is empty");
	 }
	 else {
		 System.out.println("Top most data is : "+ top.data+" ");
	 }
	}
	public static void main(String[] args) {
	

	}

}
