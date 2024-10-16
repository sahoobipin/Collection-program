package com.Collection.Sankar;
import java.util.*;
public class Hashset {
	public static void main(String[] args) {
		Set s=new HashSet();
		s.add(3);
		s.add(3);
		s.add(1);
		s.add(4);
		s.add(2);
		s.add(5);
		s.add(2);
		System.out.println("size="+s.size());
		
		for(Object o:s)
		{
			System.out.println(o);//It print the datas randomly
		}
	}
}
