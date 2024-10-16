package com.LinkedList.Sankar;

public class Demo1 {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(10);
		l.add(23);
		l.add(34);
		l.add(45);
		System.out.println(l);
		l.remove(3);
		System.out.println(l);
		System.out.println(l.get(2));
		l.reverse();
		System.out.println(l);
	}
}
