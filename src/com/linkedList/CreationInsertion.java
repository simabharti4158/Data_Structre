package com.linkedList;

import java.util.Scanner;

public class CreationInsertion {

	public static void main(String[] args) {
		
		System.out.println("creat Node sucssfullllll now you can enter the data ");
		Scanner sc= new Scanner(System.in);
		Node head=null,tail=null,temp=null;
		
		Node n = new Node();
		//insertion
		System.out.println("Enter  the Data ---------");
		n.data=sc.nextInt();
		System.out.println(n);
		if(head==null)
		{
			head=n;
			tail=n;
		}
		else {
			tail.adNextNode=n;
			tail=n;
		}
		// tarversing
		System.out.println("''''''''''''''''''''''''''''''''''''");
		temp=head;
		System.out.println("displying the data --------------------------");
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.adNextNode;
		}
		
		

	}

}
