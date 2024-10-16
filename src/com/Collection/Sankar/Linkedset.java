package com.Collection.Sankar;

import java.util.*;

public class Linkedset {
	public static void main(String[] args) {
		Set s=new LinkedHashSet();
		s.add("sankar");
		s.add("dhoni");
		s.add("raina");
		s.add("jadeja");
		s.add("ruturaj");
		System.out.println("size="+s.size());
		for(Object o:s)
		{
			System.out.println(o);//It print the datas inserting orderly.
		}
	}
}