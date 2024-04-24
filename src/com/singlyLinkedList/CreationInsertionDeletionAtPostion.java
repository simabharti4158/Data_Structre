package com.singlyLinkedList;

import java.util.Scanner;

public class CreationInsertionDeletionAtPostion {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Node head=null,tail=null,temp=null;
		boolean repeate=true;
		while(repeate)
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
				tail.adnextNode=n;
				tail=n;
			}
			System.out.println("");
		}

	}

}
