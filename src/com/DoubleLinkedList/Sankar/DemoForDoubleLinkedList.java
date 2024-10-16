package com.DoubleLinkedList.Sankar;

public class DemoForDoubleLinkedList {
	public static void main(String[] args) {
		DoubleLinkedList l=new DoubleLinkedList();
		l.add(7);
		l.add(77);
		l.add(777);
		l.add(7777);
		l.remove(0);
		l.printNodes();
	}
}
