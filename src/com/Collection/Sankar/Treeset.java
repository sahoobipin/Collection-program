package com.Collection.Sankar;

import java.util.Set;
import java.util.TreeSet;

public class Treeset {
	public static void main(String[] args) {
		Set s=new TreeSet();
		s.add(12);
		s.add(17);
		s.add(7);
		s.add(77);
		s.add(37);
		System.out.println("size="+s.size());
		for(Object o:s)
		{
			System.out.println(o);//It print the datas
		}
	}
}
