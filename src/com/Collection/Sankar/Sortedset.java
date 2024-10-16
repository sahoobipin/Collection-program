package com.Collection.Sankar;

import java.util.*;

public class Sortedset {
	public static void main(String[] args) {
		SortedSet s=new TreeSet();
		s.add(7);
		s.add(20);
		s.add(17);
		s.add(23);
		s.add(37);
		System.out.println(s);
		System.out.println(s.first());
		System.out.println(s.last());
		
		SortedSet s1=s.headSet(17);
		System.out.println(s1);
		
		SortedSet s2=s.headSet(17);
		System.out.println(s2);
		
		SortedSet s3=s.headSet(23);
		display(s3);
	}
	static void display(Set s)
	{
		for(Object o:s)
		{
			System.out.println(o+" ");
		}
		System.out.println();
	}
}
