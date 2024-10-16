package com.sankar.Queue;

import java.util.Objects;

public class Queue {
	private Node first=null;
	private Node last=null;
	private int count=0;
	public void add(Object e) {
		if(first==null) {
			first=new Node(e,null);
			last=first;
			count++;
			return;
		}
		last.next=new Node(e,null);
		last=last.next;
		count++;
	}
	public int size() {
		return count;
	}
	public boolean isEmpty() {
		if(size()==0)return true;
		return false;
	}
	public Object poll() {
		if(isEmpty())return null;
		Object ele=first.ele;
		first=first.next;
		count--;
		if(isEmpty())last=null;
		return ele;
	}
	public Object peek() {
		if(isEmpty())return null;
		return first.ele;
	}
	public static void main(String[] args) {
		Queue q=new Queue();
		q.add(7);
		q.add(77);
		q.add(777);
		System.out.println(q.peek());//7
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		System.out.println(q.peek());//null
	}
}