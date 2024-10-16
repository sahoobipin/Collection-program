package com.Collection.Sankar;

import java.util.ArrayList;

public class Arraylist {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(23);
		a.add(7);
		a.add(77);
		a.add(20);
		System.out.println(a);
		
		ArrayList a2=new ArrayList();
		a2.add(21);
		a2.add(7);
		a2.add(22);
		a2.add(77);
		System.out.println(a2);
		a.retainAll(a2);//It will print only common data and other will be reomved.
		System.out.println(a);
	}
}
