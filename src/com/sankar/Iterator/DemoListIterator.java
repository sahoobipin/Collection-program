package com.sankar.Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class DemoListIterator {
	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		ListIterator i=l.listIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		while(i.hasPrevious()) {
			System.out.println(i.previous());
		}
	}
}