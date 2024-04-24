package com.doublyLinkedlist;

import java.util.Scanner;

public class DeletionAtEnd {

	public static void main(String[] args) {
		Node head=null,tail=null,temp=null;
		Scanner sc=new Scanner(System.in);
		boolean repeat=true;
		while(repeat)
		{
			Node n=new Node();
			System.out.println("enter the data ");
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
			System.out.println("Do you want to add another data 1.yes || 2.no");
			int ch= sc.nextInt();
			if(ch==1)
			{
				repeat=true;
			}
			else {
				repeat=false;
			}
		}
		System.out.println("Elements prsent in nodes are : ");
		temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.adnextnode;
		}
		
		//deletion at the end 
		tail=tail.adprenode;
		tail.adnextnode=null;
		System.out.println("'''''''''''''''''''''''''''''''");
		System.out.println("Elements prsent in nodes are after deletion at End  : ");
		temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.adnextnode;
		}
		
		

	}

}
