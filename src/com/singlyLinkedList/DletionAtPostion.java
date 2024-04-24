package com.singlyLinkedList;

import java.util.Scanner;

public class DletionAtPostion {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Node head=null,tail=null,temp=null;
		 boolean repeat=true;
		 while(repeat)
		 {
			 Node n=new Node();
			
			 System.out.println("Enter the data ");
			 n.data=sc.nextInt();
			 if(head==null)
			 {
				 head=n;
				 tail=n;
				 
			 }
			 else 
			 {
				tail.adnextNode=n;
				tail=n;
			 }
			 System.out.println("Do ypu want to insert data into node \n1.yesssssss\n2.Noooooo");
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
		 System.out.println("==============Display the data ======================");
		 temp=head;
		 int count=0;
		 while(temp!=null)
		 {
			 System.out.print(temp.data+"  ");
			 temp=temp.adnextNode;
			 count++; 
		 }
		 System.out.println();
		 System.out.println("Total number of node before Deletion :  "+count);
		 
		 // Deletion Operation
		 
		 Node preNode=null;
		 boolean repeat2=true;
		 System.out.println("''''''''''''''''''Deletion Operation Performed'''''''''''''''''''' ");
		 
		 while(repeat2)
		 {
			 System.out.println("Enter the postion to Delete the Data At specific postion ");
			 int pos=sc.nextInt();
			 if(pos>0 && pos<=count)
			 {
				 if(pos==1)
				 {
					 System.out.println("  1st node delete");
					 head=head.adnextNode;
				 }
				 else 
				 {
					 System.out.println(" delete the data at specific postion  ");
					 temp=head;
					 for(int i=1;i<pos;i++)
					 {
						 preNode=temp;
						 temp=temp.adnextNode;
					 }
					 preNode.adnextNode=temp.adnextNode;
				 }
				 System.out.println("Data has been deleted succssfully ");
			 }
			 else {
				 System.out.println("invalid postion");
			 }
			 
			 System.out.println("Do you want delete data again \n1.yes\n2.no");
			 int choice=sc.nextInt();
			 if(choice==1)
			 {
				 repeat2=true;
			 }
			 else {
				 repeat2=false;
			 }
	   	 }
		 
		 //traversing
		 // traversing
		 System.out.println("==============Display the data after deletion ======================");
		 temp=head;
		  count=0;
		 while(temp!=null)
		 {
			 System.out.print(temp.data+"  ");
			 temp=temp.adnextNode;
			 count++; 
		 }
		 System.out.println();
		 System.out.println("total number of node after deletetion  "+count);
		 
		 

	}

}
