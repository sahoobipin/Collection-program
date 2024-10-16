package com.Collection.Sankar;

import java.util.Collections;
import java.util.LinkedList;

public class SortingList {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(7);
		l.add(74);
		l.add(34);
		l.add(77);
		l.add(17);
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
	}
}
