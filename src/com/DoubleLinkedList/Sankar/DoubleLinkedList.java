package com.DoubleLinkedList.Sankar;

public class DoubleLinkedList {
	private Node first=null;
	private Node last=null;
	private int count=0;
	
	public void add(Object e)
	{
		if(first==null)
		{
			first=new Node(e,null,null);
			last=first;
			count++;
			return;
		}
		last.next=new Node(e, null,last);
		last=last.next;
		count++;
	}
	public int size()
	{
		return count;
	}
	public Object get(int index)
	{
		if(index<=-1 || index>=size())
		{
			throw new IndexOutOfBoundsException();
		}
		Node curr=first;
		for(int i=0;i<index;i++)
		{
			curr=curr.next;
		}
		return curr.ele;
	}
	public void add(int index,Object e) {
		if(index<=-1||index>=size())
			throw new IndexOutOfBoundsException();
		if(index==0) {
			Node n=new Node(e,first,null);
			first.prev=n;
			first=n;
			count++;
			return;
		}
		Node curr=first;
		for(int i=2;i<index;i++) {
			curr=curr.next;
		}
		Node n=new Node(e,curr.next,curr);
		curr.next.prev=n;
		curr.next=n;
	}
	public void remove(int index) {
	    if (index < 0 || index > count-1) {
	    	throw new IndexOutOfBoundsException();
	    }
	    if(index==0) {
	    	first=first.next;
	    	count--;
	    	return;
	    }
	    Node curr = first;
	    int k = 0;
	    while(k < index) {
	        curr = curr.next;
	        k++;
	    }
	    if (curr.prev == null) {
	        curr.next.prev = null;
	    }else if(curr.next == null) {
	        curr = curr.prev;
	        curr.next = null;
	    }else{
	        curr.next.prev = curr.prev;
	        curr.prev.next = curr.next;
	    }           
	    count--;
	}
	public void printNodes() {  
        //Node current will point to head  
        Node curr = first;  
        if(first == null) {  
            System.out.println("Doubly linked list is empty");  
            return;  
        }  
        System.out.println("Nodes of doubly linked list: ");  
        while(curr != null) {  
            //Print each node and then go to next.  
            System.out.print(curr.ele + " ");  
            curr = curr.next;  
        }  
    } 
	public void reverse() {
		Node prev=null;
		Node next=null;
		Node curr=first;
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			curr.prev=next;
			prev=curr;
			curr=next;
		}
		first=prev;
	}
}
