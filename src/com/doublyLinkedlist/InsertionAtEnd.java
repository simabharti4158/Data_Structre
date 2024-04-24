package com.doublyLinkedlist;

import java.util.Scanner;

public class InsertionAtEnd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Node head=null,tail=null,preNode=null,temp=null;
		boolean repeat=true;
		while(repeat)
		{
			Node n= new Node();
			System.out.println("Enter the data ");
			System.out.println("'''''''''''''''''''''''''");
			n.data=sc.nextInt();
			if(head==null)
			{
				head=n;
				tail=n;
			}
			else {
				n.adprenode=tail;
				 tail.adnextnode=n;
	    		 tail=n;
			}
			System.out.println("do you want to add another element in node : \n1.yes\n2.Nooo ");
			int ch=sc.nextInt();
			if(ch==1)
			{
				repeat=true;
			}
			else {
				repeat=false;
			}
			
			
		}
      // traversing
		System.out.println("elemets pesent in Node =======================");
		temp=head;
		while(temp!=null)
		{
		    System.out.println(temp.data);
			temp=temp.adnextnode;
		}
		//Insertion at end 
		Node n=new Node();
		System.out.println("Enter the to insert at the end : ");
		n.data=sc.nextInt();
//		n.adprenode=tail;
//		tail.adnextnode=n;
//		tail=n;
		//////
		n.adprenode=n;
		tail.adnextnode=n;
     	tail=n;
		System.out.println("=====================================");
		System.out.println("Elements after insertion at the end : ");
		System.out.println("'''''''''''''''''''''''''''''''");
		temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.adnextnode;
		}
	}

}
