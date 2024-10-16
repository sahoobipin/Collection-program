package com.sankar.HashingForObject;

public class Set {
	private Node[]a=new Node[10];
	int count=0;
	public boolean add(Object k)
	{
		int index=k.hashCode()%10;
		index=Math.abs(index);
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
			if(k.equals(curr.key))return false;
			//index=Math.abs(index);
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