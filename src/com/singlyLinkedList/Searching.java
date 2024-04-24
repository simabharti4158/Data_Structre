package com.singlyLinkedList;

import java.util.Scanner;

public class Searching {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		Node head=null,tail=null,temp=null;
		boolean reapet=true;
		while(reapet)
		{
			Node n= new Node();
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
			System.out.println("do you want to add the data if \n1.yeah\n2.No ");
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
					System.out.println("Display the data ");
					temp=head;
					while(temp!=null)
					{
						System.out.println(temp.data);
						temp=temp.adnextNode;
					}
     /// searching 
					System.out.println("you want to search the elements ");
					System.out.println("''''''''''''''''''");
					boolean search=true;
					while(search)
					{
						System.out.println("Enter the element to search ");
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
							temp=temp.adnextNode;
						}
						if(ele_found)
						{
							System.out.println("elements found ");
						}
						else {
							System.out.println("Elements Not found ");
						}
						System.out.println("do you want to search \n1.yes\n2.no");
						{
							int peek=sc.nextInt();
							if(peek==1)
							{
								search=true;
							}
							else {
								search=false;
							}
						}
					}
	}

}
