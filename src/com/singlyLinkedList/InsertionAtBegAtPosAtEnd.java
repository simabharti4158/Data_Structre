package com.singlyLinkedList;

import java.util.Scanner;

public class InsertionAtBegAtPosAtEnd {

	public static void main(String[] args) {
	
		
		Scanner sc= new Scanner(System.in);
		Node head=null,tail=null,temp=null;
		boolean repeat=true;
		while(repeat)
		{
			Node n=new Node();
			System.out.println("Enter the Data");
			if(head==null)
			{
				head=n;
				tail=n;
			}
			else {
				tail.adnextNode=n;
				tail=n;
			}
			System.out.println("do you want to insert the data\n1\n2");
			int choice=sc.nextInt();
			if(choice==1)
			{
				repeat=true;
			}
			else {
	 			repeat=false;
			}
			}
			// traversing
			System.out.println("before deletion : ");
			temp=head;
			int count=0;
			System.out.println("element present in the node");
			while(temp!=null)
			{
				System.out.println(temp.data);
				count++;
				temp=temp.adnextNode;
				
			}
			System.out.println("number of node : "+count);
		}

	}


