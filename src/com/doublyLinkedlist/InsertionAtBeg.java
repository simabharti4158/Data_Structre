package com.doublyLinkedlist;

import java.util.Scanner;

public class InsertionAtBeg {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Node head=null,tail=null,prNode=null,temp=null;
		boolean repeat=true;
		while(repeat)
		{
			Node n=new Node();
			System.out.println("enter the data");
			n.data=sc.nextInt();
			if(head==null)
			{
				head=n;
				tail=n;
				
			}
			else
			{
				 n.adprenode=tail;
	    		 tail.adnextnode=n;
	    		 tail=n;
			}
			System.out.println("you want to insert another node \n1.yes\n2.No");
			int ch=sc.nextInt();
			if(ch==1)
			{
				repeat=true;
			}
			else {
				repeat=false;
			}
		}
		System.out.println("elements present in nodes are  : ");
		System.out.println("''''''''''''''''''''''''''");
		temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.adnextnode;
		}
		////////////////////////// beginning
		Node n=new Node();

		System.out.println("Insertion at beginning");
		System.out.println("'''''''''''''''''''''''''");
	    n.data=sc.nextInt();
		n.adnextnode=head;
		head.adprenode=n;
		head=n;
		
		
		//after insertion
		System.out.println("elements present in nodes after insertion at beg are  : ");
		System.out.println("''''''''''''''''''''''''''");
		temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.adnextnode;
		}
		
		}
	}


