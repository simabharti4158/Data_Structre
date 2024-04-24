package com.doublyLinkedlist;

import java.util.Scanner;

public class CreationAndDeletionAtBeg {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		Node head=null,tail=null,temp=null;
		boolean repeat =true;
		while(repeat)
		{
			Node n= new Node();
			System.out.println("Enter the data");
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
			System.out.println("do you want to insert another elements \n1.yes\n2.No");
			int ch=sc.nextInt();
			if(ch==1)
			{
				repeat=true;
				
			}
			else {
				repeat=false;
			}
			
		}
		System.out.println("''''''''''''''''''''''''");
		System.out.println("Display the data ");
		System.out.println("'''''''''''''''");
		temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.adnextnode;
		}
         head=head.adnextnode;
         head.adprenode=null;
         System.out.println("after deleting at node ");
         System.out.println("elements present in nodes are :");
         
         temp=head;
 		while(temp!=null)
 		{
 			System.out.println(temp.data);
 			temp=temp.adnextnode;
 		}
	}

}
