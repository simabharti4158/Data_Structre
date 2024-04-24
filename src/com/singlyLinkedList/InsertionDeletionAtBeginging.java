package com.singlyLinkedList;

import java.util.Scanner;

public class InsertionDeletionAtBeginging {

	public static void main(String[] args) {
		
		// Scanner classes
		Scanner sc = new Scanner(System.in);
		    Node head=null,tail=null,temp=null;
		    
		 boolean reapet=true;
		 while(reapet)
		 {
			   Node n=new Node();
			    System.out.println("Node has been created succssfully : ");
//			    System.out.println(n.data);
//			    System.out.println(n.adnextNode);
			    System.out.println("Enter Data in node ");
			    n.data=sc.nextInt();
			    if(head==null)
			    {
			    	head=n;
			    	tail=n;
			    }
			    tail.adnextNode=n;
			    tail=n;
			    
			    System.out.println("Do you want to insert node in LinkedList \n1.yes\n2.no");
			    int ch=sc.nextInt();
			    if(ch==1)
			    {
			    	reapet=true;
			    }
			    else {
					reapet=false;
				}
			    
		 }
		    // traversing 
		    System.out.println("-------------------Display the data --------------------");
		    temp=head;
		    int count=0;
		    while(temp!=null)
		    {
		    	System.out.print(temp.data+" ");
//		    	System.out.print(temp.adnextNode+ " ====== ' This is address ' ");
		    
		    	count++;
		    	temp=temp.adnextNode;
		    
		    }
		    System.out.println();
		    System.out.println("Total number of node : "+count);
		    
		    // deletion operation 
		   
		   boolean deletion=true;
		   while(deletion)
		   {
			   head=head.adnextNode;
			    // traversing 
			    System.out.println("-------------------Display the data after deletion  at Begigning --------------------");
			   
			    temp=head;
			     count=0;
			    while(temp!=null)
			    {
			    	System.out.print(temp.data+" ");
//			    	System.out.print(temp.adnextNode+ " ====== ' This is address ' ");
			    
			    	count++;
			    	temp=temp.adnextNode;
			    
			    }
			    System.out.println();
			    System.out.println("Total number of node : "+count);
			    System.out.println(" You want to delete  again  1st  node \n1.yes\n2.No");
			    int det=sc.nextInt();
			    if(det==1)
			    {
			    	deletion=true;
			    	
			    }
			    else {
			    	deletion=false;
			    }
			    
			      
		   }
		   
		    
		    

	}

}
