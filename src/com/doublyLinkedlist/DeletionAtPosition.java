package com.doublyLinkedlist;

import java.util.Scanner;

public class DeletionAtPosition 
{
  public static void main(String[] args)
    {
	 Scanner sc =new Scanner(System.in);
	 Node head=null,tail=null,temp=null;
	 boolean repeat=true;
	 while(repeat)
	 {
		 Node n = new Node();
		 System.out.println("Enter the data");
		 n.data=sc.nextInt();
		 if(head==null)
		 {
			 head=n;
			 tail=n;
		 }
		 n.adprenode=tail;
		 tail.adnextnode=n;
		 tail=n;
		 
		 System.out.println("do you want to add another elements \n1.yes\n2.No");
		 int ch=sc.nextInt();
		 if(ch==1) 
		 {
			 repeat=true;
		 }
		 else {
			 repeat=false;
		 }
	 }
	 // taraversing
	 System.out.println("Node present in Linked list are : ");
	 temp=head;
	 int count=0;
	 while(temp!=null)
	 {
		 System.out.println(temp.data);
		 temp=temp.adnextnode;
		 count++;
		
	 }
	 System.out.println("Total number of node "+count);
	 
	 /// deletion at postion
	 boolean det_pos=true;
	 while(det_pos)
	 {
		 count=0;
		 System.out.println("Give the postion to delete the data ");
		 System.out.println("'''''''''''''''''''''''''''''''''''''''''''''");
		 int pos=sc.nextInt();
		 if(pos>0 && pos<=count)
		 {
			 if(pos==1)
			 {
				 if(head==tail)
				 {
					head=head.adnextnode;
					tail=tail.adnextnode;
				 }
				 else {
				 head=head.adnextnode;
				 head.adprenode=null;
				 }
				 System.out.println("node deleted successfull from beginning");
				System.out.println("Total number of node "+count);
				 System.out.println("'''''''''''''''''''''''''''''''''''''''''");
			 }
			 else if(pos==count)
			 {
				 
				 tail=tail.adprenode;
				 tail.adnextnode=null;
				 System.out.println("Node deleted from end successfully ");
				 System.out.println("Total number of node "+count);

				 System.out.println("'''''''''''''''''''''''''''''''''''''''''");
			 }
			 else
			 {
				 int i=1;
				 Node preNode=null,nextNode=null;
				 temp=head;
				
				 while(i<pos)
				 {
					 preNode=temp;
					 temp=temp.adnextnode;
					 nextNode=temp.adnextnode;
					 i++;
				 }
				 preNode.adnextnode=nextNode;
				 nextNode.adprenode=preNode;
				
				 System.out.println("Node deleted at postition seccessfully");
				 System.out.println("Total number of node "+count);

				 System.out.println("'''''''''''''''''''''''''''''''''''''''''");
			 }
          } 
		 else {
			 System.out.println("invalid postion");
		 }
		 System.out.println("Do you want to delete anothe node \n1.yes\n2.No");
		 int delete =sc.nextInt();
		 if(delete==1)
		 {
			 det_pos=true;
		 }
		 else {
			 det_pos=false;
		 }
//	 }
	
	 
	//traversing
	 
	 System.out.println("Node present in Linked list are : ");
	 if(head==null && tail==null)
	 {
		 System.out.println("No node in list ");
		 break;
	 }
	 temp=head;
	 count=0;
	 while(temp!=null)
	 {
		 System.out.println(temp.data);
		 temp=temp.adnextnode;
		 count++;
	 }
	 System.out.println("Total number of node "+count);
	 } 
	 
    }
}
