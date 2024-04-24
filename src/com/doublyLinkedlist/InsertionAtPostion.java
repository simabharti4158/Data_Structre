package com.doublyLinkedlist;

import java.util.Scanner;

public class InsertionAtPostion {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		Node head=null,tail=null,preNode=null,temp=null;
		boolean repeat=true;
		while(repeat)
		{
			Node n=new Node();
			System.out.println("Enter the data");
			n.data=sc.nextInt();
			if(head==null)
			{
				tail=head=n;
				
			}
			else {
				n.adprenode=tail;
				tail.adnextnode=n;
				tail=n;
			}
			System.out.println("Do you want add another elements \n1.ysss\n2.No: ");
			int ch=sc.nextInt();
			if(ch==1)
			{
				repeat=true;
			}
			else {
				repeat=false;
			}
		}
		//travesring
		System.out.println("'''''''''''''''''''''''");
		System.out.println("Display the data before insertion at postion");
		temp=head;
		int count=0;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.adnextnode;
			count++;
		}
		System.out.println("Total number of Node "+count);

		System.out.println("'''''''''''''''''''''''''''");
		System.out.println("enter the postion");
		int pos=sc.nextInt();
		temp=head;
		int i=1;
		Node n=new Node();
		System.out.println("enter the data ");
	    n.data=sc.nextInt();
		
		while(i<pos)
		{
			preNode=temp;
			temp=temp.adnextnode;
			i++;
		}
		n.adprenode=preNode;
		preNode.adnextnode=n;
		n.adnextnode=temp;
		temp.adprenode=n;
		
		//traversing 
		System.out.println("Display the data before insertion at postion");
		temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.adnextnode;
		}
		
	
		
	}

}
