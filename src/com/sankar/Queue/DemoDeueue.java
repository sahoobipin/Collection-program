package com.sankar.Queue;

public class DemoDeueue {
	public static void main(String[] args) {
		Queue q=new Queue();
	
		q.add(7);
		q.add("sankar");
		q.add(77);
		while(!q.isEmpty()) {
		System.out.println(q.poll());
		}
	}
}
