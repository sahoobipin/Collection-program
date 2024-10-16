package com.Collection.Sankar;

import java.util.HashSet;
import java.util.Set;

public class set {
	public static void main(String[] args) {
		Set s=new HashSet();
		System.out.println(s.add(20));
		System.out.println(s.add(20));
		System.out.println(s.add(77));
		System.out.println(s.add(77));
		System.out.println("size= "+s.size());
		
		for(Object o:s)
		{
			System.out.println(o);
		}
	}
	
}
