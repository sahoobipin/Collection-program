package com.Collection.Sankar;

import java.util.LinkedList;

public class Linkedlist {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(7);
		l.add(77);
		l.add(22);
		l.add(12);
		l.add(43);
		System.out.println(l);
		
		Object[]arr=l.toArray();
		for(Object o:arr)
		{
			System.out.print(o+" ");
		}
	}
}
