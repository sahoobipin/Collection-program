package com.sankar.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DemoIterator {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		c.add(10);
		c.add(20);
		c.add(30);
		Iterator i=c.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
