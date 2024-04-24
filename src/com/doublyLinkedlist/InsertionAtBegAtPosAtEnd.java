package com.doublyLinkedlist;

import java.util.Scanner;

public class InsertionAtBegAtPosAtEnd {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		Node head=null,tail=null,temp=null,preNode=null;
		boolean repeat=true;
		System.out.println("========================Doubly LinkedList  Insertion operation====================");
		while(repeat)
		{
			Node n= new Node();
			System.out.println("Enter the data ");
			n.data=sc.nextInt();
			if(head==null)
			{
				head=n;
				tail=n;
			}
			else{
				n.adprenode=tail;
				tail.adnextnode=n;
				tail=n;
			}
			System.out.println("Do you want to add another Node : \n1.yess\n2.Nooo");
			int ch=sc.nextInt();
			if(ch==1)
			{
				repeat=true;
			}
			else {
				repeat=false;
			}
		}
		
		System.out.println("Elements present in linkedList before Insertion  ");
		System.out.println();
		temp=head;
		int count=0;
		while(temp!=null)
		{
			System.out.print(temp.data+ "  ");
			temp=temp.adnextnode;
			count++;
		}
		System.out.println();
		System.out.println();
		System.out.println("Total Number of Node : "+count);
		//inertion operation
		System.out.println("''''''''''''''''''''''''''''''''''''");
		boolean repeat1=true;
		while(repeat1)
		{
			System.out.println("Enter the position if you want to add the another element into linked list");
			int pos=sc.nextInt();
			int i=1;
			Node n=new Node();
			if(pos>0 && pos<count+1)
			{
				System.out.println("Enter the data ");
				n.data=sc.nextInt();
				if(pos==1)
				{
					n.adnextnode=head;
					head.adprenode=n;
					head=n;
					System.out.println("insert the elements at beg successfully ");
					count++;
					System.out.println("Total number of node : "+count);
				}
				else if(pos==count)
				{
					n.adprenode=tail;
					tail.adnextnode=n;
					tail=n;
					count++;
					System.out.println("data inserted at the end successfully");
					System.out.println("Total Number of node : "+count);
					
				}
				else 
				{
				  temp=head;

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
					count++;
		  System.out.println("Inserted data at the position successfully");
		  System.out.println();
		  System.out.println("Total Number of node : "+count);
				  
				}
			}
			System.out.println("you want to add another elemets : \n1.yes\n2.No");
			int ch=sc.nextInt();
			if(ch==1)
			{
				repeat1=true;
			}
			else {
				repeat1=false;
			}
		}
		
		
		System.out.println("Elements present in linkedList after Insertion are : ================ ");
		temp=head;
		 count=0;
		while(temp!=null)
		{
			System.out.print(temp.data+"  ");
			temp=temp.adnextnode;
			count++;
		}
		System.out.println();
		System.out.println("Total number of node in Doubly linked List are : "+count);
		
		

	}

}
