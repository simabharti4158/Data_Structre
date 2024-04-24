package com.queqeUsingArray;

import java.util.Scanner;

public class QueqeUsingArray 
{
    static int size;
    static int  front=-1,rear=-1;
    static int queue[];
    static Scanner sc = new Scanner(System.in);
    
    public static void enqueue(int data) {
		 if(rear==size-1)
		 {
			 System.out.println("Queue is full");
			 
		 }
		 else if( front==-1 && rear==-1)
		 {
			 front=rear=0;
			 queue[rear]=data;
			 System.out.println(data+" inserted at "+rear+"index");
			 
		 }
		 else {
			 rear++;
			 queue[rear]=data;
			 System.out.println(data+" inserted at "+rear+"index");
		 }
	}
    
    public static void dequeue() {
    	if(front==-1 && rear==-1)
    	{
    		System.out.println("Queue is empty");
    	}
    	else if(front==rear)
    	{
    		System.out.println("Deleted data from"+front+" is : queue ");
    	 front=rear=-1;
    	}
    	else {
    		System.out.println("deleted data from "+front+" is : queue");
    	}
		
	}
    public static void display() 
    {
	  if(front==-1 && rear==-1)
	  {
		  System.out.println("queue is empty");
	  }
	  else {
		  System.out.println("elmemnts present in the queue are :  ");
	    System.out.println("''''''''''''''''''''''''''''");
	    for(int i=front;i<=rear;i++)
	    {
	    	System.out.println(queue[i]);
	    }
	  }
	}
    public static void peek() {
		 if(front==-1 && rear==-1)
		 {
			 System.out.println("queue is empty");
		 }
	}
    public static void isFull() {
		if(rear==size-1)
		{
			System.out.println("Queue is full");
		}
		
	}
    
     public static void searching() {
		 if(front==-1 && rear==-1)
		 {
			 System.out.println("Queue is empty");
			 
		 }
		 else {
			 
		 }
	}
    
     public static void main(String[] args) {
		boolean repeat=true;
		while(repeat)
		{
			System.out.println("''''''''''''''''''''''''''''''''");
			System.out.println("1.creation\n2.Insertion\n3.deletion\n4.display\n5.peek\n6.isEmpty\n7.isFull\n8.searching\n9.exit");
			System.out.println("''''''''''''''''''''''''''''''''");
			System.out.println("Enter the choice");
			System.out.println("''''''''''''''''''''''''''''''");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
                 if(queue==null)
                 {
                	 System.out.println("enter the size");
                	 size=sc.nextInt();
                	 queue=new int [size];
                	 System.out.println("que uing array created");
                	 
                 }
                 else {
                	 
                 }
			case 4:
			{
				if(queue==null)
				{
					System.out.println("Creted using array");
				}
			}
			}
		}
	}
    
    
    
}
