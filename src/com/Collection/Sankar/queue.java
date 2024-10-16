package com.Collection.Sankar;

import java.util.PriorityQueue;
import java.util.Queue;

public class queue {
 public static void main(String[] args) {
	Queue q=new PriorityQueue();
	q.add(7);
	q.add(3);
	q.add(5);
	q.add(6);
	while(!q.isEmpty()) {
		System.out.println(q.poll());
	}
}
}
