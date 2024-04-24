package com.singlyLinkedList;

import java.util.Scanner;

public class SearchingOpetion {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Node head=null,tail=null,temp=null;
		boolean repeat=true;
		while(repeat)
		{
			Node n=new Node();
			System.out.println("Enter the data ");
			n.data=sc.nextInt();
			if(head==null)
			{
				head=n;
				tail=n;
				
			}
			else {
				tail.adnextNode=n;
				tail=n;
			}
			System.out.println("Do you Want to insert the another data in linkedList \n1.yes\n2.noo ");
			int ch=sc.nextInt();
			if(ch==1)
			{
				repeat=true;
			}
			else {
				repeat=false;
			}
		}
		
       //		traversing 
		System.out.println(" -----------------Display the data -----------");
		temp=head;
		int count=0;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.adnextNode;
			count++;
		}
		System.out.println("Total Number of Node : "+count);
		
		// searching operation 
		
		 System.out.println("------------Searching Operation----------------");
       
		 System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||");
		 System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||");
		 System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||");
		 boolean search=true;
		 while(search)
		 {
			 System.out.println("Enter the searching element :   ");
			 int element=sc.nextInt();
			 temp=head;
			 boolean ele_found=false;
			 
			 while(temp!=null)
			 {
				 if(temp.data==element)
				 {
					 ele_found=true;
					 break;
				 }
				 temp=temp.adnextNode;
			 }
			 if(ele_found)
			 {
				 System.out.println( element+ " Element founded means present in linkedList ************************");
			 }
			 else {
				 System.out.println(element +" Element not founded means no present in LinkedList  ~~~~~~~~~~~~~~~~~~~~~~~");
			 }
			 System.out.println("You want to search another element : \n1.yes\n2.no");
			 int ch=sc.nextInt();
			 if(ch==1)
			 {
				 search=true;
			 }
			 else {
				 search=false;
			 }
			 
			 
		 }
	}

}
