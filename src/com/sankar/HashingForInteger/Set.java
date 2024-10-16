package com.sankar.HashingForInteger;

public class Set {
	private Node[]a=new Node[10];
	int count=0;
	public boolean add(int k)
	{
		int index=k%10;
		if(a[index]==null)
		{
			a[index]=new Node(k,null);
			count++;
			return true;
		}
		Node prev=null;
		Node curr=a[index];
		while(curr!=null)
		{
			if(k==curr.key)return false;
			prev=curr;
			curr=curr.next;
		}
		prev.next=new Node(k,null);
		count++;
		return true;
	}
	void display()
	{
		for(int i=0;i<a.length;i++)
		{
			Node curr=a[i];
			while(curr!=null)
			{
				System.out.println(curr.key);
				curr=curr.next;
			}
		}
	}
}