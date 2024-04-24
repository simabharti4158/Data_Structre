package com.doublyLinkedlist;

import java.util.Scanner;

public class CreationInsertionTraversing {

	public static void main(String[] args) {
		
		Scanner sc= new  Scanner(System.in);
	     Node head=null,tail=null,prNode=null,temp=null;
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
	    	 else {
	    		 n.adprenode=tail;
	    		 tail.adnextnode=n;
	    		 tail=n;
	    		 
	    	 }
	    	 System.out.println( "Do you want to create another Node\n1.yes\n2.No");
	    	 int ch=sc.nextInt();
	    	 if(ch==1)
	    	 {
	    		 repeat=true;
	    	 }
	    	 else {
	    		 repeat=false;
	    	 }
	    	 
	     }
         
	     //traversing 
	     temp=head;
	     System.out.println("Elements present in node are in forword direction  : ");
	     while(temp!=null)
	     {
	    	 System.out.println(temp.data);
	    	 temp=temp.adnextnode;
	     }
	     //traversing 
	     temp=tail;
	     System.out.println("Elements present in node are in backword direction  : ");
	     while(temp!=null)
	     {
	    	 System.out.println(temp.data);
	    	 temp =temp.adprenode;
	     }
	}

}
