package com.doublyLinkedlist;

import java.util.Scanner;

public class DoublyLinkedListOperation {

	
	static Node head,tail,temp;
	static Scanner sc= new Scanner(System.in);
	static Node n;
	
	 public static void create()
	 {
	 n=new Node();
	 System.out.println("'''''''''''''''''''''''''''''''''''''''''");
	 System.out.println("Enter the data ");
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
	 System.out.println("Node created successfully.....................");
	 }
	 public static void display()
	 {
		temp=head;
		System.out.println("elements present in the node are : ");
		System.out.println("''''''''''''''''''''''");
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.adnextnode;
		}
	}
	 public static int  count() 
	 {
		 int count =0;
		 temp=head;
		 while(temp!=null) {
			 count++;
			 temp=temp.adnextnode;
		 }
		 System.out.println("count of nodes are: "+count);
		 return count;
	}
	 public static void InsertionAtBeg() {
		 Node n= new Node();
		 System.out.println("Enter the data");
		 n.data=sc.nextInt();
		 n.adnextnode=head;
		 head.adprenode=n;
		 head=n;
		 System.out.println("node inserted at begg");
		 
	}
	 public static void InsertionAtEnd() {
		 n=new Node();
		 System.out.println("Enter the data");
		 n.data=sc.nextInt();
		 n.adprenode=tail;
		 tail.adnextnode=n;
		 tail=n;
		 System.out.println("node insert at end");
		
	}
	 public static void InsertAtPosition(int pos) {
		 Node n= new Node();
		 System.out.println("Enter the daata ");
		 n.data=sc.nextInt();
		 temp=head;
		 Node preNode=null;
		 int i=1;
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
		 System.out.println("Inserted at postion");
		
		
	}
	 public static void deletionAtBeg() 
	 {
		System.out.println("Deleted data is : "+head.data);
		head=head.adnextnode;
		head.adprenode=null;
		System.out.println("Node deleted at beg successfully ");
		 
	 }
	 public static void deletionAtEnd()
	 {
		 System.out.println("deleted data is : "+tail.data);
		 tail=tail.adprenode;
		 tail.adnextnode=null;
		 System.out.println("Node deleted at end successfully ");
	 }
	 public static void deletionAtPosition(int pos)
	 {
		 temp=head;
		 Node prNode=null,nextNode=null;
		 int i=0;
		 while(i<pos)
		 {
			 prNode=temp;
			 temp=temp.adnextnode;
			 nextNode=temp.adnextnode;
			 i++;
			 
		 }
		 System.out.println("deleted data is : "+temp.data);
		 prNode.adnextnode=nextNode;
		 nextNode.adprenode=prNode;
		 System.out.println("Node deleted at position successfully ");
		 
	 }
	 public static void searching()
	 {
		 System.out.println("enter the element to search ");
		 int ele=sc.nextInt();
		 temp=head;
		 boolean ele_found=false;
		 while(temp!=null)
		 {
			 if(temp.data==ele)
			 {
				 ele_found=true;
				 break;
			 }
			 temp=temp.adnextnode;
		 }
		 if(ele_found)
		 {
			 System.out.println("Element found");
			 
		 }
		 else {
			 System.out.println("element not found");
		 }
	 }
	 public static void sorting()
	 {
		 temp=head;
		 Node nextNode=null;
		 while(temp !=null)
		 {
			 nextNode=temp.adnextnode;
			 while(nextNode !=null)
			 {
				 if(temp.data > nextNode.data)
				 {
					 int swap=temp.data;
					 temp.data=nextNode.data;
					 nextNode.data=swap;
				 }
				nextNode=nextNode.adnextnode; 
			 }
			 temp=temp.adnextnode;
		 }
	}
	public static void main(String[] args) {
	  boolean repeat=true;
	  while(repeat)
	  {
		  System.out.println("''''''''''''''''''''''''''''''''''''''''''''");
		  System.out.println("1.Creation_and-insertion\n2.Display\n3.count_of_Nodes\n4.Insertion_At_postion"
		  		+ "\n5.deletion_at_position\n6.searching\n7.sorting\n8.exit ");
		  System.out.println("''''''''''''''''''''''''''''''''''");
		  System.out.println("enter the choice ");
		  System.out.println("'''''''''''''''''''''''''''''''''''");
		  
		  int ch=sc.nextInt();
		  switch(ch)
		  {
		  case 1:
			  create();
			  break;
		  case 2:
			  if(head==null)
			  {
				  System.out.println("Create a Node first");
				  
			  }
			  else {
				  display();
			  }
			  break;
		  case 3 :
			  if(head==null)
			  {
				  System.out.println("Create a Node First");
			  }
			  else {
				  count();
			  }
			  break;
		  case 4:
			  if(head==null)
			  {
				  System.out.println("Craete a node first");
			  }
			  else {
				  System.out.println("Enter the position to insert a node");
				  System.out.println("'''''''''''''''''''''''''''''");
				  int pos=sc.nextInt();
				  int count=count();
				  if(pos>0 && pos<=count+1)
				  {
					  if(pos==1)
					  {
						  InsertionAtBeg();
					  }
					  else if(pos==count+1)
					  {
						  InsertionAtEnd();
					  }
					  else {
						InsertAtPosition(pos);
					}
				  }
				  else {
					  System.out.println("invalid choice");
				  }
			  }
			  break;
		  case 5:
			  if(head==null)
			  {
				  System.out.println("craete a node first");
			  }
			  else {
				  System.out.println("Enter the postion to delete the Node");
				  System.out.println("'''''''''''''''''''''''''''");
				  int pos=sc.nextInt();
				  int count=count();
				  if(pos>0 && pos<=count)
				  {
					  if(pos==1)
					  {
						  deletionAtBeg();
					  }
					  else if(pos==count)
					  {
						  deletionAtEnd();
					  }
					  else {
						  deletionAtPosition(pos);
					  }
				  }
				  else {
					System.out.println("Invalid choice");
				}
				  }
			  break;
		  case 6 :
			  if(head==null)
			  {
				  System.out.println("create the node first");
			  }
			  else {
				  searching();
			  }
			  break;
		  case 7: 
			  if(head==null)
			  {
				  System.out.println("create a node First");
				  
			  }
			  else {
				  sorting();
			  }
			  break;
		  case 8:
			  System.out.println("Thank you !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			  repeat=false;
			  break;
			  default:
				  System.out.println("Enter the vaild choice");
		  }
	  }

	}

}
