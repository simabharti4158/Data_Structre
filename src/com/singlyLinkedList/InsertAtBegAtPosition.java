package com.singlyLinkedList;

import java.util.Scanner;

public class InsertAtBegAtPosition {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		Node head=null,tail=null,temp=null;
		
	   boolean reapet=true;
	   int nodeNum=1;
	   while(reapet)
	   {
			Node n=new Node();
			System.out.println("Created "+ nodeNum +" Node sucssfully.........................");
			System.out.println("''''''''''''''''''''''''''''''''''''''''''''''");
			System.out.println("Enter the data"); 
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
		    System.out.println("you want to insert the data \n1.yes\n2.no");
		    int choice=sc.nextInt();
		    if(choice==1)
		    {
		    	reapet=true;
		    }
		    else {
		    	reapet=false;
		    }
		    nodeNum++;
	   }
	   // traversing 
	   int count=0;
	   System.out.println("Display the data present in LinkedList  ");
	   System.out.println("-------------------''''''''''''------------------");
	   temp=head;
	   while(temp!=null)
	   {
		   System.out.print( "  "+temp.data );
		   
		   temp=temp.adnextNode;
		   count++;
	   }
	   System.out.println();
	   System.out.println("==================");
	   System.out.println("Total number of nodes in LinkedList : "+count);
	   
	    
	   // Inserting a node at postion
	 
	   
	boolean repeat2=true;
	while(repeat2)
	{
		
		  System.out.println("Enter the postion");
		  int pos=sc.nextInt();
		 
		  if(pos>0 && pos<=count+1)
		  {
			  Node n= new Node();
			  if(pos==1)
			  {
				  System.out.println("enter the data to insert at beg");
				  n.data=sc.nextInt();
				  
				  n.adnextNode=head;
				  head=n;
				  System.out.println("Node inserted beg at successfully");
			  }
			  else {
				  System.out.println("Enter the data  to insert at postion");
				  n.data=sc.nextInt();
				  temp=head;
				   int i=1;
				   while(i<pos-1)
				   {
					temp=temp.adnextNode;
					i++;
				   }
				   n.adnextNode=temp.adnextNode; 
				   temp.adnextNode=n;
				   System.out.println("node inserted At postion successfully");
			  }
				   //traversing 
		

			  System.out.println("after inserting a node at position"); 

			  System.out.println("elements present in the node are:"); 

			  System.out.println("`````````````````````````````````"); 
				   
//				   System.out.println("Display the data present in LinkedList  ");
				   System.out.println("-------------------''''''''''''------------------");
				   count=0;
				   temp=head;
				   while(temp!=null)
				   {
					   System.out.print( "  "+temp.data );
					   
					   temp=temp.adnextNode;
					   count++;
				   }
				   System.out.println();
				   System.out.println("==================");
				   System.out.println("Total number of nodes in LinkedList : "+count);
				   
				   ///
				   System.out.println("''''''''''''''''''''''''''''");
				   System.out.println("do you want to insert the node at postion \n1.yes\n2.No");

				   int ch=sc.nextInt();
				   if(ch==1) {
					   repeat2=true;
				   }
				   else {
					   repeat2=false;
				   }
				   
				  
			  }
			  
		  }
	
	   
	   System.out.println("Display the data present in LinkedList  ");
	   System.out.println("-------------------''''''''''''------------------");
	   count=0;
	   temp=head;
	   while(temp!=null)
	   {
		   System.out.print( "  "+temp.data );
		   
		   temp=temp.adnextNode;
		   count++;
	   }
	   System.out.println();
	   System.out.println("==================");
	   System.out.println("Total number of nodes in LinkedList : "+count);
	   
	
		 
		 
	}
	    

	}


