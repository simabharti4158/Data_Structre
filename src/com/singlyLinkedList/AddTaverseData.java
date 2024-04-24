package com.singlyLinkedList;

import java.util.Scanner;

public class AddTaverseData {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		Node head=null,tail=null;
		//create node
		boolean repeat=true;
		while(repeat)
		{
			Node n= new Node();
			System.out.println("Created Node Succsfull ---------------------");
			System.out.println("''''''''''''''''''''''''''''");
			
			System.out.println("Enter the data into node ");
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
		 System.out.println("do you want to insert the into node \n1.yes\n2.No");
		 int choice=sc.nextInt();
		 if(choice==1)
		 {
			repeat=true; 
		 }
		 else {
			 repeat=false;
		 }
		}
		//taversing 
		
		System.out.println("Display the data after traversing  -------------------");
		Node temp=null;
		temp=head;
		int count =0;
		int nodeNum=1;
		while(temp!=null)
		{
			System.out.println("-------------------"+nodeNum+" node inserted -------------------");
			System.out.println("This is data of "+nodeNum+" Node :  "+temp.data);
			temp=temp.adnextNode;
			count++;
			System.out.println("This is address of node : "+temp);
			nodeNum++;
		}
		System.out.println("Total number of node in LinkedList : "+count);
		
		// insert the elements at beging ==================================
	   Node n= new Node();
	   System.out.println("Enter the data to insert the elements at begging ");
	   n.data=sc.nextInt();
	   n.adnextNode=head;
	   head=n;
	   ///////////////////////////////////////////////////////////////////////////////////
	   temp=head;
	   nodeNum=0;  // initailaze again to count the no of node 
	   count=0;
	   while(temp!=null)
		{
			System.out.println("-------------------"+nodeNum+" node inserted -------------------");
			System.out.println("This is data of "+nodeNum+" Node :  "+temp.data);
			temp=temp.adnextNode;
			count++;
			System.out.println("This is address of node : "+temp);
			nodeNum++;
		}
		System.out.println("Total number of node in LinkedList : "+count);
	
	   
	   ///////////////////////////////////////////////////////////////////////////////////
	}

}
